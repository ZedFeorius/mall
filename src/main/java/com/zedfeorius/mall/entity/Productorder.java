package com.zedfeorius.mall.entity;


import java.util.Date;

public class Productorder {

    private Integer productorderId;
    private String productorderCode;
    private String productorderAddress;
    private String productorderDetailAddress;
    private String productorderPost;
    private String productorderReceiver;
    private String productorderMobile;
    private Date productorderPayDate;
    private Date productorderDeliveryDate;
    private Date productorderConfirmDate;
    private Integer productorderStatus;
    private Integer productorderUserId;


    public Integer getProductorderId() {
        return productorderId;
    }

    public void setProductorderId(Integer productorderId) {
        this.productorderId = productorderId;
    }


    public String getProductorderCode() {
        return productorderCode;
    }

    public void setProductorderCode(String productorderCode) {
        this.productorderCode = productorderCode;
    }


    public String getProductorderAddress() {
        return productorderAddress;
    }

    public void setProductorderAddress(String productorderAddress) {
        this.productorderAddress = productorderAddress;
    }


    public String getProductorderDetailAddress() {
        return productorderDetailAddress;
    }

    public void setProductorderDetailAddress(String productorderDetailAddress) {
        this.productorderDetailAddress = productorderDetailAddress;
    }


    public String getProductorderPost() {
        return productorderPost;
    }

    public void setProductorderPost(String productorderPost) {
        this.productorderPost = productorderPost;
    }


    public String getProductorderReceiver() {
        return productorderReceiver;
    }

    public void setProductorderReceiver(String productorderReceiver) {
        this.productorderReceiver = productorderReceiver;
    }


    public String getProductorderMobile() {
        return productorderMobile;
    }

    public void setProductorderMobile(String productorderMobile) {
        this.productorderMobile = productorderMobile;
    }


    public Date getProductorderPayDate() {
        return productorderPayDate;
    }

    public void setProductorderPayDate(Date productorderPayDate) {
        this.productorderPayDate = productorderPayDate;
    }


    public Date getProductorderDeliveryDate() {
        return productorderDeliveryDate;
    }

    public void setProductorderDeliveryDate(Date productorderDeliveryDate) {
        this.productorderDeliveryDate = productorderDeliveryDate;
    }


    public Date getProductorderConfirmDate() {
        return productorderConfirmDate;
    }

    public void setProductorderConfirmDate(Date productorderConfirmDate) {
        this.productorderConfirmDate = productorderConfirmDate;
    }


    public Integer getProductorderStatus() {
        return productorderStatus;
    }

    public void setProductorderStatus(Integer productorderStatus) {
        this.productorderStatus = productorderStatus;
    }


    public Integer getProductorderUserId() {
        return productorderUserId;
    }

    public void setProductorderUserId(Integer productorderUserId) {
        this.productorderUserId = productorderUserId;
    }

}
