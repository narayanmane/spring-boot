package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DbConnection {

	@Autowired(required = false)
	private MysqlConecction mysqlConecction;
	
	@Autowired(required = false)
	private NosqlConnection nosqlConnection;
	
	@PostConstruct
	public void init() {
		System.out.println("mysql bean ->"+mysqlConecction);
		System.out.println("nomysql bean ->"+nosqlConnection);
	}
}

