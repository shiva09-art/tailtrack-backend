package com.tailtrack.repository;
import com.tailtrack.model.AdoptionPet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdoptionPetRepository extends JpaRepository<AdoptionPet, Long> {
}