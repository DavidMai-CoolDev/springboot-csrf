package com.example.springboot.csrf.demo.csrf.service;

import com.example.springboot.csrf.demo.csrf.Entity.authentication.LogoutAuthentication;
import com.example.springboot.csrf.demo.csrf.Entity.authentication.SigninAuthentication;
import com.example.springboot.csrf.demo.csrf.Entity.authentication.UsernamePasswordAuthentication;
import com.example.springboot.csrf.demo.csrf.Entity.db.User;
import com.example.springboot.csrf.demo.csrf.Entity.request.LoginRequest;
import com.example.springboot.csrf.demo.csrf.Entity.request.SignupRequest;
import com.example.springboot.csrf.demo.csrf.Entity.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

//import selflearning.springbootmanagerapp.config.JWTAuthorizationFilter;

@Service
public class UserService {

@Autowired
private AuthenticationManager authenticationManager;
//@Autowired
//private JwtUtils jwtUtils;
//@Autowired
//private RefreshTokenRepository refreshTokenRepository;
//    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//    private final RoleRepository roleRepository;
//    //    private final JWTAuthorizationFilter jwtAuthorizationFilter;
//    private final RefreshTokenRepository refreshTokenRepository;
//    private final AuthenticationManager authenticationManager;
//    private final JwtUtils jwtUtils;
//
//    @Autowired
//    public UserService(UserRepository userRepository,
//                       PasswordEncoder passwordEncoder,
//                       RoleRepository roleRepository,
////                       JWTAuthorizationFilter jwtAuthorizationFilter,
//                       RefreshTokenRepository refreshTokenRepository,
//                       AuthenticationManager authenticationManager,
//                       JwtUtils jwtUtils) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//        this.roleRepository = roleRepository;
////        this.jwtAuthorizationFilter = jwtAuthorizationFilter;
//        this.refreshTokenRepository = refreshTokenRepository;
//        this.authenticationManager = authenticationManager;
//        this.jwtUtils = jwtUtils;
//    }

    public User registerUser(SignupRequest signupRequest) {
        Authentication authentication = authenticationManager.authenticate(new SigninAuthentication(
                signupRequest,null));
        return (User) authentication.getPrincipal();

//        Optional<User> existingEmail = userRepository.findByEmail(signupRequest.getEmail());
//        if (existingEmail.isPresent()) {
//            throw new DuplicateEmailException();
//        }
//        Optional<User> existingUsername = userRepository.findByUsername(signupRequest.getUsername());
//        if (existingUsername.isPresent()) {
//            throw new DuplicateEmailException();
//        }
//
//        // Create new user's account
//        User user = new User(signupRequest.getUsername(),
//                signupRequest.getEmail(),
//                passwordEncoder.encode(signupRequest.getPassword()));
//
//        Set<String> strRoles = signupRequest.getRole();
//        Set<Role> roles = new HashSet<>();
//
//        if (strRoles == null) {
//            Role userRole = roleRepository.findByName(ERole.ROLE_USER)
//                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//            roles.add(userRole);
//        } else {
//            strRoles.forEach(role -> {
//                switch (role) {
//                    case "admin":
//                        Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
//                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//                        roles.add(adminRole);
//
//                        break;
//                    case "mod":
//                        Role modRole = roleRepository.findByName(ERole.ROLE_MODERATOR)
//                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//                        roles.add(modRole);
//
//                        break;
//                    default:
//                        Role userRole = roleRepository.findByName(ERole.ROLE_USER)
//                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//                        roles.add(userRole);
//                }
//            });
//        }
//        user.setRoles(roles);
//        userRepository.save(user);
//        return user;
    }

//
//    public UserInfomation getUserInfo(Long userId) {
//        return userRepository.findById(userId)
//                .map(user -> new UserInfomation(user.getEmail(), user.getUsername()))
//                .orElseThrow(IllegalStateException::new);
//    }

    public LoginResponse loginUser(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthentication(
                loginRequest.getUsername(), loginRequest.getPassword()));
        return (LoginResponse) authentication.getPrincipal();

    }

//    private String createRefreshToken(User user) {
////        String token = RandomStringUtils.randomAlphanumeric(128);
//        String refreshToken = jwtUtils.generateRefreshToken(user.getUsername());
//        refreshTokenRepository.save(new UserRefreshToken(refreshToken, user));
//        return refreshToken;
//
//    }
//    public Optional<AccessToken> refreshAccessToken(String refreshToken) {
//        return refreshTokenRepository.findByToken(refreshToken)
//                .map(userRefreshToken -> new AccessToken(
//                        jwtUtils.generateAccessToken3(userRefreshToken.getUser().getUsername())
////                        jwtAuthorizationFilter.generateAccessToken(userRefreshToken.getUser().getId())
//                ));
//    }

//    public AccessToken refreshAccessToken(String refreshToken) {
//
//        Authentication authentication = authenticationManager.authenticate(new RefreshJwtAuthentication(
//                refreshToken, null));
//        return (AccessToken) authentication.getPrincipal();
////        if (refreshToken != null && jwtUtils.validateRefreshJwtToken(refreshToken)) {
////            return new AccessToken(jwtUtils.generateAccessToken3(refreshTokenRepository
////                    .findByToken(refreshToken).get().getUser().getUsername()));
////        }
////        logoutUser(refreshToken);
////        return new AccessToken(null);
//    }

    public void logoutUser(String refreshToken) {
        Authentication authentication = authenticationManager.authenticate(new LogoutAuthentication(
                refreshToken, null));
//        refreshTokenRepository.findByToken(refreshToken)
//                .ifPresent(refreshTokenRepository::delete);
    }
}
