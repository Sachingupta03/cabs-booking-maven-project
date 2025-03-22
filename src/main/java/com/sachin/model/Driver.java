package com.sachin.model;

public record Driver(String driverId, String name, String email, String phone, String cabDetails) {
    public String getName() {
        return name;
    }
}
