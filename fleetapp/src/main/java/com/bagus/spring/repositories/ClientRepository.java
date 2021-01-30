package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bagus.spring.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
