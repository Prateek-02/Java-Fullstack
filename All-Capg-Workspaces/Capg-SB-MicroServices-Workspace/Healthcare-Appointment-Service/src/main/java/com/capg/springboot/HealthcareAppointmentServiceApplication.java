package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.capg.springboot.controller")
public class HealthcareAppointmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareAppointmentServiceApplication.class, args);
		System.out.println("Appointment service started...");
	}

}
