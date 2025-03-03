package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Appliaction;
import com.example.Entity.User;
import com.example.repo.UserJparepo;
import com.example.service.AppliactionService;
@RestController
@RequestMapping("/appliaction")
public class Applicationcontroller {
	
	@Autowired
	private AppliactionService appliactionService;
	@Autowired
	private UserJparepo userJparepo;

	@PostMapping("/{id}")
	public ResponseEntity<Appliaction> createapplaction(@PathVariable int id,@RequestBody Appliaction appliaction){
		Optional<User> optionaluser =userJparepo.findById(id);
		if(optionaluser.isPresent()) {
			User user =optionaluser.get();
			appliaction.setUser(user);
		}
		return ResponseEntity.ok(appliactionService.saveappliaction(id,appliaction));
	}
}
