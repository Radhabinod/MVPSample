package com.techindustan.mvpdemo.model.home;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Awesome Pojo Generator
 */
public class HomeResponse {
    @SerializedName("data")
    @Expose
    private List<Data> data;
    @SerializedName("status")
    @Expose
    private Integer status;

    public void setData(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return data;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }
}