package com.holix.holix_server.club.dto.response;

import com.holix.holix_server.club.extension.ClubExtension;
import com.holix.holix_server.club.model.Club;

public record ClubResponseDTO(
        Long clubId,
        String title,
        Boolean isPinned,
        String url,
        String participants
) {
    public static ClubResponseDTO from(Club club) {
        return new ClubResponseDTO(
                club.getClubId(),
                club.getClubTitle(),
                club.getIsPinned(),
                club.getImgUrl(),
                ClubExtension.formatParticipants(club.getParticipants(), club.getMaxParticipants())
        );
    }
}
