package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.OrderProduct;
import com.turkcell.ecommercewdb.repositories.OrderProductRepository;
import com.turkcell.ecommercewdb.services.abstracts.OrderProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderProductServiceImpl implements OrderProductService {

    private final OrderProductRepository orderProductRepository;

    @Override
    public List<OrderProduct> getAll() {
        return orderProductRepository.findAll();
    }

    @Override
    public List<String> getProducts() {
        return orderProductRepository.getProducts();
    }
}
