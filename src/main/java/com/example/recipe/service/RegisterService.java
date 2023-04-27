package com.example.recipe.service;

import com.example.recipe.model.User;

public class RegisterService {
    public User createAUser(String firstname, String lastname, String picture, String password, String email) {
        int id = 0;
        User newUser = new User(++id, firstname, lastname,picture, email, password);
        return newUser;
    }
}
