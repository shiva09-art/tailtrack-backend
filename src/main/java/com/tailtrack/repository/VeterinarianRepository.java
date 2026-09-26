package com.tailtrack.repository;
import com.tailtrack.model.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VeterinarianRepository extends JpaRepository<Veterinarian, Long> {
}