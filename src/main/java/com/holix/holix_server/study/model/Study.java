package com.holix.holix_server.study.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Table(name = "study")
@Entity
public class Study {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "study_id", nullable = false)
    private Long studyId;

    @Column(name = "study_title", nullable = false)
    private String studyTitle;

    @Column(name = "user", nullable = false)
    private String user;

    @Column(name = "price", nullable = false)
    private String price;

    @Column(name = "img_url", nullable = false)
    private String imgUrl;

    @Column(name = "category", nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category;

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
