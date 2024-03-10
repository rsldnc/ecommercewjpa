package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.OrderProduct;
import com.turkcell.ecommercewdb.services.dtos.orderProduct.requests.AddOrderProductRequest;

import java.util.List;

public interface OrderProductService {
    List<OrderProduct> getAll();
    List<String> getProducts();

    void add(AddOrderProductRequest request);
}
