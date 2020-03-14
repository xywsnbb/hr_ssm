package hr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigMajor;
import hr.pojo.ConfigMajorKind;
import hr.service.ConfigMajorKindService;
import hr.service.ConfigMajorService;
import hr.util.IdMap;

@Controller
@RequestMapping("/configMajorController")
public class ConfigMajorController {
	@Autowired
	private ConfigMajorService service = null;
	@Autowired
	private ConfigMajorKindService mkservice = null;
	
	@RequestMapping("/query.do")
	public String queryConfigMajor(Model model) {
		List<ConfigMajor> list = service.queryConfigMajor();
		model.addAttribute("list", list);
		model.addAttribute("max", list.size());
		if (!list.isEmpty()) {
			return "forward:/major.jsp";
		}
		return "redirect:/left.jsp";
	}
	
	@RequestMapping("/delete.do")
	public String deleteConfigMajor(@RequestParam("mak_id") String mak_id,Model model) {
		int id = Integer.parseInt(mak_id);
		ConfigMajor cm = service.queryConfigMajorById(id);
		model.addAttribute("ConfigMajor", cm);
		
		return "forward:/major_delete.jsp";
	}
	
	@RequestMapping("/remove.do")
	public String removeConfigMajor(@RequestParam("mak_id") String mak_id) {
		int id = Integer.parseInt(mak_id);
		boolean falg = service.removeConfigMajorById(id);
		if (falg) {
			return "redirect:/configMajorController/query.do";
		}
		
		return null;
	}
	
	@RequestMapping("/add.do")
	public String addConfigMajor(Model model) {
		Integer id = IdMap.IDMAP.get("mak_id");
		List<ConfigMajorKind> list = mkservice.queryConfigMajorKind();
		model.addAttribute("list", list);
		if (id == null) {
			id = service.queryConfigMajorMaxId();
			id++;
			IdMap.IDMAP.put("mak_id", id);
			model.addAttribute("mak_id", id);
			return "forward:/major_register.jsp";
		}
		id++;
		IdMap.IDMAP.put("mak_id", id);
		model.addAttribute("mak_id", id);
		return "forward:/major_register.jsp";
	}
	
	@RequestMapping("/save.do")
	public String saveConfigMajor(@ModelAttribute ConfigMajor cm) {
		boolean falg = service.saveConfigMajor(cm);
		if (falg) {
			return "redirect:/major_register_success.jsp";
		}
		return "redirect:/configMajorController/query.do";
	}
}
