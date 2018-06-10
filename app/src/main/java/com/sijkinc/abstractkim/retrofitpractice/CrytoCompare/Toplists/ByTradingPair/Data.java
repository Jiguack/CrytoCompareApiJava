package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.ByTradingPair;

import com.google.gson.annotations.SerializedName;

@lombok.Data
public class Data {
    @SerializedName("exchange")
    private String exchange;
    @SerializedName("fromSymbol")
    private String fromSymbol;
    @SerializedName("toSymbol")
    private String toSymbol;
    @SerializedName("volume24h")
    private String volume24h;
    @SerializedName("volume24hTo")
    private String volume24hTo;

}
