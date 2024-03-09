package com.turkcell.ecommercewdb.repositories;

import com.turkcell.ecommercewdb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query(value = "SELECT COUNT(*) from Category")
    int getCategoryCount();
}
