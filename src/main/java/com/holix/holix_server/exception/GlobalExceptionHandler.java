package com.holix.holix_server.exception;

import com.holix.holix_server.code.CommonErrorCode;
import com.holix.holix_server.dto.response.HolixResponse;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public HolixResponse<Void> handleSampleException(BusinessException e) {
        return HolixResponse.failure(e.getErrorCode());
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public HolixResponse<Void> handleNoHandlerFoundException(NoHandlerFoundException e) {
        return HolixResponse.failure(CommonErrorCode.INVALID_URL_ERROR);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public HolixResponse<Void> handleMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return HolixResponse.failure(CommonErrorCode.METHOD_NOT_ALLOWED_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public HolixResponse<Void> handleInternalServerException(Exception e) {
        return HolixResponse.failure(CommonErrorCode.METHOD_NOT_ALLOWED_ERROR);
    }
}
