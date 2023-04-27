package com.example.recipe.service;

import com.example.recipe.dao.RecipesJdbcDao;
import com.example.recipe.dao.UserJdbcDao;
import com.example.recipe.model.User;

public class UserService {
    public User getUser(String email,String password){
        UserJdbcDao userJdbcDao = new UserJdbcDao();
        return userJdbcDao.findUserEmailAndPassword(email,password);
    }

    public User getUserByEmail(String email){
        UserJdbcDao userJdbcDao = new UserJdbcDao();
        return userJdbcDao.findUserByEmail(email);
    }
}
