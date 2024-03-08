package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Payment;
import com.turkcell.ecommercewdb.services.abstracts.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@AllArgsConstructor
public class PaymentsController {
    private final PaymentService paymentService;

    @GetMapping
    public List<Payment> getAll()
    {
        return paymentService.getAll();
    }
}
