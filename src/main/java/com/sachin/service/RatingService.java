package com.sachin.service;

import com.sachin.model.Rating;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RatingService {
    private final List<Rating> ratings = new ArrayList<>();

    // Add a new rating
    public void addRating(Rating rating) {
        ratings.add(rating);
    }

    // Get all ratings
    public List<Rating> getAllRatings() {
        return ratings;
    }

    // Find ratings by ride ID
    public List<Rating> getRatingsByRideId(int rideId) {
        return ratings.stream()
                .filter(rating -> rating.rideId() == rideId)
                .collect(Collectors.toList());
    }

    // Find ratings by user ID
    public List<Rating> getRatingsByUserId(int userId) {
        return ratings.stream()
                .filter(rating -> rating.userId() == userId)
                .collect(Collectors.toList());
    }

    // Find ratings by driver ID
    public List<Rating> getRatingsByDriverId(int driverId) {
        return ratings.stream()
                .filter(rating -> rating.driverId() == driverId)
                .collect(Collectors.toList());
    }

    // Get average rating for a driver
    public double getAverageRatingForDriver(int driverId) {
        return ratings.stream()
                .filter(rating -> rating.driverId() == driverId)
                .mapToInt(Rating::rating)
                .average()
                .orElse(0.0);
    }

    public void addRatings(List<Rating> list) {
        
    }
}
