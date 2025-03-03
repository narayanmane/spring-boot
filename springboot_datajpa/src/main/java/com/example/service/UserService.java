package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.Entity.Resume;
import com.example.Entity.User;
import com.example.repo.UserCrudRepo;
import com.example.repo.UserJparepo;
import com.example.repo.UserPadingandsortingrepo;

@Service
public class UserService {

	@Autowired
	private UserCrudRepo userCrudRepo;
	
	@Autowired
	private UserPadingandsortingrepo userPadingandsortingrepo;
	
	@Autowired
	private UserJparepo userJparepo;
	
	public List<User> getallUser() {
		// TODO Auto-generated method stub
		return (List<User>) userCrudRepo.findAll();
	}

	public User adduser(User user) {
		// TODO Auto-generated method stub
		Resume resume = user.getResume();
		if(resume !=null) {
			resume.setUser(user);
		}
		
		return userCrudRepo.save(user);
	}
	
	
	// use  userPadingandsortingrepo
	public Iterable<User> getuaserwithPagingandsorting(int page, int size){
		return userPadingandsortingrepo.findAll(PageRequest.of(page, size));
		
	}
	
	
	// use jparepo 
	public List<User> getuserbystatus(String status) {
		// TODO Auto-generated method stub
		return userJparepo.findByStatus(status);
	}
	

}
