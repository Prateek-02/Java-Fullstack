package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class HealthcareDoctorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareDoctorServiceApplication.class, args);
		System.out.println("Doctor Service Started...");
	}

}
