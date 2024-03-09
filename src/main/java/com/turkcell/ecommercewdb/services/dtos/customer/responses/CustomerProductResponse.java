package com.turkcell.ecommercewdb.services.dtos.customer.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerProductResponse {
    private String firstName;
    private String lastName;
    private String productName;
}
