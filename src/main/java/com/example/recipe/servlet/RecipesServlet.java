package com.example.recipe.servlet;

import com.example.recipe.model.Recipe;
import com.example.recipe.service.RecipeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/", "/recipes"})

public class RecipesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RecipeService recipeService = new RecipeService();
        List<Recipe> recipes = recipeService.fetchAllRecipes();
        req.setAttribute("recipes", recipes);
        req.getRequestDispatcher("/WEB-INF/recipes.jsp").forward(req, resp);
    }
}
