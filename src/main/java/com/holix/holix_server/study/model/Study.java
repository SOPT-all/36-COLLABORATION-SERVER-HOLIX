package com.holix.holix_server.study.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Study {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studyId;

    @Column(nullable = false)
    private String studyTitle;

    @Column(nullable = false)
    private String user;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private String imgUrl;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToMany(mappedBy = "study", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudyTag> studyTags = new ArrayList<>();

    protected Study() {
    }

    protected Study(
            String studyTitle,
            String user,
            String price,
            String imgUrl,
            Category category
    ) {
        this.studyTitle = studyTitle;
        this.user = user;
        this.price = price;
        this.imgUrl = imgUrl;
        this.category = category;
    }
}
