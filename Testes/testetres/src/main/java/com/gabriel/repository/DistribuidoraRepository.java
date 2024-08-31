package com.gabriel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Id;

public interface DistribuidoraRepository extends JpaRepository<Long, Id> {
  
}
