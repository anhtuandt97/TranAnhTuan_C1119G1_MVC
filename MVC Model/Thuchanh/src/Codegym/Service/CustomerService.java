package Codegym.Service;

import Codegym.Model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findByid(int id);
    void update(int id, Customer customer);
    void remove(int id);
}
