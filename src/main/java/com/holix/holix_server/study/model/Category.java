package com.holix.holix_server.study.model;

import lombok.Getter;

@Getter
public enum Category {
    PASSIONATE("활발한 스터디에 참여해보세요"),
    INSIGHT("북클럽과 세미나로 인사이트 충전"),
    NEW("새로 올라온 강의"),
    RECOMMENDED("추천 멘토링"),
    FREE("무료 커뮤니티");

    private final String categoryName;

    Category (String categoryName) {
        this.categoryName = categoryName;
    }
}
