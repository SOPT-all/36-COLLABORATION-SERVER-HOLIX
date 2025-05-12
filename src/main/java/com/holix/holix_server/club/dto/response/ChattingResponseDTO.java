package com.holix.holix_server.club.dto.response;

import com.holix.holix_server.club.model.Chatting;
import com.holix.holix_server.club.model.ChattingType;
import com.holix.holix_server.user.model.User;

import java.time.LocalDateTime;

public record ChattingResponseDTO(Long chattingId,
                                  Long clubId,
                                  String userName,
                                  String introduction,
                                  String imageUrl,
                                  String contents,
                                  Integer likes,
                                  ChattingType chattingType,
                                  boolean isMine,
                                  LocalDateTime createdAt) {
    public static ChattingResponseDTO from(Chatting chatting, User user) {
        return new ChattingResponseDTO(
                chatting.getChattingId(),
                chatting.getClub().getClubId(),
                user.getUsername(),
                user.getIntroduction(),
                user.getImgUrl(),
                chatting.getContents(),
                chatting.getLikes(),
                chatting.getChattingType(),
                chatting.isMine(),
                chatting.getCreatedAt()
        );
    }
}
