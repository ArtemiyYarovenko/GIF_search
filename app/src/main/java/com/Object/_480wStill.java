package com.Object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class _480wStill {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public _480wStill withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public _480wStill withWidth(String width) {
        this.width = width;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public _480wStill withHeight(String height) {
        this.height = height;
        return this;
    }

}