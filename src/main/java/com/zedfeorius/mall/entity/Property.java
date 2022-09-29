package com.zedfeorius.mall.entity;


public class Property {

    private Integer propertyId;
    private String propertyName;
    private Integer propertyCategoryId;


    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }


    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }


    public Integer getPropertyCategoryId() {
        return propertyCategoryId;
    }

    public void setPropertyCategoryId(Integer propertyCategoryId) {
        this.propertyCategoryId = propertyCategoryId;
    }

}
