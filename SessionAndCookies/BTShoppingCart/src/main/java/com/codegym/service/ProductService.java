package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.stereotype.Service;

public interface ProductService {
    Iterable<Product>findAll();
    Product findById(Long id);

    void save(Product product);

    void remove(Long id);

}
