package com.zedfeorius.mall.entity;


import java.util.Date;

public class ProductOrder {

    private Integer productOrderId;
    private String productOrderCode;
    private String productOrderAddress;
    private String productOrderDetailAddress;
    private String productOrderPost;
    private String productOrderReceiver;
    private String productOrderMobile;
    private Date productOrderPayDate;
    private Date productOrderDeliveryDate;
    private Date productOrderConfirmDate;
    private Integer productOrderStatus;
    private Integer productOrderUserId;


    public Integer getProductorderId() {
        return productOrderId;
    }

    public void setProductorderId(Integer productOrderId) {
        this.productOrderId = productOrderId;
    }


    public String getProductorderCode() {
        return productOrderCode;
    }

    public void setProductorderCode(String productOrderCode) {
        this.productOrderCode = productOrderCode;
    }


    public String getProductorderAddress() {
        return productOrderAddress;
    }

    public void setProductorderAddress(String productOrderAddress) {
        this.productOrderAddress = productOrderAddress;
    }


    public String getProductorderDetailAddress() {
        return productOrderDetailAddress;
    }

    public void setProductorderDetailAddress(String productOrderDetailAddress) {
        this.productOrderDetailAddress = productOrderDetailAddress;
    }


    public String getProductorderPost() {
        return productOrderPost;
    }

    public void setProductorderPost(String productOrderPost) {
        this.productOrderPost = productOrderPost;
    }


    public String getProductorderReceiver() {
        return productOrderReceiver;
    }

    public void setProductorderReceiver(String productOrderReceiver) {
        this.productOrderReceiver = productOrderReceiver;
    }


    public String getProductorderMobile() {
        return productOrderMobile;
    }

    public void setProductorderMobile(String productOrderMobile) {
        this.productOrderMobile = productOrderMobile;
    }


    public Date getProductorderPayDate() {
        return productOrderPayDate;
    }

    public void setProductorderPayDate(Date productOrderPayDate) {
        this.productOrderPayDate = productOrderPayDate;
    }


    public Date getProductorderDeliveryDate() {
        return productOrderDeliveryDate;
    }

    public void setProductorderDeliveryDate(Date productOrderDeliveryDate) {
        this.productOrderDeliveryDate = productOrderDeliveryDate;
    }


    public Date getProductorderConfirmDate() {
        return productOrderConfirmDate;
    }

    public void setProductorderConfirmDate(Date productOrderConfirmDate) {
        this.productOrderConfirmDate = productOrderConfirmDate;
    }


    public Integer getProductorderStatus() {
        return productOrderStatus;
    }

    public void setProductorderStatus(Integer productOrderStatus) {
        this.productOrderStatus = productOrderStatus;
    }


    public Integer getProductorderUserId() {
        return productOrderUserId;
    }

    public void setProductorderUserId(Integer productOrderUserId) {
        this.productOrderUserId = productOrderUserId;
    }

}
