package com.holix.holix_server.club.code;

import com.holix.holix_server.global.code.ErrorCode;
import org.springframework.http.HttpStatus;

public enum ClubErrorCode implements ErrorCode {

    CLUB_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 클럽을 찾을 수 없습니다.");

    private final HttpStatus status;
    private final String errorMessage;

    ClubErrorCode(HttpStatus httpStatus, String errorMessage) {
        this.status = httpStatus;
        this.errorMessage = errorMessage;
    }

    @Override
    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }
}
