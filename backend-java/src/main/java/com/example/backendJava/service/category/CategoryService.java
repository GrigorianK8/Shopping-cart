package com.example.backendJava.service.category;

import com.example.backendJava.entity.Category;

import java.util.List;

public interface CategoryService {

    Category addCategory(Category category);

    Category updatedCategory(Category category, Long id);

    Category getCategoryById(Long id);

    Category getCategoryByName(String name);

    List<Category> getAllCategories();

    void deleteCategoryById(Long id);
}
