package com.sachin.utility;

import com.sachin.model.User;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserUtility {
    // Sorting users by name
    public static List<User> sortUsersByName(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::name))
                .collect(Collectors.toList());
    }

    // Mapping user names to a list
    public static List<String> getUserNames(List<User> users) {
        return users.stream()
                .map(User::name)
                .collect(Collectors.toList());
    }
}
