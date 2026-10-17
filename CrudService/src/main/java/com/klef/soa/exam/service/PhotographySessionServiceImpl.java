package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.PhotographySessionEntity;
import com.klef.soa.exam.repository.PhotographySessionRepository;

@Service
public class PhotographySessionServiceImpl implements PhotographySessionService {

    @Autowired
    private PhotographySessionRepository repository;

    @Override
    public PhotographySessionEntity addSession(PhotographySessionEntity session) {
        return repository.save(session);
    }

    @Override
    public List<PhotographySessionEntity> displayAll() {
        return repository.findAll();
    }

    @Override
    public String deleteSession(Long id) {
        repository.deleteById(id);
        return "Photography Session Deleted Successfully";
    }
}