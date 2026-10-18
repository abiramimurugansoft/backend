package com.msoft.correncyconverter.serviceImpl;


import com.msoft.correncyconverter.Repository.ConversionHistoryRepository;
import com.msoft.correncyconverter.apiresponse.ApiResponse;
import com.msoft.correncyconverter.dto.ConversionResponseDto;
import com.msoft.correncyconverter.pojo.ConversionRequest;
import com.msoft.correncyconverter.service.CurrencyService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    private final RestTemplate restTemplate;
    private final ConversionHistoryRepository conversionHistoryRepository;



    public CurrencyServiceImpl(RestTemplate restTemplate, ConversionHistoryRepository conversionHistoryRepository){
        this.restTemplate = restTemplate;
        this.conversionHistoryRepository =conversionHistoryRepository;
    }


    @Override
    public ResponseEntity<ApiResponse<ConversionResponseDto>> convert(ConversionRequest request) {
        return null;
    }
}
