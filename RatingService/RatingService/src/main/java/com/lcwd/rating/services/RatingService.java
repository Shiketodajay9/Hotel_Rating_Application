package com.lcwd.rating.services;

import com.lcwd.rating.entities.Rating;


import java.util.List;

import org.springframework.stereotype.Service;


@Service

public interface RatingService {

    //create
    Rating create(Rating rating);


    //get all ratings
    List<Rating> getRatings();

    //get all by UserId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);




}
