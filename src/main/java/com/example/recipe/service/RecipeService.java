package com.example.recipe.service;

import com.example.recipe.dao.RecipesJdbcDao;
import com.example.recipe.model.Category;
import com.example.recipe.model.Recipe;

import java.util.List;

public class RecipeService {

    public List<Recipe> fetchAllRecipes(){
        RecipesJdbcDao recipesJdbcDao = new RecipesJdbcDao();
        return recipesJdbcDao.findAllRecipes();
    }

    public Boolean createANewRecipe(String title, String description, String categoryRecipe, String urlRecipe, String dateRecipe, String urlImage){
        RecipesJdbcDao recipesJdbcDao = new RecipesJdbcDao();
        Category category = new Category();
        String catgoryName = category.getCategoryName();
        int id = 0;
        Recipe recipe = new Recipe(++id,title,description,catgoryName,urlRecipe,dateRecipe,urlImage);
        return recipesJdbcDao.create(recipe);
    }

    public boolean addRecipe(Recipe recipe) {
        RecipesJdbcDao recipesJdbcDao = new RecipesJdbcDao();
        return recipesJdbcDao.create(recipe);
    }

}
