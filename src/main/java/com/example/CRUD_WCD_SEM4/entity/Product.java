package com.example.CRUD_WCD_SEM4.entity;

import com.example.CRUD_WCD_SEM4.entity.EntityEnum.ProductStatus;
import com.example.CRUD_WCD_SEM4.entity.base.BaseEntity;


import java.time.LocalDateTime;

public class Product extends BaseEntity{
    private int id;
    private int categoryID;
    private String Name;
    private String description;
    private String detail;
    private String thumbnails;
    private double price;
    private ProductStatus status;
    public Product(int id, String name, String categoryID, String description, String detail, String thumbnails, String price, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, int createdBy, int updatedBy, int deletedBy, ProductStatus status) {
    }
    public Product() {
        this.id = id;
        this.categoryID = categoryID;
        this.description = description;
        this.detail = detail;
        this.thumbnails = thumbnails;
        this.price = price;
        this.status = status;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", categoryID=" + categoryID +
                ", Name='" + Name + '\'' +
                ", description='" + description + '\'' +
                ", detail='" + detail + '\'' +
                ", thumbnails='" + thumbnails + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCategoryID() {
        return categoryID;
    }
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getThumbnails() {
        return thumbnails;
    }
    public void setThumbnails(String thumbnails) {
        this.thumbnails = thumbnails;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public ProductStatus getStatus() {
        return status;
    }
    public void setStatus(ProductStatus status) {
        this.status = status;
    }
    @Override
    public FileLock getProductValidation() {
        return null;
    }
    @Override
    public Product findById(int id) {
        return null;
    }
    @Override
    public void update(int id, Product product) {
    }
}
