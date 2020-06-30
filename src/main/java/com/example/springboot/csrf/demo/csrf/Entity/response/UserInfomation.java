package com.example.springboot.csrf.demo.csrf.Entity.response;

public class UserInfomation {
    private final String email;
    private final String name;

    public UserInfomation(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
