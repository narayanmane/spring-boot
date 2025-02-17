package com.example.loggin;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

	@Before("execution(public void com.example.service.UserService.Login())")
	public void LoggingAdvice1() {
		System.out.println("Before advice for login is executed");
	}
	
	@After("execution(public void com.example.service.UserService.Login())")
	public void LoggingAdvice2() {
		System.out.println("after advice for login is executed");
	}
}
