package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.News.LatestNewsArticles;
import com.google.gson.annotations.SerializedName;

@lombok.Data
class SourceInfo {
    @SerializedName("name")
    private String name;
    @SerializedName("lang")
    private String lang;
    @SerializedName("img")
    private String img;
}
