package com.google.order.feignclient;


import com.google.order.fallbackpayment.PaymentClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name="PAYMENT",
        fallback= PaymentClientFallback.class
)
public interface PaymentClient {

    @GetMapping("/payment/{orderId}")
    String getPaymentStatus(@PathVariable("orderId") Integer orderId);

}
