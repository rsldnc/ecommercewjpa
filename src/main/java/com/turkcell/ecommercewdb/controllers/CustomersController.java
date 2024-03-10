package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Customer;
import com.turkcell.ecommercewdb.services.abstracts.CustomerService;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerFullNameResponse;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerProductResponse;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerTypesResponse;
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

    @GetMapping("searchName")
    public List<CustomerFullNameResponse> searchName(String query)
    {
        return customerService.searchInNames(query);
    }

    @GetMapping("findByPaymentMethod")
    public List<CustomerFullNameResponse> findByPaymentMethod(String query)
    {
        return customerService.findByPaymentMethod(query);
    }

    @GetMapping("customersAndTypes")
    public List<CustomerTypesResponse> getCustomerAndTypes(){
        return customerService.getCustomerAndTypes();
    }

    @GetMapping("PurchasedProducts")
    public List<CustomerProductResponse> getPurchasedProducts()
    {
        return customerService.getPurchasedProducts();
    }
}
