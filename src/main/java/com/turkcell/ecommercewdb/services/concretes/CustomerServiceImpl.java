package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.Customer;
import com.turkcell.ecommercewdb.repositories.CustomerRepository;
import com.turkcell.ecommercewdb.services.abstracts.CustomerService;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerFullNameResponse;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerOrderProductAmount;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerProductResponse;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerTypesResponse;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerWithOrderAmountsResponse;
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

    @Override
    public List<CustomerFullNameResponse> searchInNames(String query) {
        return customerRepository.searchInNames(query);
    }

    @Override
    public List<CustomerFullNameResponse> findByPaymentMethod(String query) {
        return customerRepository.findByPaymentMethod(query);
    }

    @Override
    public List<CustomerProductResponse> getPurchasedProducts() {
        return customerRepository.getPurchasedProducts();
    }

    @Override
    public List<CustomerTypesResponse> getCustomerAndTypes() {
        return customerRepository.getCustomerAndTypes();
    }

    @Override
    public List<CustomerOrderProductAmount> getProductCountGreaterThan(int productCount) {
        return customerRepository.getCustomersProductCountGreaterThan(productCount);
    }

    @Override
    public CustomerOrderProductAmount getCustomerPurchasedMostProduct() {
        return customerRepository.getCustomerPurchasedMostProduct().get(0);
    }

    @Override
    public List<CustomerWithOrderAmountsResponse> getCustomersPaysWithCouponsAndAmounts() {
        return customerRepository.getCustomersPaysWithCouponsAndAmounts();
    }
}
