package com.example.sessionDemo.entity;

public class User {
    private String email;
    private String password;
    public User () {}

    public User (String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail(){
         return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
