package com.Object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Original {

    @SerializedName("frames")
    @Expose
    private String frames;
    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("webp")
    @Expose
    private String webp;
    @SerializedName("webp_size")
    @Expose
    private String webpSize;
    @SerializedName("width")
    @Expose
    private String width;

    public String getFrames() {
        return frames;
    }

    public void setFrames(String frames) {
        this.frames = frames;
    }

    public Original withFrames(String frames) {
        this.frames = frames;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Original withHash(String hash) {
        this.hash = hash;
        return this;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Original withHeight(String height) {
        this.height = height;
        return this;
    }

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    public Original withMp4(String mp4) {
        this.mp4 = mp4;
        return this;
    }

    public String getMp4Size() {
        return mp4Size;
    }

    public void setMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
    }

    public Original withMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
        return this;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Original withSize(String size) {
        this.size = size;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Original withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getWebp() {
        return webp;
    }

    public void setWebp(String webp) {
        this.webp = webp;
    }

    public Original withWebp(String webp) {
        this.webp = webp;
        return this;
    }

    public String getWebpSize() {
        return webpSize;
    }

    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    public Original withWebpSize(String webpSize) {
        this.webpSize = webpSize;
        return this;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Original withWidth(String width) {
        this.width = width;
        return this;
    }

}