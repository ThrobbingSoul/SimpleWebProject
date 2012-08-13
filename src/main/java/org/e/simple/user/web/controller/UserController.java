package org.e.simple.user.web.controller;

import org.e.simple.commons.base.web.controller.BaseController;
import org.e.simple.user.model.User;
import org.e.simple.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user*")
public class UserController extends BaseController
{
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/create")
	public void createUser()
	{

		User user = new User();

		user.setUsername("username");
		user.setPassword("password");

		userService.createUser(user);

		super.logger.debug("create user!");

	}

}
