package com.example.springboot.csrf.demo.csrf.Entity.response;

import java.io.Serializable;
import java.util.List;

public class LoginResponse implements Serializable{

//    private TokenPair tokenPair;
//    private String csrf_token;
    private long id;
    private String username;
    private String email;
    private List<String> roles;

    public LoginResponse() {
    }

    public LoginResponse(long id, String username, String email, List<String> roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}

