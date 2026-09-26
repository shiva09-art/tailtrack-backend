package com.tailtrack.controller;
import com.tailtrack.model.Veterinarian;
import com.tailtrack.repository.VeterinarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/veterinarians")
@CrossOrigin(origins = "*")
public class VeterinarianController {
    @Autowired
    private VeterinarianRepository repository;

    @GetMapping
    public List<Veterinarian> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Veterinarian create(@RequestBody Veterinarian entity) {
        return repository.save(entity);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}