package com.example.springboot.csrf.demo.csrf.Entity.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class WrongPasswordException extends RuntimeException {

    public WrongPasswordException() {
        super("Wrong password");
    }
}
