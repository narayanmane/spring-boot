package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GreetMs4Application {

	public static void main(String[] args) {
		SpringApplication.run(GreetMs4Application.class, args);
	}

}
