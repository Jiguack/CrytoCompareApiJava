package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.TopExchangesFullDataByPair;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


@lombok.Data
public class Data {
    @SerializedName("CoinInfo")
    CoinInfo coinInfo;
    @SerializedName("AggregatedData")
    AggregatedData aggregatedData;
    @SerializedName("Exchanges")
    ArrayList<Exchanges> exchanges;
}
