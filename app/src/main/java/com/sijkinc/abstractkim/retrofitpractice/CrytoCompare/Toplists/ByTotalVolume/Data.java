package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.ByTotalVolume;

import com.google.gson.annotations.SerializedName;


@lombok.Data
public class Data {
    @SerializedName("CoinInfo")
    private CoinInfo coinInfo;
    @SerializedName("ConversionInfo")
    private ConversionInfo conversionInfo;

}
