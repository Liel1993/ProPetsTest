package com.example.test.models;

public class User {
    private  String name;
    private  String email;
    private  String password;
    private  String passwordSignUpCheck;


    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User setPasswordSignUpCheck(String passwordSignUpCheck) {
        this.passwordSignUpCheck = passwordSignUpCheck;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordSignUpCheck() {
        return passwordSignUpCheck;
    }


}
