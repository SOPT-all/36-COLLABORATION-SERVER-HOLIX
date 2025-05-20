package com.holix.holix_server.study.model;

import com.holix.holix_server.study.model.submodel.Tag;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class StudyTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_id", nullable = false)
    private Study study;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id", nullable = false)
    private Tag tag;

    protected StudyTag() {}

    protected StudyTag(Study study, Tag tag) {
        this.study = study;
        this.tag = tag;
    }
}