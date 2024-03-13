package com.turkcell.ecommercewdb.services.dtos.product.requests;

import com.turkcell.ecommercewdb.entities.Brand;
import com.turkcell.ecommercewdb.entities.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddProductRequest {
    @Size(min = 3, max = 50)
    private String name;

    @Min(1)
    private int stock;

    @Min(1)
    private double price;

    @Min(1)
    private int categoryId;

    @Min(1)
    private int brandId;
}
