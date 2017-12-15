package demo.hugh.mvc.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import demo.hugh.mvc.bean.BaseResBean;
import demo.hugh.mvc.po.User;
import demo.hugh.mvc.service.UserService;

@RestController
@RequestMapping("/sys")
public class LoginController {

	Logger log = LoggerFactory.getLogger(HelloController.class);

	@Resource
	UserService userServiceImpl;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Object login_post(Model model, HttpServletRequest request,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) String pwd) {

		log.debug("---请求参数: {}", JSON.toJSONString(request.getParameterMap()));
		BaseResBean res = new BaseResBean("S0000000", "登录成功");

		User user = userServiceImpl.getUserByName(name);
		if (user == null) {
			log.error("用户" + name + "未找到");
			res.setCode("E9999999");
			res.setMsg("登录失败,用户名或密码错误");
			return res;
		} else if (user.getPassword().equals(pwd)) {
			log.info("你好, " + user.getUserName());
			return res;
		} else {
			res.setCode("E9999999");
			res.setMsg("登录失败,用户名或密码错误");
			return res;
		}
	}

}
