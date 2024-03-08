package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.Customer;
import com.turkcell.ecommercewdb.repositories.CustomerRepository;
import com.turkcell.ecommercewdb.services.abstracts.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
