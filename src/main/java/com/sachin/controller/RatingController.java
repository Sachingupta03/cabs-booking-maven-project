package com.sachin.controller;

import com.sachin.functionality.EntityProcessor;
import com.sachin.model.Rating;
import com.sachin.service.RatingService;

import java.util.Arrays;

public class RatingController {
    private final RatingService ratingService = new RatingService();

    public void addRatings() {
        Rating rating1 = new Rating(301, 101, 1, 1, 5, "Excellent service!");
        Rating rating2 = new Rating(302, 102, 2, 2, 4, "Good ride, but could be faster.");

        ratingService.addRatings(Arrays.asList(rating1, rating2));

        // Using lambda expression with Functional Interface
        EntityProcessor<Rating> processor = rating ->
                System.out.println("Processing rating: " + rating.rating());

        processor.process(rating1);


    }
}
