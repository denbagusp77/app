package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bagus.spring.entities.Supplier;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
