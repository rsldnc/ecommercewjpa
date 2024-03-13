package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Payment;
import com.turkcell.ecommercewdb.services.abstracts.PaymentService;
import com.turkcell.ecommercewdb.services.dtos.payment.requests.AddPaymentRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void add(@RequestBody @Valid AddPaymentRequest request)
    {
        paymentService.add(request);
    }
}
