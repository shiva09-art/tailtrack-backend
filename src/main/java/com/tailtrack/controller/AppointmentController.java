package com.tailtrack.controller;
import com.tailtrack.model.Appointment;
import com.tailtrack.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins = "*")
public class AppointmentController {
    @Autowired
    private AppointmentRepository repository;

    @GetMapping
    public List<Appointment> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Appointment create(@RequestBody Appointment entity) {
        return repository.save(entity);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}