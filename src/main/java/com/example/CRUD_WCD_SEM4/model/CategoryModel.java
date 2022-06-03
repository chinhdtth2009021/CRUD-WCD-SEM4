package com.example.CRUD_WCD_SEM4.model;

import com.example.CRUD_WCD_SEM4.entity.Category;

public interface CategoryModel {
    boolean save(Category category);
    boolean update(int id , Category category);
    boolean delete(int id);
    List<Category> findByAll();
    static Category findById(int id);
}
