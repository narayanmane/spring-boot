package com.example;

import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.dato.orderInformation;

@Configuration
public class notificationservice {
   // no input 
	
	@Bean
	public Supplier<String> test(){
		return ()->"test";
	} 
	// input and output value 
	
	@Bean
	public Function<String, String> hello(){
		return(msg)->"hello how you are-->"+msg;
	}
	@Bean
	public Function<orderInformation, String> ordernotification(){
		
		return orderInformation->{
			
			sendNotification(orderInformation);
			System.out.println(orderInformation.getEmail());
			System.out.println(orderInformation.getOrderId());
			return orderInformation.getOrderId();
		};
	}

	private void sendNotification(orderInformation orderInformation) {
		// TODO Auto-generated method stub
		System.out.println("Notifiation send");
		
	}
}
