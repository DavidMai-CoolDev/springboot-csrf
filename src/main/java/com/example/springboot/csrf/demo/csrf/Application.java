package com.example.springboot.csrf.demo.csrf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
@EnableJdbcHttpSession(maxInactiveIntervalInSeconds = 900)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
