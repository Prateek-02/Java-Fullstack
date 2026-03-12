package com.capg.springboot.model;

public class Doctor {

    private Long id;
    private String name;
    private String specialization;
    private boolean available;

    // Getters & Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public boolean isAvailable() { return available; }
}