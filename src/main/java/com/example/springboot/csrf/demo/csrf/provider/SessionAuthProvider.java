package com.example.springboot.csrf.demo.csrf.provider;

import com.example.springboot.csrf.demo.csrf.Entity.authentication.SessionAuthentication;
import com.example.springboot.csrf.demo.csrf.Entity.db.SpringSession;
import com.example.springboot.csrf.demo.csrf.Entity.db.User;
import com.example.springboot.csrf.demo.csrf.Entity.db.UserSecurity;
import com.example.springboot.csrf.demo.csrf.repository.ConfigSessionRepository;
import com.example.springboot.csrf.demo.csrf.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Component
public class SessionAuthProvider implements AuthenticationProvider {

//    @PersistenceContext
//    private EntityManager em;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private ConfigSessionRepository configSessionRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String sessionID = authentication.getName();
        String username = configSessionRepository.getUsernameBaseonSessionId(sessionID);
        if (username == null || username.equals("")){
            return new SessionAuthentication(null,null);
        }
        UserSecurity userSecurity = (UserSecurity) userDetailsService.loadUserByUsername(username);
//        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new SessionAuthentication(userSecurity,null,userSecurity.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return SessionAuthentication.class.equals(aClass);
    }
}
