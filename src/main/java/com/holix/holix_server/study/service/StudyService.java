package com.holix.holix_server.study.service;

import com.holix.holix_server.study.dto.reponse.StudyListResponseDTO;
import com.holix.holix_server.study.dto.reponse.StudyResponseDTO;
import com.holix.holix_server.study.model.Category;
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
        return new StudyListResponseDTO(
                EntityToDTOList(studyRepository.findByCategory(Category.PASSIONATE)),
                EntityToDTOList(studyRepository.findByCategory(Category.INSIGHT)),
                EntityToDTOList(studyRepository.findByCategory(Category.NEW)),
                EntityToDTOList(studyRepository.findByCategory(Category.RECOMMENDED)),
                EntityToDTOList(studyRepository.findByCategory(Category.FREE))
        );
    }

    private List<StudyResponseDTO> EntityToDTOList(List<Study> studies) {
        return studies.stream()
                .map(StudyResponseDTO::new)
                .toList();
    }
}
