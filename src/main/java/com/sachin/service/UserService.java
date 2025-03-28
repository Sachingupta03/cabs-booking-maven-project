package com.sachin.service;

import com.sachin.model.User;
import com.sachin.repository.UserRepository;

import java.util.List;

public class UserService {
    final UserRepository userRepository = new UserRepository();

    // Registering multiple users with Stream API
    public void registerUsers(List<User> newUsers) {
        newUsers.forEach(userRepository::addUser);
    }

    // Printing all users using forEach
    public void printAllUsers() {
        userRepository.getAllUsers().forEach(user ->
                System.out.println("User: " + user.name() + ", Email: " + user.email())
        );
    }

    // Searching user with do-while loop
    public void searchUser(String email) {
        do {
            userRepository.findUserByEmail(email).ifPresentOrElse(
                    user -> System.out.println("User Found: " + user),
                    () -> System.out.println("User not found!")
            );
        } while (false); // Just to demonstrate do-while
    }
}
