package com.zedfeorius.mall.entity;


import java.util.Date;

public class User {

    private Integer userId;
    private String userName;
    private String userNickName;
    private String userPassword;
    private String userRealname;
    private Integer userGender;
    private Date userBirthday;
    private String userAddress;
    private String userHomePlace;
    private String userProfilePictureSrc;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }


    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }


    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }


    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }


    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }


    public String getUserHomePlace() {
        return userHomePlace;
    }

    public void setUserHomePlace(String userHomePlace) {
        this.userHomePlace = userHomePlace;
    }


    public String getUserProfilePictureSrc() {
        return userProfilePictureSrc;
    }

    public void setUserProfilePictureSrc(String userProfilePictureSrc) {
        this.userProfilePictureSrc = userProfilePictureSrc;
    }

}
