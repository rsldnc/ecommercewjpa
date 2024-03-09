package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.OrderProduct;
import com.turkcell.ecommercewdb.services.abstracts.OrderProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ordersproducts")
@AllArgsConstructor
public class OrdersProductsController {
    private final OrderProductService orderProductService;

    @GetMapping
    public List<OrderProduct> getAll()
    {
        return orderProductService.getAll();
    }

    @GetMapping("products")
    List<String> products()
    {
        return orderProductService.getProducts();
    }
}
