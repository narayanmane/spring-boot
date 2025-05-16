package com.example.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Hotel;
import com.example.service.HoteLService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HoteLService hoteLService;
	
	@PostMapping
	public ResponseEntity<Hotel> createhotel(@RequestBody Hotel hotel){
		 hotel.setHotelId(UUID.randomUUID().toString());
		 Hotel h = hoteLService.savehotel(hotel);
		 
		 return ResponseEntity.ok(h);
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getallhotel(){
		return ResponseEntity.ok(hoteLService.getAllhotel());
	}
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getsingleHotel(@PathVariable String hotelId){
		return ResponseEntity.ok(hoteLService.getSingleHotel(hotelId));
	}
}
