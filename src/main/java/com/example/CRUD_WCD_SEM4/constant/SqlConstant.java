package com.example.CRUD_WCD_SEM4.constant;

public class SqlConstant {
    public static final String CATEGORY_INSERT = "INSERT INTO category (name, status ,createdAt, updatedAt, createdBy, updatedBy, ) VALUES (?, ?, ?, ?, ?, ?);";
    public static final String CATEGORY_UPDATE = "UPDATE category SET name = ?,createdAt = ?, updatedAt = ?, createdBy = ?, updatedBy = ?, status = ? WHERE id = ?;";
    public static final String CATEGORY_DELETE = "DELETE FROM category WHERE id = ?;";
    public static final String CATEGORY_FIND_BY_ID = "SELECT * FROM category WHERE id = ? AND status = ?;";
    public static final String CATEGORY_FIND_ALL = "SELECT * FROM category WHERE status = ?;";

    public static final String CATEGORY_FIELD_ID = "id";
    public static final String CATEGORY_FIELD_NAME = "name";
    public static final String CATEGORY_FIELD_CREATED_AT = "createdAt";
    public static final String CATEGORY_FIELD_UPDATED_AT = "updatedAt";
    public static final String CATEGORY_FIELD_DELETED_AT = "deletedAt";
    public static final String CATEGORY_FIELD_CREATED_BY = "createdBy";
    public static final String CATEGORY_FIELD_UPDATED_BY = "updatedBy";
    public static final String CATEGORY_FIELD_DELETED_BY = "deletedBy";

    public static final String FIELD_CREATED_AT = "createdAt";
    public static final String FIELD_UPDATED_AT = "updatedAt";
    public static final String FIELD_DELETED_AT = "deletedAt";
    public static final String FIELD_CREATED_BY = "createdBy";
    public static final String FIELD_UPDATED_BY = "updatedBy";
    public static final String FIELD_DELETED_BY = "deletedBy";

    public static final String PRODUCT_INSERT = "INSERT INTO products (name,categoryID,description, detail, price, thumbnails," +
            "createdAt, updatedAt, deletedAt, createdBy, updatedBy, deletedBy, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    public static final String PRODUCT_UPDATE = "UPDATE products SET name = ?, description = ?, detail = ?, price = ?, thumbnail = ?,  categoryID= ?," +
            "createdAt = ?, updatedAt = ?, deletedAt = ?, createdBy = ?, updatedBy = ?, deletedBy = ?, status = ? WHERE id = ?;";
    public static final String PRODUCT_DELETE = "DELETE FROM products WHERE id = ?;";
    public static final String PRODUCT_FIND_BY_ID = "SELECT * FROM products WHERE id = ? AND status = ?;";
    public static final String PRODUCT_FIND_ALL = "SELECT * FROM products WHERE status = ?;";

    public static final String PRODUCT_FIELD_ID = "id";
    public static final String PRODUCT_FIELD_CATEGORYID = "categoryID";
    public static final String PRODUCT_FIELD_NAME = "name";
    public static final String PRODUCT_FIELD_DESCRIPTION = "description";
    public static final String PRODUCT_FIELD_DETAIL = "detail";
    public static final String PRODUCT_FIELD_THUMBNAILS = "thumbnails";
    public static final String PRODUCT_FIELD_PRICE = "price";
    public static final String PRODUCT_FIELD_CREATED_AT = "createdAt";
    public static final String PRODUCT_FIELD_UPDATED_AT = "updatedAt";
    public static final String PRODUCT_FIELD_DELETED_AT = "deletedAt";
    public static final String PRODUCT_FIELD_CREATED_BY = "createdBy";
    public static final String PRODUCT_FIELD_UPDATED_BY = "updatedBy";
    public static final String PRODUCT_FIELD_DELETED_BY = "deletedBy";
}


