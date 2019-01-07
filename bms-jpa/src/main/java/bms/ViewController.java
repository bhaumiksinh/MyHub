package bms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ViewController {
	
	@Autowired
	private UserServices userService;

	@ResponseBody
	@RequestMapping("hello")
	public String hello() {
		return "hello bapu";
	}
	
	@ResponseBody
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView("welcome");
		return mv;
		
	}
	
	@GetMapping("/save-user")
	public String saveUser(
			@RequestParam String uname,
			@RequestParam String first,
			@RequestParam String last,
			@RequestParam int age,
			@RequestParam String pass) {
		User user = new User(first,last,uname,age,pass);
		userService.saveMyUser(user); 
		return "usr saved";
	}
}
