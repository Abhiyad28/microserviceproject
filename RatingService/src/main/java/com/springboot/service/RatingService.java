package com.springboot.service;

import java.util.List;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.stereotype.Service;

import com.springboot.entity.Rating;

@Service
public interface RatingService {

	 Rating Create(Rating rating);
	List<Rating> getAllRatings();
	List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByHotelId(String hotelId);
    Rating updateRating(Rating rating,String ratingId);
    boolean deleteRating(String ratingId);
	
}
