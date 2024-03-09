package com.turkcell.ecommercewdb.services.abstracts;

import com.turkcell.ecommercewdb.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    int getCount();
}
