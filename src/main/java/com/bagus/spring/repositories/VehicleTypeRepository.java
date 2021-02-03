package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bagus.spring.entities.VehicleType;
@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
