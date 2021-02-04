package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bagus.spring.entities.VehicleHire;
@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
