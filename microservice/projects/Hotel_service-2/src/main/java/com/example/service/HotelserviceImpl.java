package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Hotel;
import com.example.Repo.HotelRepo;
@Service
public class HotelserviceImpl  implements HoteLService{
	@Autowired
	private HotelRepo hotelRepo;
	@Override
	public Hotel savehotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllhotel() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();	
		}

	@Override
	public Hotel getSingleHotel(String id) {
		// TODO Auto-generated method stub
		return hotelRepo.getById(id);
	}

}
