package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.AyncTask;

@RestController
public class AysncController {

	@Autowired
	private AyncTask ayncTask;
	
	@GetMapping("/")
	public String TestAyns() {
		
		System.out.println("Start testaync --"+Thread.currentThread().getName());
		
		ayncTask.TestAysnc();
		System.out.println("End testaync --"+Thread.currentThread().getName());
		
		return "test Async";
	
	}
}
