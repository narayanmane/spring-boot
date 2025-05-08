package com.example.demo;

import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

import jakarta.validation.constraints.AssertFalse.List;
import jakarta.ws.rs.core.Request;
import reactor.core.publisher.Mono;

public class GatewayFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		System.out.println("filter called...............");
	 ServerHttpRequest req= exchange.getRequest();
	 HttpHeaders header = req.getHeaders();
	 Set<String> keyset= header.keySet();
	 
	 if(!keyset.contains("secret")) {
		 throw new RuntimeException("invalid req");
	 }
	 
		
		 
		 return null;
	}

}
