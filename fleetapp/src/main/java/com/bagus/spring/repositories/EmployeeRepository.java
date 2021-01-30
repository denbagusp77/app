package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bagus.spring.entities.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
