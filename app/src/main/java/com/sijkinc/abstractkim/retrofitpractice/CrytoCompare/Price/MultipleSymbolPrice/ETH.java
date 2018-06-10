package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Price.MultipleSymbolPrice;

import com.google.gson.annotations.SerializedName;

@lombok.Data
public class ETH {
    @SerializedName("USD")
    private String usd;
    @SerializedName("EUR")
    private String eur;
    @SerializedName("JPY")
    private String jpy;
}
