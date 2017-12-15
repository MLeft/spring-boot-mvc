package demo.hugh.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class WelcomeController {

    @RequestMapping("/")
	public String welcome() {
		return "forward:/login.html";
    }
}