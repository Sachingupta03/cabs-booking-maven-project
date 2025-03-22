package com.sachin.repository;

import com.sachin.model.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DriverRepository {
    private final List<Driver> drivers = new ArrayList<>();

    // Add a new driver
    public void addDriver(List<Driver> driver) {
    }

    // Get all drivers
    public List<Driver> getAllDrivers() {
        return drivers;
    }

    // Find driver by email
    public Optional<Driver> findDriverByEmail(String email) {
        return drivers.stream()
                .filter(driver -> driver.email().equalsIgnoreCase(email))
                .findFirst();
    }

    // Filter drivers based on cab type
    public List<Driver> filterDriversByCabType(String cabType) {
        return drivers.stream()
                .filter(driver -> driver.cabDetails().toLowerCase().contains(cabType.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Iterable<Object> getDriversByCabType(String cabType) {
        return null;
    }
}
