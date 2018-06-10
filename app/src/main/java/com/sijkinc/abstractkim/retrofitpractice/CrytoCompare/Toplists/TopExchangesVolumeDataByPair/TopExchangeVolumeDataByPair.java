package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.TopExchangesVolumeDataByPair;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@lombok.Data
public class TopExchangeVolumeDataByPair {
    @SerializedName("Response")
    private String response;
    @SerializedName("Data")
    private ArrayList<Data> data;
}
