package com.holix.holix_server.club.dto.response;

import java.util.List;

public record ClubListResponseDTO(
        List<ClubResponseDTO> clubListResponseDTO
) {
    public static ClubListResponseDTO from(List<ClubResponseDTO> clubResponseDTOList) {
        return new ClubListResponseDTO(clubResponseDTOList);
    }
}
