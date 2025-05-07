package com.aithinkers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("/leaders")
	public String showLeaders() {
		return "leaders";
	}

}
