package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/security")
	public String myData() {
		return "Hello SpringBoot Actuator Security";
	}
}
