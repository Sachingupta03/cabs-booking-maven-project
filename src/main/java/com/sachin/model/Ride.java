package com.sachin.model;

public record Ride(int rideId, int userId, int driverId, String pickupLocation, String dropffLocation, double fare, String status) {
    public Object dropoffLocation() {
        return null;
    }
}
