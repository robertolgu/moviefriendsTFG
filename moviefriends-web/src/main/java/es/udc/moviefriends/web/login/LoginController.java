package es.udc.moviefriends.web.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String index(Model model, @RequestParam(value="name", required=false, defaultValue="World")String name){
		model.addAttribute("name",name);
		return "login";
	}
	
	
}
