package com.example.recipe.service;

import com.example.recipe.dao.RecipesJdbcDao;
import com.example.recipe.model.Recipe;

import java.util.List;

public class RecipeService {



    public List<Recipe> fetchAllRecipes(){
        RecipesJdbcDao recipesJdbcDao = new RecipesJdbcDao();
        return recipesJdbcDao.findAllRecipes();
    }

}
