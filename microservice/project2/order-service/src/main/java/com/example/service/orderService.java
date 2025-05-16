package com.example.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class orderService {

	public orderDetails createordered() {
		// TODO Auto-generated method stub
		orderDetails ord= new orderDetails();
		ord.setOrderid(UUID.randomUUID().toString());
		ord.setEmail("mane@gamil.com");
		ord.setAddress("Latur");
		ord.setName("ABC");
		ord.setUserid(123);
		ord.setPayment(false);
		ord.setOrderstatus(true);
		
		// save in db 
		
		return ord;
		
		
	}
	@Autowired
   private StreamBridge streamBridge;
	public void orderCreatedNotifcation(orderDetails od) {
		// TODO Auto-generated method stub
		boolean send=streamBridge.send("orderCreatedEvent-out-0", od);
		if(send) {
			System.out.println("event is successfully send to notification");
		}
		else {
			System.out.println("event fail");
		}
		
	}

}
