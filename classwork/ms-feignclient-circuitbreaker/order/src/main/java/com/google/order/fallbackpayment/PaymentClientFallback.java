package com.google.order.fallbackpayment;

import com.google.order.feignclient.PaymentClient;
import org.springframework.stereotype.Component;

@Component
public class PaymentClientFallback implements PaymentClient {

    @Override
    public String getPaymentStatus(Integer orderId){
        return "Payment Service is unavailable"
                +"Please try again later for order."+orderId;
    }


}
