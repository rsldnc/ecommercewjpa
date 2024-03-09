package com.turkcell.ecommercewdb.services.dtos.product.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductStockResponse {
    private String name;
    private int stock;
}
