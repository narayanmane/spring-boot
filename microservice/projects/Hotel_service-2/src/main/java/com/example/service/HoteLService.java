package com.example.service;

import java.util.List;

import com.example.Entity.Hotel;

public interface HoteLService {
	
	
	Hotel savehotel(Hotel hotel);

	List<Hotel> getAllhotel();
	
	Hotel getSingleHotel(String id);
}
