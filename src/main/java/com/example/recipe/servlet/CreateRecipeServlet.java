package com.example.recipe.servlet;

import com.example.recipe.model.Recipe;
import com.example.recipe.service.RecipeService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/userSession/create-recipe")
public class CreateRecipeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/create-recipe.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("recipeTitle");
        String  description = request.getParameter("description");
        String category = request.getParameter("category");
        String urlRecipe = request.getParameter("urlRecipe");
        String dateRecipe = request.getParameter("dateRecipe");
        String urlImage = request.getParameter("urlImage");
        System.out.println(title);
        int id = 0;
        Recipe recipe = new Recipe(id++,title,description,category,urlRecipe,dateRecipe,urlImage);
        System.out.println(recipe.getTitle());
       Boolean newRecipeAdded = new RecipeService().addRecipe(recipe);
        if (newRecipeAdded) {
            RecipeService recipeService = new RecipeService();
            List<Recipe> recipes = recipeService.fetchAllRecipes();
            request.setAttribute("recipes", recipes);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/my-recipes.jsp");
            requestDispatcher.forward(request, response);
            response.sendRedirect(request.getContextPath() + "/userSession/my-recipes");
        } else {
            System.out.println("error!");
        }
    }
}
