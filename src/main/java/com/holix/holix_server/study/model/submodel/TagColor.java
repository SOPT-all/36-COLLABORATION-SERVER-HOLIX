package com.holix.holix_server.study.model.submodel;

import lombok.Getter;

@Getter
public enum TagColor {
    BLUE("blue"),
    BLACK("black");

    private final String colorName;

    TagColor (String colorName) {
        this.colorName = colorName;
    }
}
