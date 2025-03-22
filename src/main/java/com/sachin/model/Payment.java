package com.sachin.model;

public record Payment(int paymentId, int rideId, int userId, double amount, String paymentMethod, String status) {
}
