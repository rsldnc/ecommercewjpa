package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.Customer;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerFullNameResponse;
import com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerProductResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "Select new com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerFullNameResponse" +
            "(c.firstName, c.lastName)" +
            " from Customer c" +
            " WHERE lower(c.firstName) LIKE %:query%")
    List<CustomerFullNameResponse> searchInNames(String query);

    @Query(value = "Select new com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerFullNameResponse" +
            "(c.firstName, c.lastName)" +
            " from Customer c JOIN c.orders o" +
            " JOIN o.payment p" +
            " JOIN p.paymentTypes pt" +
            " WHERE lower(pt.type) = lower(:query)")
    List<CustomerFullNameResponse> findByPaymentMethod(String query);

    @Query(value = "Select new com.turkcell.ecommercewdb.services.dtos.customer.responses.CustomerProductResponse" +
            "(c.firstName, c.lastName, p.name)" +
            " from Customer c JOIN c.orders o" +
            " JOIN o.orderProductList op" +
            " JOIN op.product p")
    List<CustomerProductResponse> getPurchasedProducts();
}