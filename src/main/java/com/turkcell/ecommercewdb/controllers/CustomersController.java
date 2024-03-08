package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Customer;
import com.turkcell.ecommercewdb.services.abstracts.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomersController {
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getAll()
    {
        return customerService.getAll();
    }
}
