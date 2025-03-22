package com.sachin.model;

public record Rating(int ratingId, int rideId, int userId, int driverId, int rating, String review) {
}
