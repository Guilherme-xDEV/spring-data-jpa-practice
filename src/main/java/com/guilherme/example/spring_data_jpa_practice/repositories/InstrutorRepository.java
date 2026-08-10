package com.guilherme.example.spring_data_jpa_practice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.example.spring_data_jpa_practice.entities.Instrutor;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {
    List<Instrutor> findByNomeContaining(String nome);
}