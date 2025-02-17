package com.example.Dbconection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Dbconnect {
	

	
	@Value("${password}")
	String password;
	
	@Value("${uname}")
	String uname;
	
	@PostConstruct
	public void init() {
		System.out.println("DbConnect init");
		System.out.println("username->"+uname+"|password ->"+password);
	}
}
