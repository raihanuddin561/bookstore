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
}
