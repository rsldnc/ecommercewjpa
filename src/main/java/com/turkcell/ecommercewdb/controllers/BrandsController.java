package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Brand;
import com.turkcell.ecommercewdb.services.abstracts.BrandService;
import com.turkcell.ecommercewdb.services.dtos.brand.requests.AddBrandRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    private final BrandService brandService;

    @GetMapping
    public List<Brand> getAll()
    {
        return brandService.getAll();
    }

    @PostMapping
    public void add(@RequestBody @Valid AddBrandRequest request)
    {
        brandService.add(request);
    }
}
