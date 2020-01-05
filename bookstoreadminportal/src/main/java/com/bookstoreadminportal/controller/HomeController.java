package com.bookstoreadminportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homePage() {
		return "redirect:/home";
	}
	@RequestMapping("/home")
		public String homeP() {
			return "index";
		}
	
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
}
