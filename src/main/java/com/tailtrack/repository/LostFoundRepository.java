package com.tailtrack.repository;
import com.tailtrack.model.LostFound;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LostFoundRepository extends JpaRepository<LostFound, Long> {
}