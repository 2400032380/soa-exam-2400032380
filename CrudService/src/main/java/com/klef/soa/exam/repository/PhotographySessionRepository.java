package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.soa.exam.entity.PhotographySessionEntity;

public interface PhotographySessionRepository
        extends JpaRepository<PhotographySessionEntity, Long> {

}