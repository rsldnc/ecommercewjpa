package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.Category;
import com.turkcell.ecommercewdb.services.dtos.category.requests.AddCategoryRequest;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    int getCount();

    void add(AddCategoryRequest request);
}
