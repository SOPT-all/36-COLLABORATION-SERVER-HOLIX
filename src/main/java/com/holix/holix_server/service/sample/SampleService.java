package com.holix.holix_server.service.sample;

import com.holix.holix_server.code.sample.SampleErrorCode;
import com.holix.holix_server.dto.response.sample.SampleResponseDTO;
import com.holix.holix_server.exception.BusinessException;
import org.springframework.stereotype.Service;

import static com.holix.holix_server.service.sample.SampleConstant.VALID_SAMPLE_ID;

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
