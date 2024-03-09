package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.Category;
import com.turkcell.ecommercewdb.repositories.CategoryRepository;
import com.turkcell.ecommercewdb.services.abstracts.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public int getCount() {
        return categoryRepository.getCategoryCount();
    }
}
