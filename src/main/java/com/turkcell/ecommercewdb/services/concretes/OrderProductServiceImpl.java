package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.Order;
import com.turkcell.ecommercewdb.entities.OrderProduct;
import com.turkcell.ecommercewdb.entities.Product;
import com.turkcell.ecommercewdb.repositories.OrderProductRepository;
import com.turkcell.ecommercewdb.services.abstracts.OrderProductService;
import com.turkcell.ecommercewdb.services.dtos.orderProduct.requests.AddOrderProductRequest;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderProductServiceImpl implements OrderProductService {

    private final OrderProductRepository orderProductRepository;

    @Override
    public List<OrderProduct> getAll() {
        return orderProductRepository.findAll();
    }

    @Override
    public List<String> getProducts() {
        return orderProductRepository.getProducts();
    }

    @Override
    public void add(AddOrderProductRequest request) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Product>> responseEntity = restTemplate.exchange(
                "http://localhost:8081/api/products",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Product>>() {
                });

        List<Product> products = responseEntity.getBody();
        for (Product product: products)
        {
            if (product.getId() == request.getProductId())
            {
                if(product.getStock() < request.getQuantity())
                    throw new RuntimeException("There is not enough stock for this product");
                else
                    break;
            }
        }

        Boolean isValidProduct = false;
        for (Product product: products)
        {
            if (product.getId() == request.getProductId())
            {
                isValidProduct = true;
                break;
            }
        }
        if (isValidProduct == false)
            throw new RuntimeException("There is no product with this product id number");



        Order order = new Order();
        order.setId(request.getOrderId());
        Product product = new Product();
        product.setId(request.getProductId());

        OrderProduct orderProduct = new OrderProduct();
        orderProduct.setPrice(request.getPrice());
        orderProduct.setQuantity(request.getQuantity());
        orderProduct.setOrder(order);
        orderProduct.setProduct(product);
        orderProductRepository.save(orderProduct);
    }
}
