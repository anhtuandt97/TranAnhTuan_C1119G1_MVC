package com.codegym.service.impl;

import com.codegym.model.Blog;
import com.codegym.repository.BlogRepository;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogerRepository;

    @Override
    public List<Blog> findAll() {
        return blogerRepository.findAll();
    }

    @Override
    public Blog findById(long id) {
        return blogerRepository.findById(id);
    }

    @Override
    public void save(Blog bloger) {
        blogerRepository.save(bloger);
    }

    @Override
    public void remove(long id) {
        blogerRepository.remove(id);
    }
}