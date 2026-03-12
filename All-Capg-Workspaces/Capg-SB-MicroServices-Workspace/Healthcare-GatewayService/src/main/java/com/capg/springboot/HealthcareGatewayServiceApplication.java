package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthcareGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareGatewayServiceApplication.class, args);
		System.out.println("Gateway Service Started...");
	}

}
