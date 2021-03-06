package com.codegym.service;

import com.codegym.ProductService;
import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static ProductService productService = new ProductServiceImpl();
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Clothes",200,"On sale","Gucci"));
        products.put(2,new Product(2,"Jean",200,"On sale","Hermes"));
        products.put(3,new Product(3,"Jacket",200,"On sale","Adidas"));
        products.put(4,new Product(4,"Hat",200,"On sale","TFLA"));
        products.put(5,new Product(5,"T-shirt",200,"On sale","Nike"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
