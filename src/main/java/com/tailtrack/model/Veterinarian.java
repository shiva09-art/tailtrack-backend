package com.tailtrack.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "veterinarians")
public class Veterinarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String clinicName;
    private String location;
    private String phone;
    private String services;
    private Double rating;
}