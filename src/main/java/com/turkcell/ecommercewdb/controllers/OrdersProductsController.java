package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.OrderProduct;
import com.turkcell.ecommercewdb.services.abstracts.OrderProductService;
import com.turkcell.ecommercewdb.services.dtos.customerType.requests.AddCustomerTypeRequest;
import com.turkcell.ecommercewdb.services.dtos.orderProduct.requests.AddOrderProductRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void add(@RequestBody @Valid AddOrderProductRequest request)
    {
        orderProductService.add(request);
    }
}
