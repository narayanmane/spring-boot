package com.example.function;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class notifyorder {

	@Bean
	public Consumer<String>consumeAck(){
		return(str)->{
			System.out.println("after notification service send ->"+str);
		};
	}
}
