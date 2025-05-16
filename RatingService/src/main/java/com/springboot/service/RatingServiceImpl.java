package com.springboot.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Rating;
import com.springboot.exception.ResourceNotFoundException;
import com.springboot.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepo;
	@Override
	public Rating Create(Rating rating) {
		String rating1=UUID.randomUUID().toString();
		rating.setRatingId(rating1);
		return ratingRepo.save(rating) ;
	}

	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return  ratingRepo.findByUserId(userId);
	}

	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return  ratingRepo.findByHotelId(hotelId);
	}
	@Override
	public Rating updateRating(Rating rating, String ratingId) {
	    Rating rating1=ratingRepo.findById(ratingId).orElseThrow(()-> new ResourceNotFoundException("value not found"+ratingId));
	    rating1.setRating(rating.getRating());
	    rating1.setFeedbacks(rating.getFeedbacks());
	    
		return rating1;
	}

	@Override
	public boolean deleteRating(String ratingId) {
		 if (ratingRepo.existsById(ratingId)) {
	            ratingRepo.deleteById(ratingId);
	            return true;
	           
	        } else {
	            // If the user doesn't exist, throw an exception (optional)
	            throw new ResourceNotFoundException("User with ID " + " not found.");
	        }
		 
	    }
	}


