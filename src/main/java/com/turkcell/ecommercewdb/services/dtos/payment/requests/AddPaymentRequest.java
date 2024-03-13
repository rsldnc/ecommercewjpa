package com.turkcell.ecommercewdb.services.dtos.payment.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddPaymentRequest {
    @Size(min = 3, max = 50)
    private String status;

    private Date date;

    @Min(1)
    private int paymentTypesId;
}
