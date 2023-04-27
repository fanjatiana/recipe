package com.example.recipe.dao;

import com.example.recipe.model.Recipe;

import java.util.List;

public interface GenericDao <T, ID> {

    boolean create(T entity);

    List<T> findAll();

    T findById(ID id);


    T findByDate(Recipe dateRecipe);

    void update(T entity);

    void delete(T entity);
}
