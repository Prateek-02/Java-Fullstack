package com.capg.springboot.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.capg.springboot.model.Patient;

/**
 * Feign Client for PATIENT-SERVICE
 */
@FeignClient(name = "PATIENT-SERVICE")
public interface PatientClient {

    @GetMapping("/patient/{id}")
    Patient getPatient(@PathVariable Long id);
}