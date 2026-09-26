package com.tailtrack.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long petId;
    private Long veterinarianId;
    private java.time.LocalDate appointmentDate;
    private String appointmentTime;
    private String reason;
    private String status;
}