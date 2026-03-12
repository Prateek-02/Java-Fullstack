package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.capg.springboot.controller.OrderController;

@EnableFeignClients(basePackages = "com.capg.springboot.controller") // Enables Feign Client support
@SpringBootApplication
public class ECommerceOrderServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ECommerceOrderServiceApplication.class, args);
	     System.out.println("SpringBoot Product Server Start");
	}

}
