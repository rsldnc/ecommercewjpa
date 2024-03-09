package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.entities.Product;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductCategoryNameResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    //SELECT p.name ,c.name
    //FROM products p, categories c
    //WHERE p.categoryid = c.id;
    @Query(value = "SELECT new com.turkcell.ecommercewdb.services.dtos.product.responses.ProductCategoryNameResponse" +
            "(p.name, c.name)" +
            "from Product p JOIN p.category c")
    List<ProductCategoryNameResponse> getProductCategoryName();
}


//@Query(value = "Select new com.turkcell.spring.starter.services.dtos.product.responses.ProductListResponse" +
//            "(p.id, p.name, c.name, p.unitPrice)" +
//            " from Product p JOIN p.category c" +
//            " WHERE lower(p.name) LIKE %:query%"
//            )
//    List<ProductListResponse> searchDto(String query);