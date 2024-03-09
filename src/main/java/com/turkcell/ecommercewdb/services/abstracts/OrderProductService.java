package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.OrderProduct;

import java.util.List;

public interface OrderProductService {
    List<OrderProduct> getAll();
    List<String> getProducts();
}
