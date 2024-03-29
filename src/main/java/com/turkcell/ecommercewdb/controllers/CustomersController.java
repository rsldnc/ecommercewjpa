package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Customer;
import com.turkcell.ecommercewdb.services.abstracts.CustomerService;
import com.turkcell.ecommercewdb.services.dtos.customer.requests.AddCustomerRequest;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerFullNameResponse;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerOrderProductAmount;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerProductResponse;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerTypesResponse;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerWithOrderAmountsResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("purchasedProducts")
    public List<CustomerProductResponse> getPurchasedProducts()
    {
        return customerService.getPurchasedProducts();
    }

    @GetMapping("productCountGreaterThan")
    public List<CustomerOrderProductAmount> getProductCountGreaterThan(int productCount)
    {
        return customerService.getProductCountGreaterThan(productCount);
    }

    @GetMapping("customersPaysWithCouponsAndAmounts")
    public List<CustomerWithOrderAmountsResponse> getCustomersPaysWithCouponsAndAmounts(){
       return customerService.getCustomersPaysWithCouponsAndAmounts();
    }

    @GetMapping("customerPurchasedMostProduct")
    public CustomerOrderProductAmount customerPurchasedMostProduct()
    {
        return customerService.getCustomerPurchasedMostProduct();
    }

    @PostMapping
    public void add(@RequestBody @Valid AddCustomerRequest request)
    {
        customerService.add(request);
    }
}
