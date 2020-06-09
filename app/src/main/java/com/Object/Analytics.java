package com.Object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Analytics {

@SerializedName("onload")
@Expose
private Onload onload;
@SerializedName("onclick")
@Expose
private Onclick onclick;
@SerializedName("onsent")
@Expose
private Onsent onsent;

public Onload getOnload() {
return onload;
}

public void setOnload(Onload onload) {
this.onload = onload;
}

public Analytics withOnload(Onload onload) {
this.onload = onload;
return this;
}

public Onclick getOnclick() {
return onclick;
}

public void setOnclick(Onclick onclick) {
this.onclick = onclick;
}

public Analytics withOnclick(Onclick onclick) {
this.onclick = onclick;
return this;
}

public Onsent getOnsent() {
return onsent;
}

public void setOnsent(Onsent onsent) {
this.onsent = onsent;
}

public Analytics withOnsent(Onsent onsent) {
this.onsent = onsent;
return this;
}

}