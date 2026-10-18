package com.google.order.ServiceImpl;

import com.google.order.feignclient.PaymentClient;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl {

    private final PaymentClient paymentClient;

    public OrderServiceImpl(PaymentClient paymentClient){
        this.paymentClient = paymentClient;
    }

    public String getPaymentStatus(Integer orderId) {
        return paymentClient.getPaymentStatus(orderId);
    }
}
