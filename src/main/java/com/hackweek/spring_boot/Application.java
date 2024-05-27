package com.hackweek.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	@RequestMapping("/")
    public String home() {
		// H1 heading
        return "<h1>Welcome to Spring Boot</h1>";
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
