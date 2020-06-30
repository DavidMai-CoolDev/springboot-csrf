package com.example.springboot.csrf.demo.csrf.provider;

import com.example.springboot.csrf.demo.csrf.Entity.authentication.LogoutAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class LogoutAuthProvider implements AuthenticationProvider {
//    @Autowired
//    private RefreshTokenRepository refreshTokenRepository;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String refreshToken = authentication.getName();
//        refreshTokenRepository.findByToken(refreshToken)
//                .ifPresent(refreshTokenRepository::delete);
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return LogoutAuthentication.class.equals(aClass);
    }
}
