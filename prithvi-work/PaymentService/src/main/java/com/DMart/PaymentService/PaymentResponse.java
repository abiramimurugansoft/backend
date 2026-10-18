package com.DMart.PaymentService;

import java.math.BigDecimal;

public class PaymentResponse {

            Long id;
            String status;
            BigDecimal amount;

    public PaymentResponse(Long id, String success, BigDecimal bigDecimal) {
        this.id = id;
        this.status = success;
        this.amount = bigDecimal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
