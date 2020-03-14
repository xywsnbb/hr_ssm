package hr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigMajorKind;
import hr.service.ConfigMajorKindService;
import hr.util.IdMap;

@Controller
@RequestMapping("/configMajorKindController")
public class ConfigMajorKindController {
	@Autowired
	private ConfigMajorKindService service = null;
	
	@RequestMapping("/query.do")
	public String queryConfigMajorKind(Model model) {
		List<ConfigMajorKind> list = service.queryConfigMajorKind();
		model.addAttribute("list", list);
		model.addAttribute("max", list.size());
		
		if (!list.isEmpty()) {
			return "forward:/major_kind.jsp";
		}
		return "redirect:/left.jsp";
	}
	
	@RequestMapping("/delete.do")
	public String deleteConfigMajorKind(@RequestParam("mfk_id") String mfk_id,Model model) {
		int id = Integer.parseInt(mfk_id);
		ConfigMajorKind cmk = service.queryConfigMajorKindById(id);
		model.addAttribute("cmk", cmk);
		
		return "forward:/major_kind_delete.jsp";
	}
	
	@RequestMapping("/remove.do")
	public String removeConfigMajorKind(@RequestParam("mfk_id") String mfk_id) {
		int id = Integer.parseInt(mfk_id);
		boolean falg = service.removeConfigMajorKind(id);
		if (falg) {
			return "redirect:/configMajorKindController/query.do";
		}
		return null;
	}
	
	@RequestMapping("/add.do")
	public String addConfigMajorKind(Model model) {
		Integer id = IdMap.IDMAP.get("mfk_id");
		String major_kind_id = null;
		if (id == null) {
			id = service.queryConfigMajorKindMaxId();
			id++;
			IdMap.IDMAP.put("mfk_id", id);
			if (id < 10) {
				major_kind_id = "0"+id;
			}else {
				major_kind_id = id+"";
			}
			model.addAttribute("mfk_id", id);
			model.addAttribute("major_kind_id", major_kind_id);
			return "forward:/major_kind_register.jsp";
		}
		id++;
		IdMap.IDMAP.put("mfk_id", id);
		if (id < 10) {
			major_kind_id = "0"+id;
		}else {
			major_kind_id = id+"";
		}
		model.addAttribute("mfk_id", id);
		model.addAttribute("major_kind_id", major_kind_id);
		return "forward:/major_kind_register.jsp";
	}
	
	@RequestMapping("/save.do")
	public String saveConfigMajorKind(@ModelAttribute ConfigMajorKind cmk) {
		boolean falg = service.saveConfigMajorKind(cmk);
		if (falg) {
			return "redirect:/major_kind_register_success.jsp";
		}
		
		return "redirect:/configMajorKindController/query.do";
	}
}
