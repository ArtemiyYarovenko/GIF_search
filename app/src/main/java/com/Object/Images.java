package com.Object;

import androidx.room.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class Images {

    @SerializedName("downsized_large")
    @Expose
    private DownsizedLarge downsizedLarge;
    @SerializedName("fixed_height_small_still")
    @Expose
    private FixedHeightSmallStill fixedHeightSmallStill;
    @SerializedName("original")
    @Expose
    private Original original;
    @SerializedName("fixed_height_downsampled")
    @Expose
    private FixedHeightDownsampled fixedHeightDownsampled;
    @SerializedName("downsized_still")
    @Expose
    private DownsizedStill downsizedStill;
    @SerializedName("fixed_height_still")
    @Expose
    private FixedHeightStill fixedHeightStill;
    @SerializedName("downsized_medium")
    @Expose
    private DownsizedMedium downsizedMedium;
    @SerializedName("downsized")
    @Expose
    private Downsized downsized;
    @SerializedName("preview_webp")
    @Expose
    private PreviewWebp previewWebp;
    @SerializedName("original_mp4")
    @Expose
    private OriginalMp4 originalMp4;
    @SerializedName("fixed_height_small")
    @Expose
    private FixedHeightSmall fixedHeightSmall;
    @SerializedName("fixed_height")
    @Expose
    private FixedHeight fixedHeight;
    @SerializedName("downsized_small")
    @Expose
    private DownsizedSmall downsizedSmall;
    @SerializedName("preview")
    @Expose
    private Preview preview;
    @SerializedName("fixed_width_downsampled")
    @Expose
    private FixedWidthDownsampled fixedWidthDownsampled;
    @SerializedName("fixed_width_small_still")
    @Expose
    private FixedWidthSmallStill fixedWidthSmallStill;
    @SerializedName("fixed_width_small")
    @Expose
    private FixedWidthSmall fixedWidthSmall;
    @SerializedName("original_still")
    @Expose
    private OriginalStill originalStill;
    @SerializedName("fixed_width_still")
    @Expose
    private FixedWidthStill fixedWidthStill;
    @SerializedName("looping")
    @Expose
    private Looping looping;
    @SerializedName("fixed_width")
    @Expose
    private FixedWidth fixedWidth;
    @SerializedName("preview_gif")
    @Expose
    private PreviewGif previewGif;
    @SerializedName("480w_still")
    @Expose
    private com.Object._480wStill _480wStill;

    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    public Images withDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
        return this;
    }

    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    public Images withFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
        return this;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }

    public Images withOriginal(Original original) {
        this.original = original;
        return this;
    }

    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    public Images withFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
        return this;
    }

    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    public Images withDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
        return this;
    }

    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    public Images withFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
        return this;
    }

    public DownsizedMedium getDownsizedMedium() {
        return downsizedMedium;
    }

    public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
    }

    public Images withDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
        return this;
    }

    public Downsized getDownsized() {
        return downsized;
    }

    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    public Images withDownsized(Downsized downsized) {
        this.downsized = downsized;
        return this;
    }

    public PreviewWebp getPreviewWebp() {
        return previewWebp;
    }

    public void setPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
    }

    public Images withPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
        return this;
    }

    public OriginalMp4 getOriginalMp4() {
        return originalMp4;
    }

    public void setOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
    }

    public Images withOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
        return this;
    }

    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    public Images withFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
        return this;
    }

    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public Images withFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
        return this;
    }

    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    public Images withDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
        return this;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public Images withPreview(Preview preview) {
        this.preview = preview;
        return this;
    }

    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    public Images withFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
        return this;
    }

    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    public Images withFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
        return this;
    }

    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    public Images withFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
        return this;
    }

    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    public Images withOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
        return this;
    }

    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    public Images withFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
        return this;
    }

    public Looping getLooping() {
        return looping;
    }

    public void setLooping(Looping looping) {
        this.looping = looping;
    }

    public Images withLooping(Looping looping) {
        this.looping = looping;
        return this;
    }

    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    public Images withFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
        return this;
    }

    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

    public Images withPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
        return this;
    }

    public com.Object._480wStill get480wStill() {
        return _480wStill;
    }

    public void set480wStill(com.Object._480wStill _480wStill) {
        this._480wStill = _480wStill;
    }

    public Images with480wStill(com.Object._480wStill _480wStill) {
        this._480wStill = _480wStill;
        return this;
    }

}