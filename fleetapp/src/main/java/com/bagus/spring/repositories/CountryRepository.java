package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bagus.spring.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
