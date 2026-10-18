package com.google.Order.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final RestTemplate restTemplate;

    private final AtomicInteger counter = new AtomicInteger(100);

    private final Map<Integer, Map<String,Object>> orders =
            new ConcurrentHashMap<>();

    public OrderController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public Map<String,Object> createOrder(
            @RequestBody Map<String,Object> request){

        int orderId = counter.incrementAndGet();
        double price = Double.parseDouble
                (request.get("price").toString());

        Map<String,Object> order=new HashMap<>();
        order.put("orderId",orderId);
        order.put("productName",request.get("productName"));
        order.put("price",price);

        orders.put(orderId,order);

        String url = "http://PAYMENT/payment/"
                +orderId + "?amount=" +price;

        Map payment = restTemplate.postForObject(
                url,null,Map.class
        );
        System.out.println("ordered the productddd");

        order.put("payment",payment);
           return order;

    }

    @GetMapping("/{orderId}")
    public Map<String, Object> getOrder(
            @PathVariable int orderId
    ){
        return orders.getOrDefault(
                orderId,Map.of("message","Order not found")
        );
    }



}
