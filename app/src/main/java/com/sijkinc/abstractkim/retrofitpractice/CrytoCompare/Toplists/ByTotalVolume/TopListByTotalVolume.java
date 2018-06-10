package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.ByTotalVolume;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@lombok.Data
public class TopListByTotalVolume {
    @SerializedName("Message")
    private String message;
    @SerializedName("Type")
    private String type;
    @SerializedName("Data")
    private ArrayList<Data> Data;
}
