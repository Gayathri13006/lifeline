package com.example.blood;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodRepository extends JpaRepository<BloodRequest, Long> {
    // This interface allows you to Save, Delete, and Find data automatically.
}
