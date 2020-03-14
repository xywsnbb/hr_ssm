package hr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.ConfigFileSecondKind;
import hr.pojo.ConfigFileThirdKind;
import hr.service.ConfigFileThirdKindService;
import hr.util.IdMap;

@Controller
@RequestMapping("/configfilethirdkind")
public class ConfigFileThirdKindController {
	@Autowired
	private ConfigFileThirdKindService service = null;
	
	@RequestMapping("/query.do")
	public String queryConfigFileThirdKind(Model model) {
		List<ConfigFileThirdKind> list = service.queryConfigFileThirdKind();
		model.addAttribute("list", list);
		model.addAttribute("max", list.size());
		
		if (!list.isEmpty()) {
			return "forward:/third_kind.jsp";
		}
		return "redirect:/left.jsp";
	}
	
	@RequestMapping("/change.do")
	public String changeConfigFileThirdKind(@RequestParam("ftk_id") String ftk_id,Model model) {
		int id = Integer.parseInt(ftk_id);
		ConfigFileThirdKind cftk = queryConfigFileThirdKindById(id);
		model.addAttribute("cftk", cftk);
		
		return "forward:/third_kind_change.jsp";
	}
	
	@RequestMapping("/update.do")
	public String modifyConfigFileThirdKind(@ModelAttribute ConfigFileThirdKind cftk) {
		boolean falg = service.modifyConfigFileThirdKind(cftk);
		if (falg) {
			return "redirect:/third_kind_change_success.jsp";
		}
		return "forward:/configfilethirdkind/query.do";
	}
	
	@RequestMapping("/delete.do")
	public String deleteConfigFileThirdKind(@RequestParam("ftk_id") String ftk_id,Model model) {
		int id = Integer.parseInt(ftk_id);
		ConfigFileThirdKind cftk = queryConfigFileThirdKindById(id);
		model.addAttribute("cftk", cftk);
		
		return "forward:/third_kind_delete.jsp";
	}
	
	@RequestMapping("/remove.do")
	public String removeConfigFileThirdKind(@RequestParam("ftk_id") String ftk_id) {
		int id = Integer.parseInt(ftk_id);
		boolean falg = service.removeConfigFileThirdKindById(id);
		if (falg) {
			return "redirect:/configfilethirdkind/query.do";
		}
		return null;
	}
	
	@RequestMapping("/add.do")
	public String addConfigFileSecondKind(Model model) {
		Integer id = IdMap.IDMAP.get("ftk_id");
		if (id == null) {
			id = service.queryConfigFileThirdKindMaxId();
			id++;
			IdMap.IDMAP.put("ftk_id", id);
			model.addAttribute("ftk_id", id);
			return "forward:/third_kind_register.jsp";
		}
		id++;
		IdMap.IDMAP.put("ftk_id", id);
		model.addAttribute("ftk_id", id);
		return "forward:/third_kind_register.jsp";
	}
	
	@RequestMapping("/save.do")
	public String saveConfigFileSecondKind(@ModelAttribute ConfigFileThirdKind cftk) {
		boolean falg = service.saveConfigFileThirdKind(cftk);
		if (falg) {
			return "redirect:/third_kind_register_success.jsp";
		}
		return "forward:/configfilethirdkind/query.do";
	}
	
	public ConfigFileThirdKind queryConfigFileThirdKindById(int id) {
		ConfigFileThirdKind cftk = service.queryConfigFileThirdKindById(id);
		return cftk;
	}
}
