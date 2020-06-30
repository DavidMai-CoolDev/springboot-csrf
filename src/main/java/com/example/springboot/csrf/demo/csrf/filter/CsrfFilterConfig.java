package com.example.springboot.csrf.demo.csrf.filter;

//import org.apache.tomcat.util.http.parser.Cookie;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;

public class CsrfFilterConfig extends OncePerRequestFilter {

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        return request.getServletPath().equals("/");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

//        java.util.Date time=new java.util.Date((long)1586855562019*1000);
        BigInteger bigInteger = new BigInteger("1586855562019");
        bigInteger.longValue();
//        long mili  = 1586855562019L;

        Date d = new Date(bigInteger.longValue());
        System.out.println("the created_time is: " + d);
        CsrfToken csrfToken = (CsrfToken) httpServletRequest.getAttribute(CsrfToken.class
                .getName());
//        if (csrfToken == null){
//            System.out.println("null object");
////            filterChain.doFilter(httpServletRequest,httpServletResponse);
//        }
////        if (csrfToken != null) {
////            Cookie cookie = new Cookie("XSRF-TOKEN", csrfToken.getToken());
////            cookie.setPath("/");
////            HttpServletResponse.;
////        }
        System.out.println("the csrf token is: " + csrfToken.getToken());
        filterChain.doFilter(httpServletRequest,httpServletResponse);

    }
}
