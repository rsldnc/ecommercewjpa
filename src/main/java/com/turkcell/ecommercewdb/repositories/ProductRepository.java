package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.entities.Product;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductCategoryNameResponse;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductStockResponse;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query(value = "SELECT new com.turkcell.ecommercewdb.services.dtos.product.responses.ProductCategoryNameResponse" +
            "(p.name, c.name)" +
            "from Product p JOIN p.category c")
    List<ProductCategoryNameResponse> getProductCategoryName();

    @Query(value = "SELECT new com.turkcell.ecommercewdb.services.dtos.product.responses.ProductStockResponse" +
            "(p.name, p.stock)" +
            "from Product p")
    List<ProductStockResponse> getProductStock();
}