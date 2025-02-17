package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


// register interceptor
@Configuration
public class Webconfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new Logininterceptor())
		.addPathPatterns("/api/**")
		.excludePathPatterns("/api/auth/**");
		
	}
	

}
