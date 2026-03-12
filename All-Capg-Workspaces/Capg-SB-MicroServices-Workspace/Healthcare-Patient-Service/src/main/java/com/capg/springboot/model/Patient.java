package com.capg.springboot.model;

/**
 * Patient Model (POJO)
 * Represents patient details
 */
public class Patient {

    private Long id;
    private String name;
    private int age;

    // Constructor
    public Patient(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}