package com.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "MysqlConecction",value = "enabled",havingValue = "true",matchIfMissing = false)
public class MysqlConecction {

	public MysqlConecction() {
		System.out.println("init mysql connection");
	}
	

}
