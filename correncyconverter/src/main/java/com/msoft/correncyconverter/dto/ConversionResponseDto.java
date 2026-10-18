package com.msoft.correncyconverter.dto;

import java.math.BigDecimal;
import java.time.Instant;

public class ConversionResponseDto {
   private Long transactionId;
   private String fromCurrency;
   private String toCurrency;
   private BigDecimal amount;
   private BigDecimal exchangeRate;
   private BigDecimal convertedAmount;
   private Instant createdAt;

   ConversionResponseDto(){}


}
