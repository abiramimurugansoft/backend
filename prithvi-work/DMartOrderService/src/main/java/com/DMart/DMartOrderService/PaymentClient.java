package com.DMart.DMartOrderService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PAYMENT-SERVICE",fallback = PaymentClientFallback.class)
public interface PaymentClient {

    @GetMapping("/api/payments/{id}")
    PaymentResponse getPaymentById(
            @PathVariable("id") Long id);
}
