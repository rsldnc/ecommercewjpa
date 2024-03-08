package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.Order;
import com.turkcell.ecommercewdb.entities.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> getAll();
}
