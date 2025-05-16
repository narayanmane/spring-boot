package com.example.service;

import java.util.List;

import com.example.Entity.User;

public interface UserService {

	User saveuser(User user);
	
	List<User> getAllUser();
	
	User getSingleUser(String id);
	
}
