package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class Homecontroller {
	
	
	@PostMapping("/login")
	public String login() {
		
		return "login";
	}

	
	@PostMapping("/create")
	public String create() {
		
		return "create";
	}
	
	@PostMapping("/auth/v1")
	public String auth() {
		
		return "auth";
	}
}
