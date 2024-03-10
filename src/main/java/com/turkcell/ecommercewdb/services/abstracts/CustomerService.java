package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.Customer;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerFullNameResponse;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerProductResponse;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerTypesResponse;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    List<CustomerFullNameResponse> searchInNames(String query);
    List<CustomerFullNameResponse> findByPaymentMethod(String query);
    List<CustomerProductResponse> getPurchasedProducts();

    List<CustomerTypesResponse> getCustomerAndTypes();
}
