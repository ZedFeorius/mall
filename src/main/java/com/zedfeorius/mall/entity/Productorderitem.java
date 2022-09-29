package com.zedfeorius.mall.entity;


public class Productorderitem {

    private Integer productorderitemId;
    private Integer productorderitemNumber;
    private Double productorderitemPrice;
    private Integer productorderitemProductId;
    private Integer productorderitemOrderId;
    private Integer productorderitemUserId;
    private String productorderitemUserMessage;


    public Integer getProductorderitemId() {
        return productorderitemId;
    }

    public void setProductorderitemId(Integer productorderitemId) {
        this.productorderitemId = productorderitemId;
    }


    public Integer getProductorderitemNumber() {
        return productorderitemNumber;
    }

    public void setProductorderitemNumber(Integer productorderitemNumber) {
        this.productorderitemNumber = productorderitemNumber;
    }


    public Double getProductorderitemPrice() {
        return productorderitemPrice;
    }

    public void setProductorderitemPrice(Double productorderitemPrice) {
        this.productorderitemPrice = productorderitemPrice;
    }


    public Integer getProductorderitemProductId() {
        return productorderitemProductId;
    }

    public void setProductorderitemProductId(Integer productorderitemProductId) {
        this.productorderitemProductId = productorderitemProductId;
    }


    public Integer getProductorderitemOrderId() {
        return productorderitemOrderId;
    }

    public void setProductorderitemOrderId(Integer productorderitemOrderId) {
        this.productorderitemOrderId = productorderitemOrderId;
    }


    public Integer getProductorderitemUserId() {
        return productorderitemUserId;
    }

    public void setProductorderitemUserId(Integer productorderitemUserId) {
        this.productorderitemUserId = productorderitemUserId;
    }


    public String getProductorderitemUserMessage() {
        return productorderitemUserMessage;
    }

    public void setProductorderitemUserMessage(String productorderitemUserMessage) {
        this.productorderitemUserMessage = productorderitemUserMessage;
    }

}
