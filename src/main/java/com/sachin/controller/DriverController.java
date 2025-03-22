package com.sachin.controller;

import com.sachin.functionality.EntityProcessor;
import com.sachin.model.Driver;
import com.sachin.service.DriverService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverController {
    private final DriverService driverService;

    // Constructor Injection - Properly initializing driverService
    public DriverController() {
        this.driverService = new DriverService();  // Correct Initialization
    }

    public void addDriver() {
        Driver driver1 = new Driver("1", "Ramesh", "xyz12@gmail.com", "9464535355", "SUV");  // Fixed Email
        Driver driver2 = new Driver("2", "Ganesh", "abcd00@gmail.com", "8884555353", "Tata Punch");

        //  FIX: Convert Arrays.asList() to a mutable list
        List<Driver> driverList = new ArrayList<>(Arrays.asList(driver1, driver2));
        driverService.registerDriver(driverList);

        //  FIX: Java 8+ compatible String Concatenation
        EntityProcessor<Driver> processor = driver ->
                System.out.println("Processing Driver: " + driver.getName());
        processor.process(driver1);

        //  FIX: Ensure proper method call
        driverService.printAllDrivers();
    }

    public void addDrivers() {
        // Implementation can be added here
    }
}
