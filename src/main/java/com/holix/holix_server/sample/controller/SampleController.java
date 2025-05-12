package com.holix.holix_server.sample.controller;

import com.holix.holix_server.global.code.CommonSuccessCode;
import com.holix.holix_server.global.response.HolixResponse;
import com.holix.holix_server.sample.dto.response.SampleResponseDTO;
import com.holix.holix_server.sample.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SampleController {
    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/sample/{sampleId}")
    public HolixResponse<SampleResponseDTO> getSampleData(
            @PathVariable final Long sampleId
    ) {
        return HolixResponse.success(CommonSuccessCode.OK, sampleService.getSampleData(sampleId));
    }
}
