package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.orderDetails;
import com.example.service.orderService;

@RestController
public class OrderController {
	
	@Autowired
	private orderService orderService;
	
	@PostMapping
	public ResponseEntity<?> createrder() {
	 orderDetails od=	orderService.createordered();
	 System.out.println("oder details--."+od);
	    orderService.orderCreatedNotifcation(od);
		return ResponseEntity.ok("order created");
	}
	
	
	private void orderNotification() {
		// TODO Auto-generated method stub
		
	}


	@GetMapping("/")
	public String getorder() {
		return "get order";
	}

}
