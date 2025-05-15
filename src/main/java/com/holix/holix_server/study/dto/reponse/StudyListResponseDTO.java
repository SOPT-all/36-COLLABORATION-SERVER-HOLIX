package com.holix.holix_server.study.dto.reponse;

import lombok.Getter;

import java.util.List;

@Getter
public class StudyListResponseDTO {
        private final List<StudyResponseDTO> passionateStudyResponseDTOList;
        private final List<StudyResponseDTO> insightStudyResponseDTOList;
        private final List<StudyResponseDTO> newStudyResponseDTOList;
        private final List<StudyResponseDTO> recommendedStudyResponseDTOList;
        private final List<StudyResponseDTO> freeStudyResponseDTOList;

        public StudyListResponseDTO(
                List<StudyResponseDTO> passionate,
                List<StudyResponseDTO> insight,
                List<StudyResponseDTO> news,
                List<StudyResponseDTO> recommended,
                List<StudyResponseDTO> free
        ) {
                this.passionateStudyResponseDTOList = passionate;
                this.insightStudyResponseDTOList = insight;
                this.newStudyResponseDTOList = news;
                this.recommendedStudyResponseDTOList = recommended;
                this.freeStudyResponseDTOList = free;
        }
}

