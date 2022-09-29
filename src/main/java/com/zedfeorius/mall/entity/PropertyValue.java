package com.zedfeorius.mall.entity;


public class PropertyValue {

    private Integer propertyValueId;
    private String propertyValueValue;
    private Integer propertyValuePropertyId;
    private Integer propertyValueProductId;


    public Integer getPropertyValueId() {
        return propertyValueId;
    }

    public void setPropertyValueId(Integer propertyValueId) {
        this.propertyValueId = propertyValueId;
    }


    public String getPropertyValueValue() {
        return propertyValueValue;
    }

    public void setPropertyValueValue(String propertyValueValue) {
        this.propertyValueValue = propertyValueValue;
    }


    public Integer getPropertyValuePropertyId() {
        return propertyValuePropertyId;
    }

    public void setPropertyValuePropertyId(Integer propertyValuePropertyId) {
        this.propertyValuePropertyId = propertyValuePropertyId;
    }


    public Integer getPropertyValueProductId() {
        return propertyValueProductId;
    }

    public void setPropertyValueProductId(Integer propertyValueProductId) {
        this.propertyValueProductId = propertyValueProductId;
    }

}
