package com.example.springboot.csrf.demo.csrf.Entity.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DuplicateUsernameException extends RuntimeException {
    public DuplicateUsernameException() {
        super("Username already exists");
    }
}
