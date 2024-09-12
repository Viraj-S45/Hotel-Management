package com.hotel.management.model;

import javax.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String roomNumber;
    private String type; // single, double, suite
    private boolean isAvailable;
    private double price;
    private String amenities;

    // Getters and Setters
}
