package com.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "NosqlConnection",value = "enabled",havingValue = "true",matchIfMissing = false)

public class NosqlConnection {

	public NosqlConnection() {
		System.out.println("nosqlconnection init ");
	}

	
}
