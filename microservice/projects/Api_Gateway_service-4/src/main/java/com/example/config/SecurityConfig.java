package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

	@Bean
	public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity httpsecurity) {
		httpsecurity.authorizeExchange()
		.anyExchange()
		.authenticated()
		.and()
		.oauth2Client()
		.and()
		.oauth2ResourceServer()
		.jwt();
		return httpsecurity.build();
	}
}
