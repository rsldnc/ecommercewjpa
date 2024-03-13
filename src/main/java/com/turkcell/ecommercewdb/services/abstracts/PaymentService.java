package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.Order;
import com.turkcell.ecommercewdb.entities.Payment;
import com.turkcell.ecommercewdb.services.dtos.payment.requests.AddPaymentRequest;

import java.util.List;

public interface PaymentService {
    List<Payment> getAll();

    void add(AddPaymentRequest request);
}
