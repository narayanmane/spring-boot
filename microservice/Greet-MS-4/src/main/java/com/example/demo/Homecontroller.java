package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Homecontroller {
	@Autowired
	private Myfeignclient fc;
	
    @GetMapping("/greet")
	public String getwelcome() {
    String msg	=fc.getwelcome();
		return "good morning  to MS-->"+msg;
	}
}

