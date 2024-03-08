package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.services.abstracts.PaymentTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/paymenttypes")
@AllArgsConstructor
public class PaymentTypesController {
    private final PaymentTypeService paymentTypeService;

    @GetMapping
    public List<PaymentType> getAll()
    {
        return paymentTypeService.getAll();
    }
}
