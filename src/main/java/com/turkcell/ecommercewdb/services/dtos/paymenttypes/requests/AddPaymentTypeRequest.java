package com.turkcell.ecommercewdb.services.dtos.paymenttypes.requests;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddPaymentTypeRequest {
    @Size(min = 3, max = 50)
    private String type;
}
