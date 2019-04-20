package com.xiajw.ssmSimple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xiajw.ssmSimple.pojo.User;
import com.xiajw.ssmSimple.service.UserService;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home(Model model) {
		List<User> list = userService.getAllUser();
		model.addAttribute("userList",list);
		return "test";
	}
}
