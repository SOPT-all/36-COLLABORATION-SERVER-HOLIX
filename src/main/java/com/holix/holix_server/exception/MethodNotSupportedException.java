package com.holix.holix_server.exception;

import com.holix.holix_server.code.ErrorCode;

public class MethodNotSupportedException extends RuntimeException {
    private final ErrorCode errorCode;

    public MethodNotSupportedException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
