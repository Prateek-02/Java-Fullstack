package com.capg.springboot.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.capg.springboot.model.Doctor;

/**
 * Feign Client for DOCTOR-SERVICE
 */
@FeignClient(name = "DOCTOR-SERVICE")
public interface DoctorClient {

    @GetMapping("/doctor/{id}")
    Doctor getDoctor(@PathVariable Long id);
}