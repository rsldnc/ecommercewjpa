package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
