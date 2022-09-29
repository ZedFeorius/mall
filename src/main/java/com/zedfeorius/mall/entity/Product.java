package com.zedfeorius.mall.entity;


import java.util.Date;

public class Product {

    private Integer productId;
    private String productName;
    private String productTitle;
    private Double productPrice;
    private Double productSalePrice;
    private Date productCreateDate;
    private Integer productCategoryId;
    private Integer productIsEnabled;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }


    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }


    public Double getProductSalePrice() {
        return productSalePrice;
    }

    public void setProductSalePrice(Double productSalePrice) {
        this.productSalePrice = productSalePrice;
    }


    public Date getProductCreateDate() {
        return productCreateDate;
    }

    public void setProductCreateDate(Date productCreateDate) {
        this.productCreateDate = productCreateDate;
    }


    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }


    public Integer getProductIsEnabled() {
        return productIsEnabled;
    }

    public void setProductIsEnabled(Integer productIsEnabled) {
        this.productIsEnabled = productIsEnabled;
    }

}
