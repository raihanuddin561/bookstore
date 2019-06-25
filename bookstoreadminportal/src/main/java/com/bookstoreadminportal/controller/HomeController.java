package com.bookstoreadminportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}
	@RequestMapping("/home")
		public String homeP() {
			return "redirect:/";
		}
	
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
}
