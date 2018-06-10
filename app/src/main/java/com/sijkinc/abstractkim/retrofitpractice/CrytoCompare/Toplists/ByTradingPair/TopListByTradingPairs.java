package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.ByTradingPair;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


@lombok.Data
public class TopListByTradingPairs {
    @SerializedName("Response")
    private String response;
    @SerializedName("Data")
    private ArrayList<Data> data;
}
