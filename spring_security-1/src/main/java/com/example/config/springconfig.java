package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class springconfig {


	//Core interface which loads user-specific data.
/*	@Bean
	public UserDetailsService userDetailsService() {
		
		UserDetails  admin = User.builder().username("mane").password("123").roles("Admin").build();
		
		UserDetails  user = User.builder().username("user").password("123").roles("User").build();
		
		return new InMemoryUserDetailsManager(admin ,user);
	}*/
}
