package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();
}
