package com.capg.springboot.model;

public class Doctor {

    private Long id;
    private String name;
    private String specialization;
    private boolean available;

    // Constructor
    public Doctor(Long id, String name, String specialization, boolean available) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.available = available;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public boolean isAvailable() { return available; }
}