package com.sachin.repository;

import com.sachin.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    // Adding users
    public void addUser(User user) {
        users.add(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return users;
    }

    // Find user by email using Stream API
    public Optional<User> findUserByEmail(String email) {
        return users.stream()
                .filter(user -> user.email().equalsIgnoreCase(email))
                .findFirst();
    }

    // Filter users by name containing keyword
    public List<User> filterUsersByName(String keyword) {
        return users.stream()
                .filter(user -> user.name().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}
