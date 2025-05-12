package com.holix.holix_server.sample.service;

import com.holix.holix_server.sample.code.SampleErrorCode;
import com.holix.holix_server.sample.dto.response.SampleResponseDTO;
import com.holix.holix_server.global.exception.BusinessException;
import org.springframework.stereotype.Service;

import static com.holix.holix_server.sample.service.SampleConstant.VALID_SAMPLE_ID;

@Service
public class SampleService {
    public SampleResponseDTO getSampleData(final Long sampleId) {
        if (sampleId == null) {
            throw new BusinessException(SampleErrorCode.ID_BLANK_ERROR);
        }
        if (!sampleId.equals(VALID_SAMPLE_ID))
            throw new BusinessException(SampleErrorCode.ID_VALUE_ERROR);
        return new SampleResponseDTO(sampleId);
    }
}
