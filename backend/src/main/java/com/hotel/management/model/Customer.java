package com.hotel.management.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String contactInfo;
    private String idProof;
    private Date checkinDate;
    private Date checkoutDate;
    private String roomNumber; // Linked to Room

    // Getters and Setters
}
