package com.example;

import java.lang.reflect.Method;



public class PersonInvocationHandler  implements java.lang.reflect.InvocationHandler{
 private final Person person;
 
	public PersonInvocationHandler(Person person) {
	this.person = person;
}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Hii through proxy");
		return null;
	}

}
