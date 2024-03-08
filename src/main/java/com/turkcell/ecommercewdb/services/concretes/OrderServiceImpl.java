package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.Order;
import com.turkcell.ecommercewdb.repositories.OrderRepository;
import com.turkcell.ecommercewdb.services.abstracts.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;


    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }
}
