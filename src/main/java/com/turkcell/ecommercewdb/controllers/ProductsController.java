package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Product;
import com.turkcell.ecommercewdb.services.abstracts.ProductService;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductCategoryNameResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductsController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getAll()
    {
        return productService.getAll();
    }

    @GetMapping("categoryNames")
    public List<ProductCategoryNameResponse> categoryName()
    {
        return productService.getCategoryNames();
    }
}
