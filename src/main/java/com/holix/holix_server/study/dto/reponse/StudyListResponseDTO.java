package com.holix.holix_server.study.dto.reponse;

import java.util.List;

public record StudyListResponseDTO(
        Long id,
        String title,
        String leader,
        String price,
        String url,
        List<TagResponseDTO> tags,
        String category
        ) {
}
