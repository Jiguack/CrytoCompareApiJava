package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.ByPairVolume;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@lombok.Data
public class TopListByPairVolume {
    @SerializedName("Data")
    ArrayList<Data> data;
}
