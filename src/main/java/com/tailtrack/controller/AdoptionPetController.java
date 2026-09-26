package com.tailtrack.controller;
import com.tailtrack.model.AdoptionPet;
import com.tailtrack.repository.AdoptionPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/adoption")
@CrossOrigin(origins = "*")
public class AdoptionPetController {
    @Autowired
    private AdoptionPetRepository repository;

    @GetMapping
    public List<AdoptionPet> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public AdoptionPet create(@RequestBody AdoptionPet entity) {
        return repository.save(entity);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}