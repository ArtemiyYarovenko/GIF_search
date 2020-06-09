package com.Object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixedHeight {

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

public String getHeight() {
return height;
}

public void setHeight(String height) {
this.height = height;
}

public FixedHeight withHeight(String height) {
this.height = height;
return this;
}

public String getMp4() {
return mp4;
}

public void setMp4(String mp4) {
this.mp4 = mp4;
}

public FixedHeight withMp4(String mp4) {
this.mp4 = mp4;
return this;
}

public String getMp4Size() {
return mp4Size;
}

public void setMp4Size(String mp4Size) {
this.mp4Size = mp4Size;
}

public FixedHeight withMp4Size(String mp4Size) {
this.mp4Size = mp4Size;
return this;
}

public String getSize() {
return size;
}

public void setSize(String size) {
this.size = size;
}

public FixedHeight withSize(String size) {
this.size = size;
return this;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public FixedHeight withUrl(String url) {
this.url = url;
return this;
}

public String getWebp() {
return webp;
}

public void setWebp(String webp) {
this.webp = webp;
}

public FixedHeight withWebp(String webp) {
this.webp = webp;
return this;
}

public String getWebpSize() {
return webpSize;
}

public void setWebpSize(String webpSize) {
this.webpSize = webpSize;
}

public FixedHeight withWebpSize(String webpSize) {
this.webpSize = webpSize;
return this;
}

public String getWidth() {
return width;
}

public void setWidth(String width) {
this.width = width;
}

public FixedHeight withWidth(String width) {
this.width = width;
return this;
}

}