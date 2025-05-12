package com.holix.holix_server.global.exception;

import com.holix.holix_server.global.code.ErrorCode;

public class NoHandlerFoundException extends RuntimeException {
    private final ErrorCode errorCode;

    public NoHandlerFoundException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
