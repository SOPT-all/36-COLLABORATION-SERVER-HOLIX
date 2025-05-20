package com.holix.holix_server.study.dto.reponse;

import lombok.Getter;

import java.util.List;

@Getter
public class StudyListResponseDTO {
        private final List<StudyResponseDTO> passionateStudies;
        private final List<StudyResponseDTO> insightStudies;
        private final List<StudyResponseDTO> newStudies;
        private final List<StudyResponseDTO> recommendedStudies;
        private final List<StudyResponseDTO> freeStudies;

        public StudyListResponseDTO(
                List<StudyResponseDTO> passionate,
                List<StudyResponseDTO> insight,
                List<StudyResponseDTO> news,
                List<StudyResponseDTO> recommended,
                List<StudyResponseDTO> free
        ) {
                this.passionateStudies = passionate;
                this.insightStudies = insight;
                this.newStudies = news;
                this.recommendedStudies = recommended;
                this.freeStudies = free;
        }
}

