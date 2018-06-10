package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Price.SingleSymbolPrice;

import com.google.gson.annotations.SerializedName;

@lombok.Data
public class SingleSymbolPrice {
    @SerializedName("USD")
    private String usd;
    @SerializedName("JPY")
    private String jpy;
    @SerializedName("EUR")
    private String eur;
}
