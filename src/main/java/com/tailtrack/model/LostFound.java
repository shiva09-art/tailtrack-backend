package com.tailtrack.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "lost_found")
public class LostFound {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String postType;
    private String petName;
    private String species;
    private String location;
    private java.time.LocalDate date;
    private String description;
    private String contact;
}