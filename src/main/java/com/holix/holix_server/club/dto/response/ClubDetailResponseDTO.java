package com.holix.holix_server.club.dto.response;

import com.holix.holix_server.club.extension.ClubExtension;
import com.holix.holix_server.club.model.Club;

public record ClubDetailResponseDTO(
        Long clubId,
        String title,
        String url,
        String participants,
        String notice
) {
    public static ClubDetailResponseDTO from(Club club) {
        return new ClubDetailResponseDTO(
                club.getClubId(),
                club.getClubTitle(),
                club.getImgUrl(),
                ClubExtension.formatParticipants(club.getParticipants(), club.getMaxParticipants()),
                club.getNotice()
        );
    }
}
