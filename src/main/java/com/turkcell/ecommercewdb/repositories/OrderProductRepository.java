package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Integer> {

}
