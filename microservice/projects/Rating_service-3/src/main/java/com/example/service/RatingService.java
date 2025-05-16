package com.example.service;

import java.util.List;

import com.example.Entity.Rating;

public interface RatingService {
	
	
	Rating createrating(Rating rating);
	
	List<Rating> getallrating();
	
	List<Rating> getRatingByUserId(String userId);
	
	List<Rating> getRatingByHotelId(String hotelId);
	
	

}
