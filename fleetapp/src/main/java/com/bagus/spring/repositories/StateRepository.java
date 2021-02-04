package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bagus.spring.entities.State;
@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
