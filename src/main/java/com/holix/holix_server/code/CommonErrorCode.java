package com.holix.holix_server.code;

import org.springframework.http.HttpStatus;

public enum CommonErrorCode implements ErrorCode {
    // 404 Not Found
    INVALID_URL_ERROR(HttpStatus.BAD_REQUEST, "지원하지 않는 URL 입니다."),

    // 405 Method Not Allowed
    METHOD_NOT_ALLOWED_ERROR(HttpStatus.METHOD_NOT_ALLOWED, "잘못된 HTTP method 요청입니다."),

    // 500 Internal Server Error
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 오류입니다.");

    private final HttpStatus status;
    private final String errorMessage;

    CommonErrorCode(HttpStatus httpStatus, String errorMessage) {
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
