package com.tailtrack.controller;
import com.tailtrack.model.Pet;
import com.tailtrack.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/pets")
@CrossOrigin(origins = "*")
public class PetController {
    @Autowired
    private PetRepository repository;

    @GetMapping
    public List<Pet> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Pet create(@RequestBody Pet entity) {
        return repository.save(entity);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}