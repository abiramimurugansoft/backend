package com.google.order.controller;

import com.google.order.ServiceImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderServiceImpl){
        this.orderService = orderServiceImpl;
    }

    @GetMapping("/{orderId}/payment")
    public String getPaymentStatus(
            @PathVariable Integer orderId){
        return orderService.getPaymentStatus(orderId);

    }



}
