package com.DMart.DMartOrderService;




import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/payment/{id}")
    public PaymentResponse getPayment(@PathVariable Long id) {
        return orderService.getPayment(id);
    }
}

