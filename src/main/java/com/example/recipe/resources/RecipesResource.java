package com.example.recipe.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/recipes")
public class RecipesResource {

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public void getAllRecipes(){}

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public void getRecipesById(){}

   /* @PUT
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response editARecipe(){return Response;}

    @POST
    @Produces(value = MediaType.APPLICATION_JSON)
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response createRecipe(){return Response;};*/
}
