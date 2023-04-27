package com.example.recipe.model;

import java.time.LocalDateTime;

public class Recipe {

    private int id;
    private String title;
    private String description;
    private String category;
    private String urlRecipe;
    private String dateRecipe;
    private String urlImage;

    public Recipe(int id, String title, String description, String category, String urlRecipe, String dateRecipe, String urlImage) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.urlRecipe = urlRecipe;
        this.dateRecipe = dateRecipe;
        this.urlImage = urlImage;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrlRecipe() {
        return urlRecipe;
    }

    public void setUrlRecipe(String urlRecipe) {
        this.urlRecipe = urlRecipe;
    }


    public String getDateRecipe() {
        return dateRecipe;
    }

    public void setDateRecipe(String dateRecipe) {
        this.dateRecipe = dateRecipe;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
