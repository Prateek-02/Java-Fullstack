package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.model.Doctor;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable Long id) {
        // Doctor with id 1 is available, others are not
        if (id == 1) {
            return new Doctor(id, "Dr. Smith", "Cardiology", true);
        } else {
            return new Doctor(id, "Dr. Jones", "Neurology", false);
        }
    }
}