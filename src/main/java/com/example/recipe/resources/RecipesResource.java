package com.example.recipe.resources;

import com.example.recipe.model.Recipe;
import com.example.recipe.service.RecipeService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/recipes")
public class RecipesResource {

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getAllRecipes(){
        List<Recipe> recipes = new RecipeService().fetchAllRecipes();
        return Response
                .status(Response.Status.CREATED)
                .entity(recipes)
                .build();
    }



     /*@GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public void getRecipesById(){}

   @PUT
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response editARecipe(){return Response;}

    @POST
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response createRecipe(){return Response;};*/
}
