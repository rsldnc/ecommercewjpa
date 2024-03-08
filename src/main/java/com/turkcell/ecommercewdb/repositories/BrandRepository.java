package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
