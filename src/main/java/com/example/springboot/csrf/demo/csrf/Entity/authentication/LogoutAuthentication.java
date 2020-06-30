package com.example.springboot.csrf.demo.csrf.Entity.authentication;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class LogoutAuthentication extends UsernamePasswordAuthentication{
    public LogoutAuthentication(Object principal, Object credentials) {
        super(principal, credentials);
    }

    public LogoutAuthentication(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
    }
}
