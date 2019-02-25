package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookStoreAppController {
	@RequestMapping(value="/myaccount")
	public String myAccount(Model model) {
		model.addAttribute("activeMyAccount",true);
		return "myAccount";
	}
	

	@RequestMapping(value="/login")
	public String login(Model model) {
		model.addAttribute("classActiveLogin",true);
		return "myAccount";
	}
	
	@RequestMapping(value="/newuser")
	public String newUser(Model model) {
		model.addAttribute("classActiveNewUser",true);
		return "myAccount";
	}
	@RequestMapping(value="/forgetpassword")
	public String forgetPassword(Model model) {
		model.addAttribute("classActiveForgetPassword",true);
		return "myAccount";
	}
	
	
	
}
