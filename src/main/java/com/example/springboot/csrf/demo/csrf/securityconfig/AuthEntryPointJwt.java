package com.example.springboot.csrf.demo.csrf.securityconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthEntryPointJwt implements AuthenticationEntryPoint {
    private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        logger.error("Unauthorized error: {}", authException.getMessage());
//        response.addHeader("WWW-Authenticate", "Basic realm=" +getRealmName());
//        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//        return (request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());

        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
    }
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        setRealmName("DeveloperStack");
//        super.afterPropertiesSet();
//    }
}
