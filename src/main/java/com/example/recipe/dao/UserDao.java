package com.example.recipe.dao;

import com.example.recipe.model.User;
import com.example.recipe.model.UserLogin;

public interface UserDao extends GenericDao<User,Integer> {
    User findUserEmailAndPassword (String userEmail, String userPassword);

    User findUserByEmail (String userEmail);
}
