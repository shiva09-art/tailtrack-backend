package com.tailtrack.controller;
import com.tailtrack.model.LostFound;
import com.tailtrack.repository.LostFoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/lost-found")
@CrossOrigin(origins = "*")
public class LostFoundController {
    @Autowired
    private LostFoundRepository repository;

    @GetMapping
    public List<LostFound> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public LostFound create(@RequestBody LostFound entity) {
        return repository.save(entity);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}