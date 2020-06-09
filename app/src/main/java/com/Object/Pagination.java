package com.Object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {

    @SerializedName("total_count")
    @Expose
    private int totalCount;
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("offset")
    @Expose
    private int offset;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public Pagination withTotalCount(int totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Pagination withCount(int count) {
        this.count = count;
        return this;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public Pagination withOffset(int offset) {
        this.offset = offset;
        return this;
    }

}