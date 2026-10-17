package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.PhotographySessionEntity;

public interface PhotographySessionService {

    PhotographySessionEntity addSession(PhotographySessionEntity session);

    List<PhotographySessionEntity> displayAll();

    String deleteSession(Long id);
}