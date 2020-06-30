package com.example.springboot.csrf.demo.csrf.provider;

import com.example.springboot.csrf.demo.csrf.Entity.authentication.SigninAuthentication;
import com.example.springboot.csrf.demo.csrf.Entity.db.Role;
import com.example.springboot.csrf.demo.csrf.Entity.db.User;
import com.example.springboot.csrf.demo.csrf.Entity.exception.DuplicateEmailException;
import com.example.springboot.csrf.demo.csrf.Entity.request.SignupRequest;
import com.example.springboot.csrf.demo.csrf.repository.RoleRepository;
import com.example.springboot.csrf.demo.csrf.repository.UserRepository;
import com.example.springboot.csrf.demo.csrf.systemEnum.ERole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
//import selflearning.springbootmanagerapp.model.authentication.SigninAuthentication;
//import selflearning.springbootmanagerapp.model.entity.Role;
//import selflearning.springbootmanagerapp.model.entity.User;
//import selflearning.springbootmanagerapp.model.exception.DuplicateEmailException;
//import selflearning.springbootmanagerapp.model.request.SignupRequest;
//import selflearning.springbootmanagerapp.repository.RoleRepository;
//import selflearning.springbootmanagerapp.repository.UserRepository;
//import selflearning.springbootmanagerapp.systemEnum.ERole;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class SignupAuthProvider implements AuthenticationProvider {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        SignupRequest signupRequest = (SignupRequest) authentication.getPrincipal();
        Optional<User> existingEmail = userRepository.findByEmail(signupRequest.getEmail());
        if (existingEmail.isPresent()) {
            throw new DuplicateEmailException();
        }
        Optional<User> existingUsername = userRepository.findByUsername(signupRequest.getUsername());
        if (existingUsername.isPresent()) {
            throw new DuplicateEmailException();
        }

        // Create new user's account
        User user = new User(signupRequest.getUsername(),
                signupRequest.getEmail(),
                passwordEncoder.encode(signupRequest.getPassword()));

        Set<String> strRoles = signupRequest.getRole();
        Set<Role> roles = new HashSet<>();

        if (strRoles == null) {
            Role userRole = roleRepository.findByName(ERole.ROLE_USER)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            roles.add(userRole);
        } else {
            strRoles.forEach(role -> {
                switch (role) {
                    case "admin":
                        Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(adminRole);

                        break;
                    case "mod":
                        Role modRole = roleRepository.findByName(ERole.ROLE_MODERATOR)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(modRole);

                        break;
                    default:
                        Role userRole = roleRepository.findByName(ERole.ROLE_USER)
                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                        roles.add(userRole);
                }
            });
        }

        user.setRoles(roles);
        userRepository.save(user);
        return new SigninAuthentication(user,null,null);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return SigninAuthentication.class.equals(aClass);
    }
}
