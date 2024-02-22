package com.lcwd.rating.services.impl;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.repository.RatingRepository;
import com.lcwd.rating.services.RatingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RatingServiceImpl implements RatingService {


    @Autowired(required=true)
    private RatingRepository ratingRepository;

    
    public Rating create(Rating rating) {
        return ratingRepository.save(rating);
    }

    
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
