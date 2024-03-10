package com.turkcell.ecommercewdb.services.dtos.address.requests;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddAddressRequest {
    @Size(min = 3, max = 50)
    private String city;

    @Size(min = 3, max = 50)
    private String district;

    @Size(min = 3)
    private String street;

    @Size(min = 3, max = 50)
    private String building;

    @Size(min = 3, max = 10)
    private String postCode;

    @Size(min = 3)
    private String addressDetails;
}
