package com.chittifoodss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.chittifoodss.model.Order;
import com.chittifoodss.service.OrderService;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order placeOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }
}