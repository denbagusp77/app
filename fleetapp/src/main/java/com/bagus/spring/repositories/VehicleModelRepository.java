package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bagus.spring.entities.VehicleModel;
@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
