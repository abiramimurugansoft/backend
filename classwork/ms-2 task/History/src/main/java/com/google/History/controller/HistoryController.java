package com.google.History.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/history")
public class HistoryController {

    private final RestTemplate restTemplate;

    public HistoryController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }


    @GetMapping("/{orderId}")
    public Map<String,Object> getHistory(
            @PathVariable int orderId
    ){
        Map order = restTemplate.getForObject(
                "http://ORDER/orders/" +orderId,Map.class
        );

        Map payment = restTemplate.getForObject(
                "http://PAYMENT/payment/" + orderId,
                Map.class
        );

        Map<String, Object> history = new HashMap<>();
        history.put("order",order);
        history.put("payment",payment);

        return history;

    }
}
