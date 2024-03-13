package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.Brand;
import com.turkcell.ecommercewdb.services.dtos.brand.requests.AddBrandRequest;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();

    void add(AddBrandRequest request);
}
