package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.Brand;
import com.turkcell.ecommercewdb.repositories.BrandRepository;
import com.turkcell.ecommercewdb.services.abstracts.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BrandServiceImpl implements BrandService
{
    private final BrandRepository brandRepository;

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }
}
