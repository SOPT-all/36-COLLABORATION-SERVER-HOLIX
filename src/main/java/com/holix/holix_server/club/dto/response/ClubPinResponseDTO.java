package com.holix.holix_server.club.dto.response;

public record ClubPinResponseDTO(Boolean isPinned) {
    public static ClubPinResponseDTO from(Boolean isPinned) {
        return new ClubPinResponseDTO(isPinned);
    }
}
