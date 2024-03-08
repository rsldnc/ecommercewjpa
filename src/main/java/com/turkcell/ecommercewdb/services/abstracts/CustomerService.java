package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
}
