package hr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.pojo.ConfigQuestionFirstKind;
import hr.service.ConfigQuestionFirstKindService;
import hr.util.IdMap;

@Controller
@RequestMapping("/configQuestionFirstKind")
public class ConfigQuestionFirstKindController {
	@Autowired
	private ConfigQuestionFirstKindService service = null;
	
	@RequestMapping("/save.do")
	public String saveConfigQuestionFirstKind(@ModelAttribute ConfigQuestionFirstKind configQuestionFirstKind) {
		int max = 0;
		if(IdMap.IDMAP.get("Qfk_id")==null) {
			max = getMaxId();
		}else {
			max = IdMap.IDMAP.get("Qfk_id");
		}
		IdMap.IDMAP.put("Qfk_id", max+1);
		String First_kind_id = null;
		if(max+1 >= 10) {
			First_kind_id = String.valueOf(max+1);
		}else {
			First_kind_id = "0"+(max+1);
		}
		configQuestionFirstKind.setQfk_id(IdMap.IDMAP.get("Qfk_id"));
		configQuestionFirstKind.setFirst_kind_id(First_kind_id);
		boolean flag = service.addQuestionFirstKind(configQuestionFirstKind);
		if(flag) {
			return "redirect:/question_first_kind_register_success.jsp";
		}else {
			return "redirect:/question_first_kind_register.jsp";
		}
	}
	
	/*@RequestMapping("/getMaxId")*/
	public int getMaxId() {
		/*int max = */
		Integer max = service.queryMaxId();
		if(max == null) {
			return 0;
		}else {
			return max;
		}
	}
	
	@RequestMapping("/update.do")
	public String updateConfigQuestionFirstKind(@ModelAttribute ConfigQuestionFirstKind configQuestionFirstKind) {
		boolean flag = service.modifyQuestionFirstKind(configQuestionFirstKind);
		if(flag) {
			return "redirect:/question_first_kind_change_success.jsp";
		}else {
			return "redirect:/question_first_kind_change.jsp";
		}
	}
	
	/*@RequestMapping("/selectAll.do")
	public String selectAll(Model model) {
		List<ConfigQuestionFirstKind> list = service.queryAllConfigQuestionFirstKind();
		model.addAttribute("list", list);
		return "forward:/show.jsp";
	}
	*/
	@RequestMapping(value="/selectAll.do",method=RequestMethod.POST)
	@ResponseBody
	public List selectAll() {
		List<ConfigQuestionFirstKind> list = service.queryAllConfigQuestionFirstKind();
		//model.addAttribute("list", list);
		
		return list;
	}
	
	@RequestMapping(value = "/{qfk_id}/selectOne.do", method=RequestMethod.POST)
	@ResponseBody
	public ConfigQuestionFirstKind selectOne(@PathVariable("qfk_id") int qfk_id) {
		ConfigQuestionFirstKind configQuestionFirstKind = service.queryConfigQuestionFirstKindById(qfk_id);
		return configQuestionFirstKind;
	}
	
	@RequestMapping("/{qfk_id}/delete.do")
	public String delete(@PathVariable("qfk_id") int qfk_id) {
		boolean flag = service.removeConfigQuestionFirstKindById(qfk_id);
		/*if(flag) {
			String str = null;
			if(qfk_id > 10) {
				str= String.valueOf(qfk_id);
			}else {
				str = qfk_id + "";
			}
			IdMap.firstQuestionMAP.remove(str);
		}*/
		return "redirect:/question_first_kind.jsp";
	}
}
