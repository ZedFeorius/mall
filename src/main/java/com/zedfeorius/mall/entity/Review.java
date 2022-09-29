package com.zedfeorius.mall.entity;


import java.util.Date;

public class Review {

    private Integer reviewId;
    private String reviewContent;
    private Date reviewCreatedate;
    private Integer reviewUserId;
    private Integer reviewProductId;
    private Integer reviewOrderItemId;


    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }


    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }


    public Date getReviewCreatedate() {
        return reviewCreatedate;
    }

    public void setReviewCreatedate(Date reviewCreatedate) {
        this.reviewCreatedate = reviewCreatedate;
    }


    public Integer getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(Integer reviewUserId) {
        this.reviewUserId = reviewUserId;
    }


    public Integer getReviewProductId() {
        return reviewProductId;
    }

    public void setReviewProductId(Integer reviewProductId) {
        this.reviewProductId = reviewProductId;
    }


    public Integer getReviewOrderItemId() {
        return reviewOrderItemId;
    }

    public void setReviewOrderItemId(Integer reviewOrderItemId) {
        this.reviewOrderItemId = reviewOrderItemId;
    }

}
