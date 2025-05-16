package com.springboot.entity;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rating_details")
public class Rating {

	@Id
	private String ratingId;
	
	private int rating;
	
	private String userId;
	
	private String hotelId;
	
	private String feedbacks;

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(String feedbacks) {
		this.feedbacks = feedbacks;
	}

	public Rating(String ratingId, int rating, String userId, String hotelId, String feedbacks) {
		super();
		this.ratingId = ratingId;
		this.rating = rating;
		this.userId = userId;
		this.hotelId = hotelId;
		this.feedbacks = feedbacks;
	}

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", rating=" + rating + ", userId=" + userId + ", hotelId=" + hotelId
				+ ", feedbacks=" + feedbacks + "]";
	}
	
	

	


	
}
