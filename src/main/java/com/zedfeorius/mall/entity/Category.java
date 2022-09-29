package com.zedfeorius.mall.entity;


import java.util.List;

public class Category {

    private Integer categoryId;
    private String categoryName;
    private String categoryImageSrc;

    private List<Product> productList;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    public String getCategoryImageSrc() {
        return categoryImageSrc;
    }

    public void setCategoryImageSrc(String categoryImageSrc) {
        this.categoryImageSrc = categoryImageSrc;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
