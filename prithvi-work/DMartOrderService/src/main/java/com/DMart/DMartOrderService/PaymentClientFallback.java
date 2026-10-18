package com.DMart.DMartOrderService;

import org.springframework.stereotype.Component;

@Component
public class PaymentClientFallback implements PaymentClient {

    @Override
    public PaymentResponse getPaymentById(Long id) {
        // Return a default response or handle the fallback logic here
        PaymentResponse fallbackResponse = new PaymentResponse();
        fallbackResponse.id = id;
        fallbackResponse.status = "Fallback: Payment service unavailable";
        fallbackResponse.amount = null; // or set a default amount if needed
        return fallbackResponse;
    }
}
