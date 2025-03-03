package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Appliaction;
import com.example.repo.ApplicationRepo;

@Service
public class AppliactionService {
    @Autowired
	private ApplicationRepo applicationRepo;
    
    public Appliaction saveappliaction(int id, Appliaction appliaction) {
    	return applicationRepo.save(appliaction);
    	
    }
	
	
}
