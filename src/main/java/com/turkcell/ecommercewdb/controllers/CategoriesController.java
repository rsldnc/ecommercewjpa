package com.turkcell.ecommercewdb.controllers;

import com.turkcell.ecommercewdb.entities.Category;
import com.turkcell.ecommercewdb.services.abstracts.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
