package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bagus.spring.entities.Location;
@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
