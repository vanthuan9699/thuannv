package com.example.androidtest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerDetail {

@SerializedName("customerName")
@Expose
public String customerName;
@SerializedName("phone")
@Expose
public String phone;
@SerializedName("point")
@Expose
public Integer point;
@SerializedName("isNee\u0111Upate")
@Expose
public Integer isNeeUpate;
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getIsNeeUpate() {
        return isNeeUpate;
    }

    public void setIsNeeUpate(Integer isNeeUpate) {
        this.isNeeUpate = isNeeUpate;
    }
}
