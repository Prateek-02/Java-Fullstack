package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthcareEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareEurekaServerApplication.class, args);
		System.out.println("Eureka Server Started...");
	}

}
