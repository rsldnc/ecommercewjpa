package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.Customer;
import com.turkcell.ecommercewdb.entities.Order;
import com.turkcell.ecommercewdb.entities.Payment;
import com.turkcell.ecommercewdb.repositories.OrderRepository;
import com.turkcell.ecommercewdb.services.abstracts.OrderService;
import com.turkcell.ecommercewdb.services.dtos.order.requests.AddOrderRequest;
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

    @Override
    public void add(AddOrderRequest request) {
        Payment payment = new Payment();
        payment.setId(request.getPaymentId());
        Customer customer = new Customer();
        customer.setId(request.getCustomerId());

        Order order = new Order();
        order.setStatus(request.getStatus());
        order.setAmount(request.getAmount());
        order.setPayment(payment);
        order.setCustomer(customer);

        orderRepository.save(order);
    }
}
