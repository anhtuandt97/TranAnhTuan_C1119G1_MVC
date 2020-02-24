package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
//    Customer findOne(Long id);
Iterable<Customer> findAllByProvince(Province province);
//    void delete(Long id);
}
