package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Price.MultipleSymbolPrice;

import com.google.gson.annotations.SerializedName;

@lombok.Data
public class MultipleSymbolPrice {
    @SerializedName("BTC")
    private BTC btc;
    @SerializedName("ETH")
    private ETH eth;
}
