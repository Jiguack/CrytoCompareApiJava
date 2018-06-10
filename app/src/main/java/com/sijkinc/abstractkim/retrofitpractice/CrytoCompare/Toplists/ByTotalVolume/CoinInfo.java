package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.ByTotalVolume;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
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
    private String proofType;
    @SerializedName("NetHashesPerSecond")
    private String netHashesPerSecond;
    @SerializedName("BlockNumber")
    private String blockNumber;
    @SerializedName("BlockTime")
    private String blockTime;
    @SerializedName("BlockReward")
    private String blockReward;
    @SerializedName("Type")
    private String type;
    @SerializedName("DocumentType")
    private String documentType;
}
