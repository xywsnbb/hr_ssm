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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import hr.pojo.ConfigQuestionFirstKind;
import hr.pojo.ConfigQuestionSecondKind;
import hr.service.ConfigQuestionFirstKindService;
import hr.service.ConfigQuestionSecondKindService;
import hr.util.IdMap;

@Controller
@RequestMapping("/configQuestionSecondKind")
public class ConfigQuestionSecondKindController {
	@Autowired
	private ConfigQuestionSecondKindService service = null;
	@Autowired
	private ConfigQuestionFirstKindService serviceFirst = null;
	
	@RequestMapping("/save.do")
	public String saveConfigQuestionSecondKind(@ModelAttribute ConfigQuestionSecondKind configQuestionSecondKind) {
		int max = 0;
		if(IdMap.IDMAP.get("qsk_id")==null) {
			max = getMaxId();
		}else {
			max = IdMap.IDMAP.get("qsk_id");
		}
		IdMap.IDMAP.put("qsk_id", max+1);
		String second_kind_id = null;
		if(max+1 >= 10) {
			second_kind_id = String.valueOf(max+1);
		}else {
			second_kind_id = "0"+(max+1);
		}
		configQuestionSecondKind.setQsk_id(IdMap.IDMAP.get("qsk_id"));
		configQuestionSecondKind.setSecond_kind_id(second_kind_id);
		boolean flag = service.addQuestionSecondKind(configQuestionSecondKind);
		if(flag) {
			return "redirect:/question_second_kind_register_success.jsp";
		}else {
			return "redirect:/question_second_kind_register.jsp";
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
	public String updateConfigQuestionSecondKind(@ModelAttribute ConfigQuestionSecondKind configQuestionSecondKind,Model model) {
		getModel(model);
		boolean flag = service.modifyQuestionSecondKind(configQuestionSecondKind);
		if(flag) {
			return "forward:/question_second_kind_change_success.jsp";
		}else {
			return "forward:/question_second_kind_change.jsp";
		}
	}
	
	@RequestMapping("/updateModel.do")
	public String updateModel(Model model) {
		getModel(model);
		return "forward:/question_second_kind_change.jsp";
	}
	/*@RequestMapping("/selectAll.do")
	public String selectAll(Model model) {
		List<ConfigQuestionSecondKind> list = service.queryAllConfigQuestionSecondKind();
		model.addAttribute("list", list);
		return "forward:/show.jsp";
	}
	*/
	
	@RequestMapping(value="/selectAll.do",method=RequestMethod.POST)
	@ResponseBody
	public List selectAll(Model model) {
		System.out.println("selectAll");
		List<ConfigQuestionSecondKind> list = service.queryAllConfigQuestionSecondKind();
		return list;
	}
	
	@RequestMapping("/selectFirstKind.do")
	public String selectFirstKind(Model model) {
		getModel(model);
		return "forward:/question_second_kind_register.jsp";
	}
	
	public void getModel(Model model) {
		List<ConfigQuestionFirstKind> list = serviceFirst.queryAllConfigQuestionFirstKind();
		Map map = new HashMap();
		for (ConfigQuestionFirstKind configQuestionFirstKind : list) {
			map.put(configQuestionFirstKind.getFirst_kind_id(), configQuestionFirstKind.getFirst_kind_name());
		}
		model.addAttribute("mapFirstKind", map);
	}
	
	@RequestMapping(value = "/{qsk_id}/selectOne.do", method=RequestMethod.POST)
	@ResponseBody
	public ConfigQuestionSecondKind selectOne(@PathVariable("qsk_id") int qsk_id) {
		ConfigQuestionSecondKind configQuestionsecondtKind = service.queryConfigQuestionSecondKindById(qsk_id);
		return configQuestionsecondtKind;
	}
	
	@RequestMapping("/{qsk_id}/delete.do")
	public String delete(@PathVariable("qsk_id") int qsk_id) {
		boolean flag = service.removeConfigQuestionSecondKindById(qsk_id);
		return "redirect:/question_second_kind.jsp";
	}
	
	@RequestMapping("/linkageSelect.do")
	public List linkageSelect() {
		return service.linkageSelect();
	}
}
