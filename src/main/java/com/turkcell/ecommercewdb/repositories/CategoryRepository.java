package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
