package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.TopExchangesFullDataByPair;

import com.google.gson.annotations.SerializedName;

@lombok.Data
public class TopExchangesFullDataByPair {
    @SerializedName("Response")
    private String response;
    @SerializedName("Message")
    private String message;
    @SerializedName("Data")
    private Data data;
}
