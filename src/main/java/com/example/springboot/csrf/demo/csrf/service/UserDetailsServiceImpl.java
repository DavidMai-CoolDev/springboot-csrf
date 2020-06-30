package com.example.springboot.csrf.demo.csrf.service;

import com.example.springboot.csrf.demo.csrf.Entity.db.User;
import com.example.springboot.csrf.demo.csrf.Entity.db.UserSecurity;
import com.example.springboot.csrf.demo.csrf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username){
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return UserSecurity.build(user);
    }
}
