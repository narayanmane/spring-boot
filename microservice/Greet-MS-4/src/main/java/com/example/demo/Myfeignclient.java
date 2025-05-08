package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-MS-3")
public interface Myfeignclient {

	@GetMapping("/welcome")
	public String getwelcome();
}
