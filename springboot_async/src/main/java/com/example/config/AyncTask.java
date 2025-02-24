package com.example.config;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AyncTask {
	@Async
	public void TestAysnc() {
		System.out.println("async task executed by thread-"+Thread.currentThread().getName());
	}

}
