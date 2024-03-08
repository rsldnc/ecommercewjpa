package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
