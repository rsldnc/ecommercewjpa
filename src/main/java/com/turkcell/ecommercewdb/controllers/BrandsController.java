package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Brand;
import com.turkcell.ecommercewdb.services.abstracts.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
