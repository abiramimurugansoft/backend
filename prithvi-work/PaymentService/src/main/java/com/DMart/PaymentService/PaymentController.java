package com.DMart.PaymentService;

import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @GetMapping("/{id}")
    public PaymentResponse getPayment(@PathVariable Long id) {
       // Thread.sleep();
        if(id == 101L){
            throw new RuntimeException("Payment service is down");
        }
        return new PaymentResponse(
                id, "SUCCESS", new BigDecimal("1500.00"));
    }


}

