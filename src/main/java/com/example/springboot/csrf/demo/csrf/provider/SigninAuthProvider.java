package com.example.springboot.csrf.demo.csrf.provider;

import com.example.springboot.csrf.demo.csrf.Entity.authentication.UsernamePasswordAuthentication;
import com.example.springboot.csrf.demo.csrf.Entity.db.User;
import com.example.springboot.csrf.demo.csrf.Entity.db.UserSecurity;
import com.example.springboot.csrf.demo.csrf.Entity.response.LoginResponse;
import com.example.springboot.csrf.demo.csrf.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SigninAuthProvider implements AuthenticationProvider {
    //        @Autowired
//    private UserDetailsService userDetailsService;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
//        UserSecurity userSecurity = (UserSecurity) userDetailsService.loadUserByUsername(username);
        UserSecurity userSecurity = (UserSecurity) userDetailsService.loadUserByUsername(username);
        if (passwordEncoder.matches(password, userSecurity.getPassword())) {
            SecurityContextHolder.getContext().setAuthentication(authentication);
            List<String> roles = userSecurity.getAuthorities().stream()
                    .map(item -> item.getAuthority())
                    .collect(Collectors.toList());
            User user = new User();
            user.setId(userSecurity.getId());
            user.setUsername(userSecurity.getUsername());
            user.setEmail(userSecurity.getEmail());
            user.setPassword(userSecurity.getPassword());
//            String refreshToken = createRefreshToken(user);

//            CsrfToken csrfToken = (CsrfToken) (new HttpServletRequest.getAttribute(CsrfToken.class));
                    LoginResponse loginResponse = new LoginResponse(
                            userSecurity.getId(),
                            userSecurity.getUsername(),
                            userSecurity.getEmail(),
                            roles);
            return new UsernamePasswordAuthentication(loginResponse, null, null);
//            return new Authentication(user,password,user.getAuthorities());
        }
        return new UsernamePasswordAuthentication(null, null, null);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return UsernamePasswordAuthentication.class.equals(aClass);
    }
}
