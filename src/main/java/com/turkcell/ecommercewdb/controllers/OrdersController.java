package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Order;
import com.turkcell.ecommercewdb.services.abstracts.OrderService;
import com.turkcell.ecommercewdb.services.dtos.order.requests.AddOrderRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void add(@RequestBody @Valid AddOrderRequest request)
    {
        orderService.add(request);
    }
}
