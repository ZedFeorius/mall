package com.zedfeorius.mall.entity;


public class ProductOrderItem {

    private Integer productOrderItemId;
    private Integer productOrderItemNumber;
    private Double productOrderItemPrice;
    private Integer productOrderItemProductId;
    private Integer productOrderItemOrderId;
    private Integer productOrderItemUserId;
    private String productOrderItemUserMessage;


    public Integer getProductorderitemId() {
        return productOrderItemId;
    }

    public void setProductorderitemId(Integer productOrderItemId) {
        this.productOrderItemId = productOrderItemId;
    }


    public Integer getProductorderitemNumber() {
        return productOrderItemNumber;
    }

    public void setProductorderitemNumber(Integer productOrderItemNumber) {
        this.productOrderItemNumber = productOrderItemNumber;
    }


    public Double getProductorderitemPrice() {
        return productOrderItemPrice;
    }

    public void setProductorderitemPrice(Double productOrderItemPrice) {
        this.productOrderItemPrice = productOrderItemPrice;
    }


    public Integer getProductorderitemProductId() {
        return productOrderItemProductId;
    }

    public void setProductorderitemProductId(Integer productOrderItemProductId) {
        this.productOrderItemProductId = productOrderItemProductId;
    }


    public Integer getProductorderitemOrderId() {
        return productOrderItemOrderId;
    }

    public void setProductorderitemOrderId(Integer productOrderItemOrderId) {
        this.productOrderItemOrderId = productOrderItemOrderId;
    }


    public Integer getProductorderitemUserId() {
        return productOrderItemUserId;
    }

    public void setProductorderitemUserId(Integer productOrderItemUserId) {
        this.productOrderItemUserId = productOrderItemUserId;
    }


    public String getProductorderitemUserMessage() {
        return productOrderItemUserMessage;
    }

    public void setProductorderitemUserMessage(String productOrderItemUserMessage) {
        this.productOrderItemUserMessage = productOrderItemUserMessage;
    }

}
