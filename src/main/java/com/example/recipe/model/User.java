package com.example.recipe.model;

public class User {
    private int id;
    private String firstname;
    private String lastname;
    private String urlPicture;
    private String email;
    private String password;

    public User(int id, String firstname, String lastname, String urlPicture, String email, String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.urlPicture = urlPicture;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUrlPicture() {
        return urlPicture;
    }

    public void setUrlPicture(String urlPicture) {
        this.urlPicture = urlPicture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
