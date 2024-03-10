package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Product;
import com.turkcell.ecommercewdb.services.abstracts.ProductService;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductCategoryNameResponse;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductStockResponse;
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

    @GetMapping("stock")
    public List<ProductStockResponse> stock()
    {
        return productService.getStock();
    }

    @GetMapping("productCountInCategory")
    public int productCountInCategory(String query)
    {
        return productService.productCountInCategory(query);
    }

    @GetMapping("mostExpensiveProduct")
    public List<String> findMostExpensiveProduct()
    {
        return productService.findMostExpensiveProduct();
    }

        @GetMapping("mostCheapProduct")
    public List<String> findMostCheapProduct()
    {
        return productService.findMostCheapProduct();
    }

    @GetMapping("avaragePriceOfProducts")
    public int avaragePriceOfProducts(){ return productService.getAvaragePriceOfProducts();}

    @GetMapping("productCountInBrand")
    public int productCountInBrand(String query)
    {
        return productService.productCountInBrand(query);
    }


}
