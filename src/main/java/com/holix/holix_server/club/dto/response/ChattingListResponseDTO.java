package com.holix.holix_server.club.dto.response;

import java.util.List;

public record ChattingListResponseDTO(List<ChattingResponseDTO> chattingResponseDTOList) {
    public static ChattingListResponseDTO from(List<ChattingResponseDTO> chattingResponseDTOList){
        return new ChattingListResponseDTO(chattingResponseDTOList);
    }
}
