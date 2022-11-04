package com.miu.edu.spring.data.service;

import com.miu.edu.spring.data.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    /**
     * Get all Categories
     * @return Categories
     */
    List<CategoryDto> getAllCategories();

    /**
     * Get Category By id
     *
     * @param id
     * @return a Category
     */
    CategoryDto getCategoryById(int id);

    /**
     * Update a Category
     * @param category
     */
    void updateCategory(CategoryDto category);

    /**
     * Add a Category
     * @param category
     */
    void addCategory(CategoryDto category);

    /**
     * Remove a Category by id
     * @param id
     */
    void removeById(int id);

}
