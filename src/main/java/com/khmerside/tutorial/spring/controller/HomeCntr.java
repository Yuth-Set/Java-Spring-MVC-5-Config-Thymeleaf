package com.khmerside.tutorial.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCntr {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("message","Welcome to KhmerSide Tutorail : Spring MVC 5 config with Thymeleaf...");
		return "home";
	}
}
