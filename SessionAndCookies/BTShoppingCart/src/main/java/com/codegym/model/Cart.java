package com.codegym.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    private Map<Long, Product> cart;
//    private int count =0;
    public Cart() {
        cart = new HashMap<>();
    }

    public void addProduct(Product product){
        cart.put(product.getIdProduct(), product);
    }

    public void deleteProduct(Product product){
        cart.remove(product.getIdProduct(), product);
    }

    public Map<Long, Product> getCart() {
        return cart;
    }

    public void setCart(Map<Long, Product> cart) {
        this.cart = cart;
    }


}
