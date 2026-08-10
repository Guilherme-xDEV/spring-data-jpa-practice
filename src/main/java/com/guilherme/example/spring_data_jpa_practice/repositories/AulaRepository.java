package com.guilherme.example.spring_data_jpa_practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.example.spring_data_jpa_practice.entities.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {

    
}