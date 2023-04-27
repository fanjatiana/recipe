package com.example.recipe.dao;

import com.example.recipe.model.Recipe;
import jdk.jfr.Category;

import java.util.List;

public interface RecipeDao extends GenericDao<Recipe,Integer>{
    List<Recipe> findAllRecipes();
    Recipe createRecipe(String title, String description, Category category,String urlRecipe, String date, String urlImage);

    Recipe finByCategory(Category category);

    Recipe findById(Integer id);
}
