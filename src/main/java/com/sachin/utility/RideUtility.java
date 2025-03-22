package com.sachin.utility;

import com.sachin.model.Ride;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RideUtility {
    // Filtering rides by status (Completed, Ongoing, etc.)
    public static List<Ride> filterRidesByStatus(List<Ride> rides, String status) {
        return rides.stream()
                .filter(ride -> ride.status().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }

    // Mapping ride destinations to a list
    public static List<Object> getRideDestinations(List<Ride> rides) {
        List<Object> list = new ArrayList<> ();
        for (Ride ride : rides) {
            Object dropoffLocation = ride.dropoffLocation ();
            list.add (dropoffLocation);
        }
        return list.reversed ();
    }
}
