package com.project.controller;

import com.project.model.User;
import com.project.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {

	private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		LOGGER.info("userId:｛｝", userId);
		User user = new User();
		if (userId == 1) {
			user.setId(1);
			user.setUserName("test1");
			user.setAge(18);
			user.setPassword("root123");
		}
		LOGGER.debug(user.toString());
		return "user/user";
	}

	@RequestMapping(value = "/showUser", method = RequestMethod.GET)
	public String getUserById(HttpServletRequest request, Model model) {
		Integer userId = Integer.parseInt(request.getParameter("id"));
		if (userId == null) {
			return "index";
		}
		System.out.println("ceshi222");
		User user = userService.getUserById(userId);
		model.addAttribute("user", user);
		return "user/showUser";
	}

	@RequestMapping(value = "/showUserAll", method = RequestMethod.GET)
	public String getUserAll(HttpServletRequest request, Model model) {
		List<User> userList = userService.getUserAll();
		model.addAttribute("userList", userList);
		return "user/showAll";
	}

}
