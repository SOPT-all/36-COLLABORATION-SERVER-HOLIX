package com.holix.holix_server.study.controller;

import com.holix.holix_server.global.code.CommonSuccessCode;
import com.holix.holix_server.global.response.HolixResponse;
import com.holix.holix_server.study.dto.reponse.StudyListResponseDTO;
import com.holix.holix_server.study.dto.reponse.StudyResponseDTO;
import com.holix.holix_server.study.model.Category;
import com.holix.holix_server.study.service.StudyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudyController {
    private final StudyService studyService;

    public StudyController(StudyService studyService) {
        this.studyService = studyService;
    }

    @GetMapping("/main")
    public HolixResponse<StudyListResponseDTO> getStudyData(
    ) {
        return HolixResponse.success(CommonSuccessCode.OK, studyService.findAll());
    }
}
