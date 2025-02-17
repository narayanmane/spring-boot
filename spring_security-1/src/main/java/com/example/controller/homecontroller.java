package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller {
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	
	@GetMapping("/admin/home")
	public String aminhome() {
		return "admin_home";
	}
	@GetMapping("/user/home")
	public String userhome() {
		return "user_home";
	}

}
