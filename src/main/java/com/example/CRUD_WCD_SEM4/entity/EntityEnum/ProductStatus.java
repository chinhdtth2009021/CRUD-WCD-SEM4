package com.example.CRUD_WCD_SEM4.entity.EntityEnum;

public enum ProductStatus {
    ACTIVE(1),
    DEACTIVE(0),
    DELETED(-1),
    UNDEFINE(2);

    private int value;

    ProductStatus(int value){this.value = value;}

    public int getValue() {
        return value;
    }

    public static ProductStatus of (int value){
        for (ProductStatus productEN : ProductStatus.values()){
            if(productEN.getValue() == value){
                return productEN;
            }
        }
        return ProductStatus.UNDEFINE;
    }
}
