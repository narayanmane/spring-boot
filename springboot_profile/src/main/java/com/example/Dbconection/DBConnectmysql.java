package com.example.Dbconection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Profile("dev")

public class DBConnectmysql {

	@Value("${password}")
	String password;
	
	@Value("${uname}")
	String uname;
	
	Logger logger = LoggerFactory.getLogger(DBConnectmysql.class);
	@PostConstruct
	public void init() {
		System.out.println("DbConnectmysql init");
		logger.info("DbConnectmysql init");
		logger.debug("DbConnectmysql init");
		logger.warn("DbConnectmysql init");
		logger.trace("DbConnectmysql init");
		
		System.out.println("username->"+uname+"|password ->"+password);
	}
}
