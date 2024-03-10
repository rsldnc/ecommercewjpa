package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.entities.Product;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductCategoryNameResponse;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductStockResponse;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    List<ProductCategoryNameResponse> getCategoryNames();
    List<ProductStockResponse> getStock();
    int productCountInCategory(String query);
    List<String> findMostExpensiveProduct();

    int getAvaragePriceOfProducts();

    List<String> findMostCheapProduct();

    int productCountInBrand(String query);
}
