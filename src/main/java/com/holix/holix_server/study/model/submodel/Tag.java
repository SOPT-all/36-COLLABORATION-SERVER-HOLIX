package com.holix.holix_server.study.model.submodel;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tagId;

    @Column(name = "tag_name", nullable = false)
    private String tagName;

    @Column(name = "tag_color", nullable = false)
    private  String tagColor;

    protected Tag(){
    }

    protected Tag(
            String tagName,
            String tagColor
    ) {
        this.tagName = tagName;
        this.tagColor = tagColor;
    }

}
