package com.Object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DownsizedSmall {

@SerializedName("height")
@Expose
private String height;
@SerializedName("mp4")
@Expose
private String mp4;
@SerializedName("mp4_size")
@Expose
private String mp4Size;
@SerializedName("width")
@Expose
private String width;

public String getHeight() {
return height;
}

public void setHeight(String height) {
this.height = height;
}

public DownsizedSmall withHeight(String height) {
this.height = height;
return this;
}

public String getMp4() {
return mp4;
}

public void setMp4(String mp4) {
this.mp4 = mp4;
}

public DownsizedSmall withMp4(String mp4) {
this.mp4 = mp4;
return this;
}

public String getMp4Size() {
return mp4Size;
}

public void setMp4Size(String mp4Size) {
this.mp4Size = mp4Size;
}

public DownsizedSmall withMp4Size(String mp4Size) {
this.mp4Size = mp4Size;
return this;
}

public String getWidth() {
return width;
}

public void setWidth(String width) {
this.width = width;
}

public DownsizedSmall withWidth(String width) {
this.width = width;
return this;
}

}