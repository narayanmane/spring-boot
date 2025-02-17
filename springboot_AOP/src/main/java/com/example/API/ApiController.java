package com.example.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;

@RestController
public class ApiController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String userlogin() {
		
		userService.Login();
		return "user loggin";
	}

}
