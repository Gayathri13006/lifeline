package com.example.blood;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepository extends JpaRepository<BloodRequest, Long> {
    // This will fetch the requests we just saved from the hospital
}
