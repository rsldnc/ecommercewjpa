package com.turkcell.ecommercewdb.services.dtos.customer.requests;

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
public class AddCustomerRequest {
    @Size(min = 3, max = 50)
    private String firstName;

    @Size(min = 3, max = 50)
    private String lastName;

    @Size(min = 3, max = 50)
    private String mail;

    @Size(min = 3, max = 50)
    private String password;

    @Size(min = 3, max = 50)
    private String phoneNumber;

    @Min(1)
    private int customerTypeId;

    @Min(1)
    private int addressId;
}
