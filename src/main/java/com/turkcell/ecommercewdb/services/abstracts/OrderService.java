package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.Order;
import com.turkcell.ecommercewdb.services.dtos.order.requests.AddOrderRequest;

import java.util.List;

public interface OrderService {
    List<Order> getAll();

    void add(AddOrderRequest request);
}
