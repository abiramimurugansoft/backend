package com.msoft.correncyconverter.controller;


import com.msoft.correncyconverter.apiresponse.ApiResponse;
import com.msoft.correncyconverter.dto.ConversionResponseDto;
import com.msoft.correncyconverter.pojo.ConversionRequest;
import com.msoft.correncyconverter.service.CurrencyService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService){
        this.currencyService = currencyService;
    }

    @PostMapping("/convert")
    public ResponseEntity<ApiResponse<ConversionResponseDto>> convert(
            @Valid @RequestBody ConversionRequest request
    ){
        return currencyService.convert(request);
    }


}
