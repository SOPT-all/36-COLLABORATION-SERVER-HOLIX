package com.holix.holix_server.study.dto.reponse;

import com.holix.holix_server.study.model.Study;
import com.holix.holix_server.study.model.submodel.Tag;
import lombok.Getter;

import java.util.List;

@Getter
public class StudyResponseDTO {

    private final Long studyId;
    private final String studyTitle;
    private final String studyLeader;
    private final String price;
    private final String url;
    private final List<TagResponseDTO> tags;
    private final String category;

    public StudyResponseDTO(Study study) {
        this.studyId = study.getStudyId();
        this.studyTitle = study.getStudyTitle();
        this.studyLeader = study.getUser();
        this.price = study.getPrice();
        this.url = study.getImgUrl();
        this.category = study.getCategory().getCategoryName();

        this.tags = study.getStudyTags().stream()
                .map(studyTag -> new TagResponseDTO(
                        studyTag.getTag().getTagId(),
                        studyTag.getTag().getTagName(),
                        studyTag.getTag().getTagColor()))
                .toList();
    }
}
