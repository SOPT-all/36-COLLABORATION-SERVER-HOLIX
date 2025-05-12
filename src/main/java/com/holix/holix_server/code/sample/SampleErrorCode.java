package com.holix.holix_server.code.sample;

import com.holix.holix_server.code.ErrorCode;
import org.springframework.http.HttpStatus;

public enum SampleErrorCode implements ErrorCode {
    ID_BLANK_ERROR(HttpStatus.BAD_REQUEST, "sampleId는 비어있을 수 없습니다."),
    ID_VALUE_ERROR(HttpStatus.BAD_REQUEST, "sampleId는 1이여야 합니다.");

    private final HttpStatus status;
    private final String errorMessage;

    SampleErrorCode(HttpStatus httpStatus, String errorMessage) {
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
