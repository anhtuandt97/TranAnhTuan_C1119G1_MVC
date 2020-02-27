package com.codegym.repository;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    @Query("select c from Product c where c.idProduct=?1")
    Product findProductById(Long idProduct);
}
