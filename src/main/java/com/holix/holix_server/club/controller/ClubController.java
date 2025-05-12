package com.holix.holix_server.club.controller;

import com.holix.holix_server.club.dto.request.ChattingCreateRequestDTO;
import com.holix.holix_server.club.dto.response.ChattingListResponseDTO;
import com.holix.holix_server.club.dto.response.ChattingResponseDTO;
import com.holix.holix_server.club.service.ClubService;
import com.holix.holix_server.global.code.CommonSuccessCode;
import com.holix.holix_server.global.response.HolixResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/club")
public class ClubController {

    private final ClubService clubService;

    @GetMapping("/{clubId}/chat")
    public HolixResponse<ChattingListResponseDTO> getChatting(
            @PathVariable final Long clubId
    ) {
        return HolixResponse.success(CommonSuccessCode.OK, clubService.getChatting(clubId));
    }

    @PostMapping("/{clubId}/chat")
    public HolixResponse<Void> createChatting(
            @PathVariable final Long clubId,
            @RequestBody ChattingCreateRequestDTO chattingCreateRequestDTO
    ) {
        clubService.createChatting(clubId, chattingCreateRequestDTO);
        return HolixResponse.success(CommonSuccessCode.OK);
    }
}
