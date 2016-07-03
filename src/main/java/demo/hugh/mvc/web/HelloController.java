package demo.hugh.mvc.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.hugh.mvc.po.User;
import demo.hugh.mvc.service.UserService;

@RestController
@RequestMapping("/test")
public class HelloController {

	Logger log = Logger.getLogger(HelloController.class);

	@Resource
	UserService userServiceImpl;

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String genTCParam(Model model, HttpServletRequest request, @PathVariable(value = "name") String name) {

		User user = userServiceImpl.getUserByName(name);
		if (user == null) {
			log.error("用户" + name + "未找到");
			return "用户" + name + "未找到";
		} else {
			log.info("你好, " + user.getUserName());
			return "你好," + user.getUserName();
		}
	}

}
