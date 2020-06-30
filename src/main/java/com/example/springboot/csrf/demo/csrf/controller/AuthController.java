package com.example.springboot.csrf.demo.csrf.controller;

import com.example.springboot.csrf.demo.csrf.Entity.request.LoginRequest;
import com.example.springboot.csrf.demo.csrf.Entity.request.RefreshToken;
import com.example.springboot.csrf.demo.csrf.Entity.request.SignupRequest;
import com.example.springboot.csrf.demo.csrf.Entity.response.AccessToken;
import com.example.springboot.csrf.demo.csrf.Entity.response.MessageResponse;
import com.example.springboot.csrf.demo.csrf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {


private final UserService userService;
@Autowired
public AuthController(UserService userService){
    this.userService = userService;
}

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
                return ResponseEntity.ok(userService.loginUser(loginRequest));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser2(@Valid @RequestBody SignupRequest signUpRequest) {
        userService.registerUser(signUpRequest);
        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
//    @PostMapping("/refreshtoken")
//    public @ResponseBody
//    AccessToken tokenPostRefresh2(@Valid @RequestBody RefreshToken refreshToken) {
//
//        return userService.refreshAccessToken(refreshToken.getRefreshToken());
//
//    }
    @PostMapping("/logout")
    public void deleteTokenLogout(@Valid @RequestBody RefreshToken refreshToken){
       userService.logoutUser(refreshToken.getRefreshToken());
    }

}
