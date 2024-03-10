package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.entities.Product;
import com.turkcell.ecommercewdb.repositories.ProductRepository;
import com.turkcell.ecommercewdb.services.abstracts.ProductService;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductCategoryNameResponse;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductStockResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductCategoryNameResponse> getCategoryNames() {
        return productRepository.getProductCategoryName();
    }

    @Override
    public List<ProductStockResponse> getStock() {
        return productRepository.getProductStock();
    }

    @Override
    public int productCountInCategory(String query) {
        return productRepository.productCountInCategory(query);
    }

    @Override
    public List<String> findMostExpensiveProduct() {
        return productRepository.findMostExpensiveProduct();
    }

    @Override
    public int getAvaragePriceOfProducts() {
        return productRepository.getAvaragePriceOfProducts();
    }


    @Override
    public int productCountInBrand(String query) {
        return productRepository.productCountInBrand(query);
    }
}
