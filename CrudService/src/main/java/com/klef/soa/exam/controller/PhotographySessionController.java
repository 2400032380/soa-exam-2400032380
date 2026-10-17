package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.PhotographySessionEntity;
import com.klef.soa.exam.repository.PhotographySessionRepository;

@RestController
public class PhotographySessionController {

    @Autowired
    private PhotographySessionRepository repository;

    @GetMapping("/")
    public String home() {
        return "Photography Session CRUD Service";
    }

    @PostMapping("/Add")
    public PhotographySessionEntity addSession(
            @RequestBody PhotographySessionEntity session) {
        return repository.save(session);
    }

    @GetMapping("/DisplayAll")
    public List<PhotographySessionEntity> displayAll() {
        return repository.findAll();
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteSession(@PathVariable Long id) {
        repository.deleteById(id);
        return "Photography Session Deleted Successfully";
    }
}