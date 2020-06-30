package com.example.springboot.csrf.demo.csrf.Entity.authentication;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class SigninAuthentication extends UsernamePasswordAuthenticationToken {
    public SigninAuthentication(Object principal, Object credentials) {
        super(principal, credentials);
    }

    public SigninAuthentication(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
    }
}
