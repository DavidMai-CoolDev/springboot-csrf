package com.example.springboot.csrf.demo.csrf.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
public class TestController1 {
    @GetMapping()
    public String Hello(CsrfToken csrfToken){
        String myId = RequestContextHolder.currentRequestAttributes().getSessionId();
//        CsrfToken token = (CsrfToken) session.getAttribute("org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository.CSRF_TOKEN");
        System.out.println("My csrf is: "+ csrfToken.getToken());
        System.out.println("Your Session ID is: "+ myId);
        return "Hello Men !!";

    }
    @PostMapping("/csrf")
    public String doSmt(HttpSession session){
        String sessionId = session.getId();
        System.out.println("[session-id]: " + sessionId);
        return "smt has changed!!!";
    }
    @PostMapping("/nocsrf")
    public String foSmt2(HttpSession session, HttpServletRequest req){
        String sessionId = session.getId();
//        private long time =1586855087889L;
        if (req.isRequestedSessionIdValid()){
            System.out.println("[session-id]: " + sessionId);
            return "smt has changed!!!";
        }
        return "session is expiried !!";

    }
}
