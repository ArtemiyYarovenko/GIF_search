package com.Object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Onload {

    @SerializedName("url")
    @Expose
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Onload withUrl(String url) {
        this.url = url;
        return this;
    }

}