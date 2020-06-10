package com.Object;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// Для хранения сохранненых gif-изображений раскомментировать!
// Пока не работает, Cannot figure out how to save this field into database. You can consider adding a type converter for it.
// Надо дописать конвертеры для сложных типов( Images, Abstraction, и вложенным в них сложным типам)
@Entity
public class Datum {

@SerializedName("type")
@Expose
private String type;

@SerializedName("id")
@Expose
@PrimaryKey
@NonNull
private String id;

@SerializedName("url")
@Expose
private String url;

@SerializedName("slug")
@Expose
private String slug;

@SerializedName("bitly_gif_url")
@Expose
private String bitlyGifUrl;

@SerializedName("bitly_url")
@Expose
private String bitlyUrl;

@SerializedName("embed_url")
@Expose
private String embedUrl;

@SerializedName("username")
@Expose
private String username;

@SerializedName("source")
@Expose
private String source;
@SerializedName("title")
@Expose
private String title;

@SerializedName("rating")
@Expose
private String rating;

@SerializedName("content_url")
@Expose
private String contentUrl;

@SerializedName("source_tld")
@Expose
private String sourceTld;

@SerializedName("source_post_url")
@Expose
private String sourcePostUrl;

@SerializedName("is_sticker")
@Expose
private int isSticker;

@SerializedName("import_datetime")
@Expose
private String importDatetime;

@SerializedName("trending_datetime")
@Expose
private String trendingDatetime;
@SerializedName("images")
@Expose
private Images images;

@SerializedName("analytics_response_payload")
@Expose
private String analyticsResponsePayload;
@SerializedName("analytics")
@Expose
private Analytics analytics;

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public Datum withType(String type) {
this.type = type;
return this;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public Datum withId(String id) {
this.id = id;
return this;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public Datum withUrl(String url) {
this.url = url;
return this;
}

public String getSlug() {
return slug;
}

public void setSlug(String slug) {
this.slug = slug;
}

public Datum withSlug(String slug) {
this.slug = slug;
return this;
}

public String getBitlyGifUrl() {
return bitlyGifUrl;
}

public void setBitlyGifUrl(String bitlyGifUrl) {
this.bitlyGifUrl = bitlyGifUrl;
}

public Datum withBitlyGifUrl(String bitlyGifUrl) {
this.bitlyGifUrl = bitlyGifUrl;
return this;
}

public String getBitlyUrl() {
return bitlyUrl;
}

public void setBitlyUrl(String bitlyUrl) {
this.bitlyUrl = bitlyUrl;
}

public Datum withBitlyUrl(String bitlyUrl) {
this.bitlyUrl = bitlyUrl;
return this;
}

public String getEmbedUrl() {
return embedUrl;
}

public void setEmbedUrl(String embedUrl) {
this.embedUrl = embedUrl;
}

public Datum withEmbedUrl(String embedUrl) {
this.embedUrl = embedUrl;
return this;
}

public String getUsername() {
return username;
}

public void setUsername(String username) {
this.username = username;
}

public Datum withUsername(String username) {
this.username = username;
return this;
}

public String getSource() {
return source;
}

public void setSource(String source) {
this.source = source;
}

public Datum withSource(String source) {
this.source = source;
return this;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public Datum withTitle(String title) {
this.title = title;
return this;
}

public String getRating() {
return rating;
}

public void setRating(String rating) {
this.rating = rating;
}

public Datum withRating(String rating) {
this.rating = rating;
return this;
}

public String getContentUrl() {
return contentUrl;
}

public void setContentUrl(String contentUrl) {
this.contentUrl = contentUrl;
}

public Datum withContentUrl(String contentUrl) {
this.contentUrl = contentUrl;
return this;
}

public String getSourceTld() {
return sourceTld;
}

public void setSourceTld(String sourceTld) {
this.sourceTld = sourceTld;
}

public Datum withSourceTld(String sourceTld) {
this.sourceTld = sourceTld;
return this;
}

public String getSourcePostUrl() {
return sourcePostUrl;
}

public void setSourcePostUrl(String sourcePostUrl) {
this.sourcePostUrl = sourcePostUrl;
}

public Datum withSourcePostUrl(String sourcePostUrl) {
this.sourcePostUrl = sourcePostUrl;
return this;
}

public int getIsSticker() {
return isSticker;
}

public void setIsSticker(int isSticker) {
this.isSticker = isSticker;
}

public Datum withIsSticker(int isSticker) {
this.isSticker = isSticker;
return this;
}

public String getImportDatetime() {
return importDatetime;
}

public void setImportDatetime(String importDatetime) {
this.importDatetime = importDatetime;
}

public Datum withImportDatetime(String importDatetime) {
this.importDatetime = importDatetime;
return this;
}

public String getTrendingDatetime() {
return trendingDatetime;
}

public void setTrendingDatetime(String trendingDatetime) {
this.trendingDatetime = trendingDatetime;
}

public Datum withTrendingDatetime(String trendingDatetime) {
this.trendingDatetime = trendingDatetime;
return this;
}

public Images getImages() {
return images;
}

public void setImages(Images images) {
this.images = images;
}

public Datum withImages(Images images) {
this.images = images;
return this;
}

public String getAnalyticsResponsePayload() {
return analyticsResponsePayload;
}

public void setAnalyticsResponsePayload(String analyticsResponsePayload) {
this.analyticsResponsePayload = analyticsResponsePayload;
}

public Datum withAnalyticsResponsePayload(String analyticsResponsePayload) {
this.analyticsResponsePayload = analyticsResponsePayload;
return this;
}

public Analytics getAnalytics() {
return analytics;
}

public void setAnalytics(Analytics analytics) {
this.analytics = analytics;
}

public Datum withAnalytics(Analytics analytics) {
this.analytics = analytics;
return this;
}

}