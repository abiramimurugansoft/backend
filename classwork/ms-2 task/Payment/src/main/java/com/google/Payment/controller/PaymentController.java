package com.google.Payment.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final Map<Integer, Map<String,Object>> payments =
            new ConcurrentHashMap<>();

    @PostMapping("/{orderId}")
    public Map<String,Object> makePayment(
            @PathVariable int orderId,
            @RequestParam double amount
    ){

        Map<String,Object> payment = new HashMap<>();

        payment.put("orderId",orderId);
        payment.put("amount",amount);
        payment.put("status","SUCCESS");

        payments.put(orderId,payment);
        return payment;
    }


    @GetMapping("/{orderId}")
    public Map<String, Object> getPayment(
            @PathVariable int orderId){
        return payments.getOrDefault(
                orderId, Map.of("message","Payment not found")
        );

    }
}
