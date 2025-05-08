package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	@Autowired
	private Environment env;
    @GetMapping("/welcome")
	public String getwelcome() {
    String po=env.getProperty("server.port");
		return "welcome to MS-->"+po;
	}
}
