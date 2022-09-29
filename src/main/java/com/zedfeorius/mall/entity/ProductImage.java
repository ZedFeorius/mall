package com.zedfeorius.mall.entity;


public class ProductImage {

    private Integer productImageId;
    private Integer productImageType;
    private String productImageSrc;
    private Integer productImageProductId;


    public Integer getProductImageId() {
        return productImageId;
    }

    public void setProductImageId(Integer productImageId) {
        this.productImageId = productImageId;
    }


    public Integer getProductImageType() {
        return productImageType;
    }

    public void setProductImageType(Integer productImageType) {
        this.productImageType = productImageType;
    }


    public String getProductImageSrc() {
        return productImageSrc;
    }

    public void setProductImageSrc(String productImageSrc) {
        this.productImageSrc = productImageSrc;
    }


    public Integer getProductImageProductId() {
        return productImageProductId;
    }

    public void setProductImageProductId(Integer productImageProductId) {
        this.productImageProductId = productImageProductId;
    }

}
