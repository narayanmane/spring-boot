package com.example.function;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.dato.orderDetails;

@Configuration
public class orderrealatedNotification {

	@Bean
	public Function<orderDetails, String>orderEventReceive(){
		return (orderDetails->{
			System.out.println("Sending notification to user ");
			logicTosendEmailAndMagToUser(orderDetails.getEmail(),orderDetails);
			return orderDetails.getOrderid();
		});
	}

	private void logicTosendEmailAndMagToUser(String email, orderDetails orderDetails) {
		// TODO Auto-generated method stub
		
		System.out.println("send to email"+email);
		
	}
}
