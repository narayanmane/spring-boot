package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public class User{
		
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public User(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
	}
	private User user;
	
	public UserService() {
		user = new User(11,"mane");
	}
	public void Login() {
		System.out.println("logging user ");
	}
	
	public void logout () throws Exception{
		System.out.println("logout user");
		throw new  Exception("unable to logout ");
	}
	
}
