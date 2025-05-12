package com.holix.holix_server.club.service;

import com.holix.holix_server.club.code.ClubErrorCode;
import com.holix.holix_server.club.dto.request.ChattingCreateRequestDTO;
import com.holix.holix_server.club.dto.response.ChattingListResponseDTO;
import com.holix.holix_server.club.dto.response.ChattingResponseDTO;
import com.holix.holix_server.club.model.Chatting;
import com.holix.holix_server.club.model.ChattingType;
import com.holix.holix_server.club.model.Club;
import com.holix.holix_server.club.repository.ChattingRepository;
import com.holix.holix_server.club.repository.ClubRepository;
import com.holix.holix_server.global.exception.BusinessException;
import com.holix.holix_server.user.code.UserErrorCode;
import com.holix.holix_server.user.model.User;
import com.holix.holix_server.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClubService {

    private final ClubRepository clubRepository;
    private final ChattingRepository chattingRepository;
    private final UserRepository userRepository;

    public ChattingListResponseDTO getChatting(Long clubId) {
        Club club = clubRepository.findById(clubId)
                .orElseThrow(() -> new BusinessException(ClubErrorCode.CLUB_NOT_FOUND));

        List<Chatting> chattingList = chattingRepository.findChattingByClub(club);

        return ChattingListResponseDTO.from(chattingList.stream()
                .map(chatting -> {
                    Long userId = chatting.getUser().getUserId();
                    User user = userRepository.findById(userId)
                            .orElseThrow(() -> new BusinessException(UserErrorCode.USER_NOT_FOUND));
                    return ChattingResponseDTO.from(chatting, user);
                })
                .toList());
    }

    public void createChatting(Long clubId, ChattingCreateRequestDTO chattingCreateRequestDTO) {
        Club club = clubRepository.findById(clubId)
                .orElseThrow(() -> new BusinessException(ClubErrorCode.CLUB_NOT_FOUND));

        User user = userRepository.findById(1L)
                .orElseThrow(() -> new BusinessException(UserErrorCode.USER_NOT_FOUND));

        Chatting chatting = Chatting.builder()
                .user(user)
                .club(club)
                .contents(chattingCreateRequestDTO.contents())
                .likes(0)
                .chattingType(ChattingType.USER)
                .build();

        chattingRepository.save(chatting);
    }
}
