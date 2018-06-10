package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.ByTotalVolume;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import lombok.Data;

@Data
public class ConversionInfo {
    @SerializedName("Conversion")
    private String conversion;
    @SerializedName("ConversionSymbol")
    private String conversionSymbol;
    @SerializedName("CurrencyFrom")
    private String currencyFrom;
    @SerializedName("CurrencyTo")
    private String currencyTo;
    @SerializedName("Market")
    private String market;
    @SerializedName("Supply")
    private String supply;
    @SerializedName("TotalVolume24H")
    private String totalVolume24H;
    @SerializedName("SubBase")
    private String subBase;
    @SerializedName("SubsNeeded")
    private ArrayList<String> subNeeded;
    @SerializedName("RAW")
    private ArrayList<String> raw;

}
