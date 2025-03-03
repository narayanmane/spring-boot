package com.example.controller;

import java.util.List;

import javax.print.attribute.standard.PageRanges;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.User;
import com.example.repo.UserPadingandsortingrepo;
import com.example.service.UserService;



@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userservice;
	

	
	@GetMapping
	public List<User> getalluser(){
		
	return userservice.getallUser();
		
	}
	
	
	@PostMapping
	public  User  saveuser(@RequestBody User user) {
		
		return userservice.adduser(user);
	}
   
	// use pagingandsortingrepo
	@GetMapping("/page")
	public Iterable<User> getuserwithpagination(@RequestParam int page, @RequestParam int size)
	{
		return userservice.getuaserwithPagingandsorting(page, size);
	}	
	
	
	// use jparepo
	@GetMapping("/getbystatus")
	public List<User> getuserbystatus(@RequestParam String status){
		
	return userservice.getuserbystatus(status);
		
	}
	
	
	
	
}
