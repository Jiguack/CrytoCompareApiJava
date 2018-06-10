package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Price.MultipleSymbolPrice;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.Query;

@lombok.Data
public class BTC {
    @SerializedName("USD")
    private String usd;
    @SerializedName("EUR")
    private String eur;
    @SerializedName("JPY")
    private String jpy;

}
