package com.hotel.management.model;

import javax.persistence.*;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId; // Linked to Customer
    private double roomCharges;
    private double additionalServices;
    private double totalAmount;
    private String paymentMethod; // cash, card, online

    // Getters and Setters
}
