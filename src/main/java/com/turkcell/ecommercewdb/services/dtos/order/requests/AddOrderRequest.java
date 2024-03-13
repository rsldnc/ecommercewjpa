package com.turkcell.ecommercewdb.services.dtos.order.requests;

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
public class AddOrderRequest {
    @Size(min = 3, max = 50)
    private String status;

    @Min(1)
    private double amount;

    @Min(1)
    private int paymentId;

    @Min(1)
    private int customerId;
}
