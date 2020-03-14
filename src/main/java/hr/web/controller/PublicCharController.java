package hr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.pojo.Config_public_char;
import hr.service.Config_public_charService;
import hr.util.IdMap;

@Controller
@RequestMapping("/publicCharController")
public class PublicCharController {
	@Autowired
	private Config_public_charService service = null;
	
	@RequestMapping("/query.do")
	public String queryPublicChar(Model model) {
		List<Config_public_char> list = service.queryNotConfig_public_charKind();
		model.addAttribute("list", list);
		model.addAttribute("max", list.size());
		
		if (!list.isEmpty()) {
			return "forward:/public_char.jsp";
		}
		return "redirect:/left.jsp";
	}
	
	@RequestMapping("/delete.do")
	public String deleteProfessionDesign(@RequestParam("pbc_id") String pbc_id,Model model) {
		int id = Integer.parseInt(pbc_id);
		Config_public_char cpc = service.queryConfig_public_charById(id);
		model.addAttribute("cpc", cpc);
		return "forward:/public_char_delete.jsp";
	}
	
	@RequestMapping("/remove.do")
	public String removeProfessionDesign(@RequestParam("pbc_id") String pbc_id) {
		int id = Integer.parseInt(pbc_id);
		boolean falg = service.removeConfig_public_charById(id);
		if (falg) {
			return "redirect:/publicCharController/query.do";
		}
		return null;
	}
	
	@RequestMapping("/add.do")
	public String addProfessionDesign(Model model) {
		Integer id = IdMap.IDMAP.get("pbc_id");
		if (id == null) {
			id = service.queryConfig_public_charMaxId();
			id++;
			IdMap.IDMAP.put("pbc_id", id);
			model.addAttribute("pbc_id", id);
			return "forward:/public_char_register.jsp";
		}
		id++;
		IdMap.IDMAP.put("pbc_id", id);
		model.addAttribute("pbc_id", id);
		return "forward:/public_char_register.jsp";
	}
	
	@RequestMapping("/save.do")
	public String saveProfessionDesign(@ModelAttribute Config_public_char cpc) {
		System.out.println(cpc.getAttribute_name()+""+cpc.getPbc_id()+""+cpc.getAttribute_kind());
		service.saveConfig_public_char(cpc);
		
		return "redirect:/public_char_success.jsp";
	}
}
