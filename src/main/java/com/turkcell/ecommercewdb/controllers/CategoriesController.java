package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Category;
import com.turkcell.ecommercewdb.services.abstracts.CategoryService;
import com.turkcell.ecommercewdb.services.dtos.category.requests.AddCategoryRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoriesController {
    private final CategoryService categoryService;

    @GetMapping
    public List<Category> getAll()
    {
        return categoryService.getAll();
    }

    @GetMapping("categoryCount")
    public int categoryCount()
    {
        return categoryService.getCount();
    }

    @PostMapping
    public void add(@RequestBody @Valid AddCategoryRequest request)
    {
        categoryService.add(request);
    }
}
