package com.zedfeorius.mall.entity;


public class Admin {

    private Integer adminId;
    private String adminName;
    private String adminNickname;
    private String adminPassword;
    private String adminProfilePictureSrc;


    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }


    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }


    public String getAdminNickname() {
        return adminNickname;
    }

    public void setAdminNickname(String adminNickname) {
        this.adminNickname = adminNickname;
    }


    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }


    public String getAdminProfilePictureSrc() {
        return adminProfilePictureSrc;
    }

    public void setAdminProfilePictureSrc(String adminProfilePictureSrc) {
        this.adminProfilePictureSrc = adminProfilePictureSrc;
    }

}
