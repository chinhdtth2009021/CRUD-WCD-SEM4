package com.example.CRUD_WCD_SEM4.model.Seeder;

import com.example.CRUD_WCD_SEM4.model.CategoryModel;
import com.example.CRUD_WCD_SEM4.model.MySqlCategoryModel;

public class CategorySeeder {
    private CategoryModel categoryModel;

    public CategorySeeder() {
        this.categoryModel = new MySqlCategoryModel();
    }
}
