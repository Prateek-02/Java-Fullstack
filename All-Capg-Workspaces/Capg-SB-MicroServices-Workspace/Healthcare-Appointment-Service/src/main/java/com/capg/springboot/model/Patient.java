package com.capg.springboot.model;

/**
 * Patient DTO used in Appointment Service
 */
public class Patient {

    private Long id;
    private String name;
    private int age;

    // Getters & Setters
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