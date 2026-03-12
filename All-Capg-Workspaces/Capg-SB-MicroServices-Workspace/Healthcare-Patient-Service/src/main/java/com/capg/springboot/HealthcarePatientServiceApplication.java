package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthcarePatientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcarePatientServiceApplication.class, args);
		System.out.println("Patient Service Started.....");
	}

}
