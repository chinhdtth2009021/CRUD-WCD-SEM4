package com.example.CRUD_WCD_SEM4.model;

import com.example.CRUD_WCD_SEM4.entity.Product;

import java.util.List;

public interface ProductModel {
    boolean save(Product product);
    boolean update(int id ,Product product);
    boolean delete(int id);
    List<Product> findByAll();
    Product findById(int id);
}
