package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bagus.spring.entities.VehicleMovement;
@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
