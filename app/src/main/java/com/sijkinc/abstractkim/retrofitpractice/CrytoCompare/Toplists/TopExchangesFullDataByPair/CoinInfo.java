package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.TopExchangesFullDataByPair;

import com.google.gson.annotations.SerializedName;

@lombok.Data
public class CoinInfo {
    @SerializedName("Id")
    private String id;
    @SerializedName("Name")
    private String name;
    @SerializedName("FullName")
    private String fullName;
    @SerializedName("Internal")
    private String internal;
    @SerializedName("ImageUrl")
    private String imageUrl;
    @SerializedName("Url")
    private String url;
    @SerializedName("Algorithm")
    private String algorithm;
    @SerializedName("ProofType")
    private String proofYpe;
    @SerializedName("TotalCoinsMined")
    private String totalCoinsMined;
    @SerializedName("BlockNumber")
    private String blockNumber;
    @SerializedName("NetHashesPerSecond")
    private String netHashesPerSecond;
    @SerializedName("BlockReward")
    private String blockReward;
    @SerializedName("BlockTime")
    private String blockTime;
    @SerializedName("TotalVolume24H")
    private String totalVolume24H;



}
