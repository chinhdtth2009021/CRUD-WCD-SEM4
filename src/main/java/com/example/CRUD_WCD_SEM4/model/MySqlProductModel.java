package com.example.CRUD_WCD_SEM4.model;

import com.example.CRUD_WCD_SEM4.constant.SqlConstant;
import com.example.CRUD_WCD_SEM4.entity.EntityEnum.ProductStatus;
import com.example.CRUD_WCD_SEM4.entity.Product;
import com.example.CRUD_WCD_SEM4.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MySqlProductModel implements ProductModel{

    @Override
    public boolean save(Product product) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_INSERT);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setString(2,product.getCreatedAt().toString());
            preparedStatement.setString(3,product.getUpdatedAt().toString());
            preparedStatement.setInt(4,product.getCreatedBy());
            preparedStatement.setInt(5,product.getUpdatedBy());
//            preparedStatement.setInt(6,product.getStatus().getValue());
            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean update(int id, Product product) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_UPDATE);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setString(2,product.getCreatedAt().toString());
            preparedStatement.setString(3,product.getUpdatedAt().toString());
            preparedStatement.setInt(4,product.getCreatedBy());
            preparedStatement.setInt(5,product.getUpdatedBy());
            preparedStatement.setInt(6,product.getStatus().getValue());
            preparedStatement.setInt(7,id);
            return preparedStatement.executeUpdate() > 0;
        }catch (SQLException e){
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_DELETE);
            preparedStatement.setInt(1, ProductStatus.DELETED.getValue());
            return preparedStatement.executeUpdate() > 0;

        }catch (SQLException e){
            System.out.println(e);
        }
        return false;
    }

    @Override
    public List<Product> findByAll() {
        List<Product> products = new ArrayList<>();
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_FIND_ALL);
            preparedStatement.setInt(1,ProductStatus.ACTIVE.getValue());
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = Integer.parseInt(rs.getString(SqlConstant.PRODUCT_FIELD_ID));
                String name = rs.getString(SqlConstant.PRODUCT_FIELD_NAME);
                String categoryID = rs.getString(SqlConstant.PRODUCT_FIELD_CATEGORYID);
                String description = rs.getString(SqlConstant.PRODUCT_FIELD_DESCRIPTION);
                String detail = rs.getString(SqlConstant.PRODUCT_FIELD_DETAIL);
                String thumbnails = rs.getString(SqlConstant.PRODUCT_FIELD_THUMBNAILS);
                String price = rs.getString(SqlConstant.PRODUCT_FIELD_PRICE);
                LocalDateTime createdAt = rs.getTimestamp(SqlConstant.PRODUCT_FIELD_CREATED_AT).toLocalDateTime();
                LocalDateTime updatedAt = rs.getTimestamp(SqlConstant.PRODUCT_FIELD_UPDATED_AT).toLocalDateTime();
                LocalDateTime deletedAt = null;
                if(rs.getTimestamp(SqlConstant.PRODUCT_FIELD_DELETED_AT) != null) {
                    deletedAt = rs.getTimestamp(SqlConstant.PRODUCT_FIELD_DELETED_AT).toLocalDateTime();
                }
                int createdBy = rs.getInt(SqlConstant.PRODUCT_FIELD_CREATED_BY);
                int updatedBy = rs.getInt(SqlConstant.PRODUCT_FIELD_UPDATED_BY);
                int deletedBy = rs.getInt(SqlConstant.PRODUCT_FIELD_DELETED_BY);
                ProductStatus status = ProductStatus.of(rs.getInt("status"));
                Product product = new Product(id, name,categoryID,description,detail,thumbnails,price, createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy, status);
                return products;
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return products;
    }

    @Override
    public Product findById(int id) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_FIND_BY_ID);
            preparedStatement.setInt(1,id);
            preparedStatement.setInt(2, ProductStatus.ACTIVE.getValue());
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");
                String categoryID = rs.getString("categoryID");
                String description = rs.getString("description");
                String detail = rs.getString("detail");
                String thumbnails = rs.getString("thumbnails");
                String price = rs.getString("price");
                LocalDateTime createdAt = rs.getTimestamp("createdAt").toLocalDateTime();
                LocalDateTime updatedAt = rs.getTimestamp("updatedAt").toLocalDateTime();
                LocalDateTime deletedAt = null;
                if (rs.getTimestamp("deletedAt") != null) {
                    deletedAt = rs.getTimestamp("deletedAt").toLocalDateTime();
                }
                int createdBy = rs.getInt("createdBy");
                int updatedBy = rs.getInt("updatedBy");
                int deletedBy = rs.getInt("deletedBy");
                ProductStatus productStatus = ProductStatus.values()[rs.getInt("status")];
                Product product = new Product(id ,name,categoryID,description,detail,thumbnails,price,createdAt,updatedAt,deletedAt,createdBy,updatedBy,deletedBy,productStatus);
                return product;
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
