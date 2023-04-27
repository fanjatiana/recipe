package com.example.recipe.dao;

import com.example.recipe.model.Recipe;
import com.example.recipe.model.User;

import java.sql.*;
import java.util.List;

public class UserJdbcDao implements UserDao {
    @Override
    public boolean create(User entity) {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Connection connection = ConnectionManager.getInstance();
        boolean insertOk = false;
        try{
            preparedStatement = connection.prepareStatement("INSERT INTO user (firstname, lastname,urlPicture, email, password) VALUES (?,?,?,?,?)");
            preparedStatement.setString(1, entity.getFirstname()); // définir des paramètre
            preparedStatement.setString(2, entity.getLastname());
            preparedStatement.setString(3, entity.getUrlPicture());
            preparedStatement.setString(4, entity.getEmail());
            preparedStatement.setString(5, entity.getPassword());

            int rowsAffected = preparedStatement.executeUpdate();
            insertOk = rowsAffected>0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return insertOk;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Integer integer) {
        return null;
    }

    @Override
    public User findByDate(Recipe dateRecipe) {
        return null;
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public User findUserEmailAndPassword(String userEmail, String userPassword) {
        PreparedStatement preparedStatement;
        User user = null;

        ResultSet resultSet;
        Connection connection = ConnectionManager.getInstance();
        try{
            preparedStatement = connection.prepareStatement("SELECT id,email, password FROM user WHERE email = ? AND password = ?");
            preparedStatement.setString(1, userEmail); // définir des paramètre
            preparedStatement.setString(2, userPassword);
           resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user = new User(resultSet.getString("email"), resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
