package com.codegym.demo.service;

import com.codegym.demo.model.Blog;
import com.codegym.demo.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
