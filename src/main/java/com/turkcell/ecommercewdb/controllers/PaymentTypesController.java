package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.PaymentType;
import com.turkcell.ecommercewdb.services.abstracts.PaymentTypeService;
import com.turkcell.ecommercewdb.services.dtos.customerType.requests.AddCustomerTypeRequest;
import com.turkcell.ecommercewdb.services.dtos.paymenttypes.requests.AddPaymentTypeRequest;
import com.turkcell.ecommercewdb.services.dtos.paymenttypes.responses.PaymentTypesNameResponse;
import com.turkcell.ecommercewdb.services.dtos.product.responses.ProductStockResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("typeNames")
    public List<PaymentTypesNameResponse> getPaymentTypes()
    {
        return paymentTypeService.getPaymentTypes();
    }

    @PostMapping
    public void add(@RequestBody @Valid AddPaymentTypeRequest request)
    {
        paymentTypeService.add(request);
    }
}
