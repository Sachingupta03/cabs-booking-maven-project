package com.sachin.controller;

import com.sachin.functionality.EntityProcessor;
import com.sachin.model.User;
import com.sachin.service.UserService;

import java.util.Arrays;

public class UserController {
    private final UserService userService = new UserService();

    public void addUser() {
        User user1 = new User(1, "Mohan", "atoz@gmil.com", "9234567890");
        User user2 = new User(2, "Sonu", "xyz@gmail.cm", "0997654876");

        userService.registerUsers(Arrays.asList(user1, user2));

        // Using lambda expression with Functional Interface
        EntityProcessor<User> processor = user ->
                System.out.println("Processing user: " + user.name());

        processor.process(user1);

        userService.printAllUsers();
    }
}
