package hr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.RequestMethod;

import hr.pojo.User;
import hr.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	//要使用service
	@Autowired
	private UserService service = null;
	
	@RequestMapping("/saveUser.do")
	public String saveUser(@ModelAttribute User user) {
		boolean flag = service.addUser(user);
		if(flag) {
			return "redirect:/user/selectAll.do";
		}else {
			/*如果是redirect:index.jsp，会跳转到 工程名/user/index.jsp
			以下的“/”不代表端口，而是绝对路径*/
			return "redirect:/index.jsp";
		}
	}
	/*@ModelAttribute
	 * 用在方法上面，默认保存string
	 * */
	@RequestMapping("/selectAll.do")
	public String selectAll(Model model) {
		
		List<User> list = service.queryAllUser();
		model.addAttribute("list",list);
		return "forward:/show.jsp";
	}
	
	//这个使用ajax操作(响应的数据不进行页面的跳转)
	@RequestMapping(value="/{u_id}/selectOne.do",method=RequestMethod.POST)
	@ResponseBody
	public User selectOne(@PathVariable("u_id") int u_id) {
		User user = service.queryUserByUid(u_id);
		return user;
	}
	
	@RequestMapping("/{u_id}/delete.do")
	public String delete(@PathVariable("u_id") int u_id) {
		boolean flag = service.removeUserByUid(u_id);
		//如果直接调用方法return selectAll() 数据可能重复提交
		return "redirect:/user/selectAll.do";
	}
}
