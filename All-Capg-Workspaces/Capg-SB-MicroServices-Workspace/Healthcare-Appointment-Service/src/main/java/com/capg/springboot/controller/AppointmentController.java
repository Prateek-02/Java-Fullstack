package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.springboot.model.Patient;
import com.capg.springboot.model.Doctor;

/**
 * Appointment Controller
 * Handles appointment booking
 */
@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private final PatientClient patientClient;
    private final DoctorClient doctorClient;

    public AppointmentController(PatientClient patientClient, DoctorClient doctorClient) {
        this.patientClient = patientClient;
        this.doctorClient = doctorClient;
    }

    @GetMapping("/book/{patientId}/{doctorId}")
    public String bookAppointment(@PathVariable Long patientId, @PathVariable Long doctorId) {
        Patient patient = patientClient.getPatient(patientId);
        Doctor doctor = doctorClient.getDoctor(doctorId);

        if (patient.getAge() == -1) {
            return "No Patient Found for ID: " + patientId;
        }

        if (doctor.isAvailable()) {
            return "Appointment Booked: Patient " + patient.getName()
                    + " (Age: " + patient.getAge() + ")"
                    + " with " + doctor.getName()
                    + " [" + doctor.getSpecialization() + "]";
        } else {
            return doctor.getName() + " is not available. Please try another doctor.";
        }
    }
}