package com.tailtrack.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "adoption_pets")
public class AdoptionPet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String species;
    private String breed;
    private String age;
    private String location;
    private String description;
    private String status;
}