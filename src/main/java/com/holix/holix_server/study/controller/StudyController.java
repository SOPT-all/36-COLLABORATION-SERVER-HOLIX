package com.holix.holix_server.study.controller;


import com.holix.holix_server.global.code.CommonSuccessCode;
import com.holix.holix_server.global.response.HolixResponse;
import com.holix.holix_server.sample.dto.response.SampleResponseDTO;
import com.holix.holix_server.sample.service.SampleService;
import com.holix.holix_server.study.dto.reponse.StudyListResponseDTO;
import com.holix.holix_server.study.service.StudyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
