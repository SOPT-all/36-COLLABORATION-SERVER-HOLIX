package com.holix.holix_server.study.service;

import com.holix.holix_server.study.dto.reponse.StudyListResponseDTO;
import com.holix.holix_server.study.model.Study;
import com.holix.holix_server.study.respository.StudyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyService {
    private final StudyRepository studyRepository;

    public StudyService(StudyRepository studyRepository) {
        this.studyRepository = studyRepository;
    }

    public StudyListResponseDTO findAll() {
        return studyRepository.findAll();
    }
}
