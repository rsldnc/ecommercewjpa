package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.entities.Product;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductCategoryNameResponse;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    List<ProductCategoryNameResponse> getCategoryNames();
}
