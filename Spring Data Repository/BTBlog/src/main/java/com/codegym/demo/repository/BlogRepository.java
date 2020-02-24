package com.codegym.demo.repository;

import com.codegym.demo.model.Blog;
import com.codegym.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Iterable<Blog> findAllByCategory(Category category);
//    Iterable<Blog> findAllByBlogName(String blogName, Sort sort);
    Page<Blog> findAllByBlogNameContaining(String blogName, Pageable pageable);


}
