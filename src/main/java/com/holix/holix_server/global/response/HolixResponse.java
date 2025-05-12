package com.holix.holix_server.global.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.holix.holix_server.global.code.ErrorCode;
import com.holix.holix_server.global.code.SuccessCode;

public record HolixResponse<T>(
        int code,
        String message,
        @JsonInclude(value = JsonInclude.Include.NON_NULL)
        T data
) {
    // response body 가 필요하지 않은 경우 사용합니다
    public static <T> HolixResponse<T> success(SuccessCode successCode) {
        return new HolixResponse<>(successCode.getStatus().value(), successCode.getMessage(), null);
    }

    // response body 가 필요한 경우 사용합니다
    public static <T> HolixResponse<T> success(SuccessCode successCode, T data) {
        return new HolixResponse<>(successCode.getStatus().value(), successCode.getMessage(), data);
    }

    public static <T> HolixResponse<T> failure(ErrorCode failureCode) {
        return new HolixResponse<>(failureCode.getStatus().value(), failureCode.getMessage(), null);
    }
}
