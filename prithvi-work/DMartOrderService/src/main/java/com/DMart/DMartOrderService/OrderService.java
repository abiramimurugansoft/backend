package com.DMart.DMartOrderService;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentClient paymentClient;

    public OrderService(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    public PaymentResponse getPayment(Long id) {
        return paymentClient.getPaymentById(id);
    }
}

