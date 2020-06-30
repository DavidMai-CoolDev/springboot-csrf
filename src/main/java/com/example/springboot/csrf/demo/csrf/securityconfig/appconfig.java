package com.example.springboot.csrf.demo.csrf.securityconfig;

import com.example.springboot.csrf.demo.csrf.filter.SessionFilter;
import com.example.springboot.csrf.demo.csrf.provider.LogoutAuthProvider;
import com.example.springboot.csrf.demo.csrf.provider.SigninAuthProvider;
import com.example.springboot.csrf.demo.csrf.provider.SignupAuthProvider;
import com.example.springboot.csrf.demo.csrf.provider.SessionAuthProvider;
import com.example.springboot.csrf.demo.csrf.repository.CsrfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true,
        prePostEnabled = true)
public class appconfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SigninAuthProvider signinAuthProvider;

    @Autowired
    private LogoutAuthProvider logoutAuthProvider;
    @Autowired
    private SignupAuthProvider signupAuthProvider;
    @Autowired
    private AuthEntryPointJwt unauthorizedHandler;
    @Autowired
    private SessionAuthProvider sessionAuthProvider;
    @Bean
    public  SessionFilter sessionFilter() {
        return new SessionFilter();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(signinAuthProvider);
        auth.authenticationProvider(signupAuthProvider);
        auth.authenticationProvider(logoutAuthProvider);
        auth.authenticationProvider(sessionAuthProvider);
    }
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
//        private AuthenticationEntryPoint authenticationEntryPoint() {
//        // As a REST service there is no 'authentication entry point' like MVC which can redirect to a login page
//        // Instead just reply with 401 - Unauthorized
//        return (request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
//    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
//        http.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint());

        http.csrf().ignoringAntMatchers("/nocsrf","/api/auth/**").csrfTokenRepository(new CsrfRepo())
                .and()
                .authorizeRequests()
                .antMatchers("/api/auth/**").permitAll()
//                .antMatchers("/api/test/**").permitAll()
                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .and()
//                .httpBasic()
                .and()
                .exceptionHandling().authenticationEntryPoint(unauthorizedHandler);
//                .and()
//                .exceptionHandling().accessDeniedPage("/403");
//        http.csrf().ignoringAntMatchers("/nocsrf").csrfTokenRepository(new CsrfRepo());
//        http.csrf().disable();
//        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
//        http.csrf().ignoringAntMatchers("/").csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//        http.csrf(httpSecurityCsrfConfigurer -> {
//            httpSecurityCsrfConfigurer.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//        });
//        http.csrf(c -> {
//            c.ignoringAntMatchers("/csrfdiabled/**").csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//            c.csrfTokenRepository(new CustomCsrfTokenRepository());
//        });
//        http.addFilterAfter(new CsrfFilterConfig(), CsrfFilter.class);
        http.addFilterBefore(sessionFilter(), UsernamePasswordAuthenticationFilter.class);
    }
}
