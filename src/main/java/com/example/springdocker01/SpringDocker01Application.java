package com.example.springdocker01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDocker01Application {

	@RequestMapping("/")
    public String home() {
        return "Hello Docker World from Azure DevOps";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDocker01Application.class, args);
	}
}
