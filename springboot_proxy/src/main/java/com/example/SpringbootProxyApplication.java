package com.example;




import java.lang.reflect.Proxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringbootProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProxyApplication.class, args);
		Man mane = new Man(10,"mane","latur");
		
		ClassLoader manClassLoader= mane.getClass().getClassLoader();
		Class[] interfaces = mane.getClass().getInterfaces();
		
		Person proxymane = (Person) Proxy.newProxyInstance(manClassLoader, interfaces,  new PersonInvocationHandler(mane ));
		proxymane.introduce(mane.getName());
		proxymane.age();
		proxymane.welcome();
	}

}
