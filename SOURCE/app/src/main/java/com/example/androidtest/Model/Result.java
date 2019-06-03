package com.example.androidtest.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

@SerializedName("customerDetail")
@Expose
public CustomerDetail customerDetail;
@SerializedName("listNews")
@Expose
public List<ListNews> listNews = null;
@SerializedName("listPromotion")
@Expose
public List<ListPromotion> listPromotion = null;

    public CustomerDetail getCustomerDetail() {
        return customerDetail;
    }

    public void setCustomerDetail(CustomerDetail customerDetail) {
        this.customerDetail = customerDetail;
    }

    public List<ListNews> getListNews() {
        return listNews;
    }

    public void setListNews(List<ListNews> listNews) {
        this.listNews = listNews;
    }

    public List<ListPromotion> getListPromotion() {
        return listPromotion;
    }

    public void setListPromotion(List<ListPromotion> listPromotion) {
        this.listPromotion = listPromotion;
    }
}