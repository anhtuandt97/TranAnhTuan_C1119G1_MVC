package com.codegym.demo.service;

import com.codegym.demo.model.Blog;
import com.codegym.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Long id);

    void save(Blog user);

    void remove(Long id);
    Iterable<Blog> findAllByCategory(Category category);

    Page<Blog> findAllByBlogNameContaining(String blogName, Pageable pageable);
//    Iterable<Blog> findAllByBlogName(String blogName, Sort sort);
}
