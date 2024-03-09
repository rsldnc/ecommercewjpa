package com.turkcell.ecommercewdb.services.dtos.customer.responses;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerFullNameResponse {
    private String firstName;
    private String lastName;
}
