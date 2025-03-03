package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Resume;
import com.example.Entity.User;
import com.example.repo.ResumeRepo;
import com.example.repo.UserJparepo;

@Service
public class resumeService {

	@Autowired
	private UserJparepo userJparepo;
	
	@Autowired
	private ResumeRepo resumeRepo;
	
	public Resume addResume(int id, Resume resume) {
		// TODO Auto-generated method stub
		Optional<User> UserOptional =  userJparepo.findById(id);
		if(UserOptional.isPresent()) {
			User user1=  UserOptional.get();
			resume.setUser(user1);
			return resumeRepo.save(resume);
		}
		else {
			throw  new  RuntimeException("user is not found with id "+id);
		}
	
	}

}
