package com.google.payment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/{orderId}")
    public String getPayment(@PathVariable Integer orderId){
        return "Payment details for order"+orderId;
    }
}
