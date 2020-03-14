package hr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigFileFirstKind;
import hr.pojo.ConfigFileSecondKind;
import hr.service.ConfigFileFirstKindService;
import hr.service.ConfigFileSecondKindService;
import hr.util.IdMap;

@Controller
@RequestMapping("/configfilesecondkind")
public class ConfigFileSecondKindController {
	@Autowired
	private ConfigFileSecondKindService service = null;
	@Autowired
	private ConfigFileFirstKindService firstService = null;

	@RequestMapping("/query.do")
	public String queryConfigFileSecondKind(Model model) {
		List<ConfigFileSecondKind> list = service.queryConfigFileSecondKind();
		model.addAttribute("list", list);
		model.addAttribute("max", list.size());
		
		if (!list.isEmpty()) {
			return "forward:/second_kind.jsp";
		}
		return "redirect:/left.jsp";
	}
	
	@RequestMapping("/change.do")
	public String changeConfigFileSecondKind(@RequestParam("fsk_id") String fsk_id,Model model) {
		int id = Integer.parseInt(fsk_id);
		ConfigFileSecondKind cfsk = queryConfigFileSecondKindById(id);
		model.addAttribute("cfsk", cfsk);
		System.out.println(cfsk.getSecond_kind_name());
		
		return "forward:/second_kind_change.jsp";
	}
	
	@RequestMapping("/update.do")
	public String modifyConfigFileSecondKind(@ModelAttribute ConfigFileSecondKind cfsk) {
		boolean falg = service.modifyConfigFileThirdKind(cfsk);
		if (falg) {
			return "redirect:/second_kind_change_success.jsp";
		}
		return "forward:/configfilesecondkind/query.do";
	}
	
	@RequestMapping("/delete.do")
	public String deleteConfigFileSecondKind(@RequestParam("fsk_id") String fsk_id,Model model) {
		int id = Integer.parseInt(fsk_id);
		ConfigFileSecondKind cfsk = queryConfigFileSecondKindById(id);
		model.addAttribute("cfsk", cfsk);
		
		return "forward:/second_kind_delete.jsp";
	}
	
	@RequestMapping("/remove.do")
	public String removeConfigFileSecondKind(@RequestParam("fsk_id") String fsk_id) {
		int id = Integer.parseInt(fsk_id);
		boolean falg = service.removeConfigFileSecondKindById(id);
		if (falg) {
			return "redirect:/configfilesecondkind/query.do";
		}
		return null;
	}
	
	@RequestMapping("/add.do")
	public String addConfigFileSecondKind(Model model) {
		Integer id = IdMap.IDMAP.get("fsk_id");
		List<ConfigFileFirstKind> flist = firstService.queryConfigFileFirstKind();
		model.addAttribute("flist", flist);
		if (id == null) {
			id = service.queryConfigFileSecondKindMaxId();
			id++;
			IdMap.IDMAP.put("fsk_id", id);
			model.addAttribute("fsk_id", id);
			return "forward:/second_kind_register.jsp";
		}
		id++;
		IdMap.IDMAP.put("fsk_id", id);
		model.addAttribute("fsk_id", id);
		return "forward:/second_kind_register.jsp";
	}
	
	@RequestMapping("/save.do")
	public String saveConfigFileSecondKind(@ModelAttribute ConfigFileSecondKind cfsk) {
		boolean falg = service.saveConfigFileSecondKind(cfsk);
		if (falg) {
			return "redirect:/second_kind_register_success.jsp";
		}
		return "forward:/configfilesecondkind/query.do";
	}
	
	public ConfigFileSecondKind queryConfigFileSecondKindById(int id) {
		ConfigFileSecondKind cfsk = service.queryConfigFileSecondKindById(id);
		return cfsk;
	}
}
