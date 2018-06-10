package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.ByPairVolume;

import com.google.gson.annotations.SerializedName;

@lombok.Data
public class Data {
    @SerializedName("SYMBOL")
    private String symbol;
    @SerializedName("SUPPLY")
    private String supply;
    @SerializedName("FULLNAME")
    private String fullName;
    @SerializedName("NAME")
    private String name;
    @SerializedName("ID")
    private String id;
    @SerializedName("VOLUME24HOURTO")
    private String volume24HourTo;
}
