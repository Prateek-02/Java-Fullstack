package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.model.Patient;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id) {
        if (id == 1) {
            return new Patient(id, "John Doe", 35);
        } else if (id == 2) {
            return new Patient(id, "Jane Smith", 28);
        } else if (id == 3) {
            return new Patient(id, "Rahul Kumar", 45);
        } else {
            return new Patient(id, "No Patient Found", -1);
        }
    }
}