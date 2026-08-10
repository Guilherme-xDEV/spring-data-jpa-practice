package com.guilherme.example.spring_data_jpa_practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.example.spring_data_jpa_practice.entities.Instrutor;
import com.guilherme.example.spring_data_jpa_practice.repositories.InstrutorRepository;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {

    private final InstrutorRepository repository;

    InstrutorController(InstrutorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Instrutor> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Instrutor salvar(@RequestBody Instrutor instrutor) {
        return repository.save(instrutor);
    }
}