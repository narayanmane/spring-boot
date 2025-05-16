package com.example.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Rating;
import com.example.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {

	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping
	public ResponseEntity<Rating> creatrating(@RequestBody Rating rating){
		rating.setRatingId(UUID.randomUUID().toString());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createrating(rating));
	}
	
	
	@GetMapping
	public ResponseEntity<List<Rating>> getallrating(){
		return ResponseEntity.ok(ratingService.getallrating());
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Rating>> getratingbyuserid(@PathVariable String userId){
		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
	}
	
	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getratingbyhotelid(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
	}
	
	
}
