package com.msoft.correncyconverter.service;

import com.msoft.correncyconverter.apiresponse.ApiResponse;
import com.msoft.correncyconverter.dto.ConversionResponseDto;
import com.msoft.correncyconverter.pojo.ConversionRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface CurrencyService {
    public ResponseEntity<ApiResponse<ConversionResponseDto>> convert(@Valid ConversionRequest request);

}
