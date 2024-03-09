package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Integer> {
    @Query("SELECT DISTINCT p.name FROM OrderProduct op JOIN op.product p")
    List<String> getProducts();
}
