package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Entity.Hotel;
import com.example.Entity.Rating;
import com.example.Entity.User;
import com.example.externalFC.HoterService;
import com.example.repo.UserRepo;
@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private HoterService hoterService;

	@Override
	public User saveuser(User user) {
		// TODO Auto-generated method stub
		return  userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User getSingleUser(String id) {
		// TODO Auto-generated method stub
		User us= userRepo.getById(id);
		
		// http://localhost:8083/rating/user/29b6012b-3cc5-4ea8-9f06-e8fc85ca038b  fetch rating 
		 Rating[] ratingofuser =  restTemplate.getForObject("http://localhost:8083/rating/user/"+us.getUserid(), Rating[].class);
		 System.out.println("rating-->"+ratingofuser);
		 
	  List<Rating>ratings =	Arrays.stream(ratingofuser).toList();
		 
		List<Rating> listofrating =ratings.stream().map(rating->{
			//api call to hotel 
			 //set hotel to rating
			 //return the hotel
		// ResponseEntity<Hotel> forentity =	restTemplate.getForEntity("http://localhost:8082/hotel/"+rating.getHotelId(), Hotel.class);
		//	Hotel body = forentity.getBody(); 
			
			// use fiegn client 
			Hotel h=hoterService.gethotel(rating.getHotelId());
			
			rating.setHotel(h);
			return rating;
			
		 }).collect(Collectors.toList());
		 us.setRating(listofrating);
		return us;
	}

}
