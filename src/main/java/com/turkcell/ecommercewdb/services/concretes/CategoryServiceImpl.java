package com.turkcell.ecommercewdb.services.concretes;

import com.turkcell.ecommercewdb.core.exception.types.BusinessException;
import com.turkcell.ecommercewdb.entities.Address;
import com.turkcell.ecommercewdb.entities.Category;
import com.turkcell.ecommercewdb.repositories.CategoryRepository;
import com.turkcell.ecommercewdb.services.abstracts.CategoryService;
import com.turkcell.ecommercewdb.services.dtos.category.requests.AddCategoryRequest;
import com.turkcell.ecommercewdb.services.mappers.AddressMapper;
import com.turkcell.ecommercewdb.services.mappers.CategoryMapper;
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
        Category category = CategoryMapper.INSTANCE.categoryFromAddRequest(request);
        categoryRepository.save(category);
    }
}
