package com.msoft.correncyconverter.pojo;

import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.util.Date;

public class ConversionRequest {

    private Long id;
    private String fromCurrency;
    private String toCurrency;
    private BigDecimal amount;
    private BigDecimal exchangeRate;
    private BigDecimal convertedAmount;
    private Date createdAt;





}
