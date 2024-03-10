package com.turkcell.ecommercewdb.services.dtos.orderProduct.requests;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddOrderProductRequest {
    @Min(1)
    private int quantity;
    @Min(1)
    private double price;
    @Min(1)
    private int orderId;
    @Min(1)
    private int productId;
}
