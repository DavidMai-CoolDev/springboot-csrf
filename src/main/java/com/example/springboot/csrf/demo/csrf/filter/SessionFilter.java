package com.example.springboot.csrf.demo.csrf.filter;

import com.example.springboot.csrf.demo.csrf.Entity.authentication.SessionAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;


public class SessionFilter extends OncePerRequestFilter {

    @Autowired
    private AuthenticationManager authenticationManager;


    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
//        return request.getServletPath().equals("/api/auth/signin");
        return request.getServletPath().contains("api/auth/");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        try {
            Cookie[] cookies =  httpServletRequest.getCookies();
            byte[] decodedBytes = Base64.getDecoder().decode(cookies[1].getValue());
//            String jwt = parseJwt(request);
//            String header = request.getHeader("Authorization");
            Authentication authentication = authenticationManager.authenticate(new SessionAuthentication(
                    new String(decodedBytes), null));
//            UsernamePasswordAuthenticationToken myauthentication = (UsernamePasswordAuthenticationToken) authentication;
//                myauthentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
//                SecurityContextHolder.getContext().setAuthentication(myauthentication);
//                filterChain.doFilter(httpServletRequest,httpServletResponse);
            if(authentication.isAuthenticated()){
                UsernamePasswordAuthenticationToken myauthentication = (UsernamePasswordAuthenticationToken) authentication;
                myauthentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
                SecurityContextHolder.getContext().setAuthentication(myauthentication);
//                filterChain.doFilter(httpServletRequest,httpServletResponse);
            }else{
                logger.error("There is no user for the specific session: {}");
                httpServletResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
//                filterChain.doFilter(httpServletRequest,httpServletResponse);

            }
//            filterChain.doFilter(httpServletRequest,httpServletResponse);
        }catch (Exception e) {
            logger.error("Cannot set user authentication: {}", e);
            httpServletResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
        }

        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
