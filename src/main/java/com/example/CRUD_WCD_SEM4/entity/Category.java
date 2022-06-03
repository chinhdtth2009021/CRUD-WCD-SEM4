package com.example.CRUD_WCD_SEM4.entity;

import com.example.CRUD_WCD_SEM4.entity.EntityEnum.CategoryStatus;
import com.example.CRUD_WCD_SEM4.entity.base.BaseEntity;

import java.time.LocalDateTime;

public class Category extends BaseEntity {
    private int id;
    private String name;
    private CategoryStatus status;

    public Category(int id, String name, CategoryStatus status) {
    }
    public Category() {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public CategoryStatus getStatus() {
        return status;
    }
    public void setStatus(CategoryStatus status) {
        this.status = status;
    }
}
