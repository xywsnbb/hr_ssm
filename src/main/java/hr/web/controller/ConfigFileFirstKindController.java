package hr.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigFileFirstKind;
import hr.pojo.ConfigFileSecondKind;
import hr.pojo.ConfigQuestionFirstKind;
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigFileSecondKindService;
import hr.util.IdMap;

@Controller
@RequestMapping("/configfilefirstkind")
public class ConfigFileFirstKindController {
	@Autowired
	private ConfigFileFirstKindService service = null;
	
	@RequestMapping("/query.do")
	public String queryConfigFileFirstKind(Model model) {
		List<ConfigFileFirstKind> list = service.queryConfigFileFirstKind();
		model.addAttribute("list", list);
		model.addAttribute("max", list.size());
		
		if (!list.isEmpty()) {
			return "forward:/first_kind.jsp";
		}
		return "redirect:/left.jsp";
	}
	
	@RequestMapping("/change.do")
	public String changeConfigFileFirstKind(@RequestParam("ffk_id") String ffk_id,Model model) {
		int id = Integer.parseInt(ffk_id);
		ConfigFileFirstKind cffk = queryConfigFileFirstKindById(id);
		model.addAttribute("cffk", cffk);
		
		return "forward:/first_kind_change.jsp";
	}
	
	@RequestMapping("/update.do")
	public String modifyConfigFileFirstKind(@ModelAttribute ConfigFileFirstKind cffk) {
		boolean falg = service.modifyConfigFileFirstKind(cffk);
		if (falg) {
			return "redirect:/first_kind_change_success.jsp";
		}
		return "forward:/configfilefirstkind/query.do";
	}
	
	@RequestMapping("/delete.do")
	public String deleteConfigFileFirstKind(@RequestParam("ffk_id") String ffk_id,Model model) {
		int id = Integer.parseInt(ffk_id);
		ConfigFileFirstKind cffk = queryConfigFileFirstKindById(id);
		model.addAttribute("cffk", cffk);
		
		return "forward:/first_kind_delete.jsp";
	}
	
	@RequestMapping("/remove.do")
	public String removeConfigFileFirstKind(@RequestParam("ffk_id") String ffk_id) {
		int id = Integer.parseInt(ffk_id);
		boolean falg = service.removeConfigFileFirstKindById(id);
		if (falg) {
			return "redirect:/configfilefirstkind/query.do";
		}
		return null;
	}
	
	@RequestMapping("/add.do")
	public String addConfigFileFirstKind(Model model) {
		Integer id = IdMap.IDMAP.get("ffk_id");
		String first_kind_id = null;
		if (id == null) {
			id = service.queryConfigFileFirstKindMaxId();
			id++;
			IdMap.IDMAP.put("ffk_id", id);
			first_kind_id = "0"+id;
			model.addAttribute("ffk_id", id);
			model.addAttribute("first_kind_id", first_kind_id);
			return "forward:/first_kind_register.jsp";
		}
		id++;
		IdMap.IDMAP.put("ffk_id", id);
		first_kind_id = "0"+id;
		model.addAttribute("ffk_id", id);
		model.addAttribute("first_kind_id", first_kind_id);
		return "forward:/first_kind_register.jsp";
	}
	
	@RequestMapping("/save.do")
	public String saveConfigFileFirstKind(@ModelAttribute ConfigFileFirstKind cffk) {
		boolean falg = service.saveConfigFileFirstKind(cffk);
		if (falg) {
			return "redirect:/first_kind_register_success.jsp";
		}
		return "redirect:/configfilefirstkind/query.do";
	}
	
	
	public ConfigFileFirstKind queryConfigFileFirstKindById(int id) {
		ConfigFileFirstKind cffk = service.queryConfigFileFirstKindById(id);
		return cffk;
	}
}
