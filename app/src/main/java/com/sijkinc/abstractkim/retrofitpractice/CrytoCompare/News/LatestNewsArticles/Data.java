package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.News.LatestNewsArticles;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@lombok.Data
public class Data {
    @SerializedName("id")
    private String id;
    @SerializedName("guid")
    private String guid;
    @SerializedName("published_on")
    private String published_on;
    @SerializedName("imageurl")
    private String imageurl;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;
    @SerializedName("source")
    private String source;
    @SerializedName("body")
    private String body;
    @SerializedName("tags")
    private String tags;
    @SerializedName("categories")
    private String categories;
    @SerializedName("upvotes")
    private String upvotes;
    @SerializedName("downvotes")
    private String downvotes;
    @SerializedName("lang")
    private String lang;
    @SerializedName("source_info")
    private SourceInfo source_info;
}
