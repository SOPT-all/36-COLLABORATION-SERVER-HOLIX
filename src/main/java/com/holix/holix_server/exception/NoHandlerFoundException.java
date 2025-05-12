package com.holix.holix_server.exception;

import com.holix.holix_server.code.ErrorCode;

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
