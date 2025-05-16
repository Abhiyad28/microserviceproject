package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Rating;
import com.springboot.service.RatingService;

@RestController
@RequestMapping("/rating")

public class RatingController {
	@Autowired
	private RatingService ratingService;
	
	@PostMapping
	ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		Rating rate1=ratingService.Create(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(rate1);
	}
	
	@GetMapping
	ResponseEntity<List<Rating>> getallRating(){
		List<Rating> rate2 =ratingService.getAllRatings();
		return ResponseEntity.ok(rate2);
	}
	
	@GetMapping("/user/{userId}")
	ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		List<Rating> rate3 =ratingService.getRatingByUserId(userId);
		return ResponseEntity.ok(rate3);
	}
	  
	@GetMapping("/hotel/{hotelId}")
	ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		List<Rating> rate4 =ratingService.getRatingByHotelId(hotelId);
		return ResponseEntity.ok(rate4);
	}
	
	@PutMapping("/{ratingId}")
	ResponseEntity<Rating> updateRating(@RequestBody Rating rating,@PathVariable String ratingId){
		Rating rate1 = ratingService.updateRating(rating,ratingId);
		return ResponseEntity.ok(rate1);
	}
	
	@DeleteMapping("/{ratingId}")
	ResponseEntity<Boolean> deleteRating(@PathVariable String ratingId){
		ratingService.deleteRating(ratingId);
		return ResponseEntity.noContent().build();
	}
}
