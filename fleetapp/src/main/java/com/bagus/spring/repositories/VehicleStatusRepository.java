package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bagus.spring.entities.VehicleStatus;
@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
