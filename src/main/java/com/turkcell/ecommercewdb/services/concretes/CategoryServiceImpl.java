package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.entities.Category;
import com.turkcell.ecommercewdb.repositories.CategoryRepository;
import com.turkcell.ecommercewdb.services.abstracts.CategoryService;
import com.turkcell.ecommercewdb.services.dtos.category.requests.AddCategoryRequest;
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

    @Override
    public void add(AddCategoryRequest request) {
        List<Category> categories = categoryRepository.findAll();
        for (Category category : categories) {
            if (category.getName().toLowerCase().equals(request.getName().toLowerCase()))
                throw new IllegalArgumentException("This category already exists");
        }

        Category category = new Category();

        category.setName(request.getName());
        categoryRepository.save(category);
    }
}
