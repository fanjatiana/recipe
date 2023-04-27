package com.example.recipe.dao;

import com.example.recipe.model.Recipe;
import jdk.jfr.Category;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecipesJdbcDao implements RecipeDao {
    @Override
    public boolean create(Recipe entity) {
        return false;
    }

    @Override
    public List<Recipe> findAll() {
        return null;
    }

    @Override
    public Recipe findByDate(Recipe dateRecipe) {
        return null;
    }

    @Override
    public void update(Recipe entity) {

    }

    @Override
    public void delete(Recipe entity) {

    }

    @Override
    public List<Recipe> findAllRecipes() {
        List <Recipe> recipes = new ArrayList<>();
        Connection connection = ConnectionManager.getInstance();
        String query =("SELECT recipe.id, title, description, c.name AS category_name, urlRecipe, dateRecipe, urlImage \n" +
                "FROM recipe \n" +
                "INNER JOIN category c ON recipe.category_id = c.id");
        try (Statement pst = connection.createStatement()) {
            ResultSet result = pst.executeQuery(query);
            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                String description = result.getString("description");
                String category =result.getString("category_name");
                String dateRecipe = result.getString("dateRecipe");
                String urlRecipe = result.getString("urlRecipe");
                String urlImage = result.getString("urlImage");
                Recipe recipe = new Recipe(id,title,description,category,urlRecipe,dateRecipe,urlImage);
                recipes.add(recipe);
            }
            //ConnexionManager.closeConnection(); // fermer la connexion vers la base de données
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return recipes;
    }

    @Override
    public Recipe createRecipe(String title, String description, Category category, String urlRecipe, String date, String urlImage) {
        return null;
    }

    @Override
    public Recipe finByCategory(Category category) {
        return null;
    }

    @Override
    public Recipe findById(Integer id) {
        return null;
    }
}
