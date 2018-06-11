package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.News.ListNewsFeeds;

import com.google.gson.annotations.SerializedName;

@lombok.Data
public class Array {
    @SerializedName("key")
    private String key;
    @SerializedName("name")
    private String name;
    @SerializedName("lang")
    private String lang;
    @SerializedName("img")
    private String img;
}
