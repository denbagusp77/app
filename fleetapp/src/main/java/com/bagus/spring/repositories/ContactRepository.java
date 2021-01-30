package com.bagus.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bagus.spring.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
