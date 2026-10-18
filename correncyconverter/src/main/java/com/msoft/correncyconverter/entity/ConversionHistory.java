package com.msoft.correncyconverter.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="conversion_history")
public class ConversionHistory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false,length=3)
    private String fromCurrency;

    @Column(nullable=false,length=3)
    private String toCurrency;

    @Column(nullable=false, precision=19, scale=4)
    private BigDecimal amount;

    @Column(nullable=false, precision=19, scale=8)
    private BigDecimal exchangeRate;

    @Column(nullable=false, precision=19, scale=4)
    private BigDecimal convertedAmount;

    @Column(nullable=false)
    private Date createdAt;


    @PrePersist
    public void onCreate() {
        if (createdAt == null){
            createdAt = new Date();
        }
    }


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id =id;
    }

    public String getFromCurrency(){
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency){
        this.fromCurrency =fromCurrency;
    }

    public String getToCurrency(){
        return toCurrency;
    }

    public void setToCurrency(String toCurrency){
        this.toCurrency = toCurrency;
    }

    public BigDecimal getAmount(){
        return amount;
    }

    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }


    public BigDecimal getExchangeRate(){
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate){
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getConvertedAmount(){
        return convertedAmount;
    }

    public void setConvertedAmount(BigDecimal convertedAmount){
        this.convertedAmount = convertedAmount;
    }
}
