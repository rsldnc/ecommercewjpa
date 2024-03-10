package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.CustomerType;
import com.turkcell.ecommercewdb.services.abstracts.CustomerTypeService;
import com.turkcell.ecommercewdb.services.dtos.category.requests.AddCategoryRequest;
import com.turkcell.ecommercewdb.services.dtos.customerType.requests.AddCustomerTypeRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customertypes")
@AllArgsConstructor
public class CustomerTypesController {
    private final CustomerTypeService customerTypeService;

    @GetMapping
    public List<CustomerType> getAll()
    {
        return customerTypeService.getAll();
    }

    @PostMapping
    public void add(@RequestBody @Valid AddCustomerTypeRequest request)
    {
        customerTypeService.add(request);
    }
}
