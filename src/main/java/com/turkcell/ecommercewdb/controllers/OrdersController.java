package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Order;
import com.turkcell.ecommercewdb.services.abstracts.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@AllArgsConstructor
public class OrdersController {
    private final OrderService orderService;

    @GetMapping
    public List<Order> getAll()
    {
        return orderService.getAll();
    }
}
