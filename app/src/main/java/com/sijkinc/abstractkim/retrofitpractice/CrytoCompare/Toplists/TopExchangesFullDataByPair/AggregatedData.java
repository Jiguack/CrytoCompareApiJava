package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.TopExchangesFullDataByPair;

import com.google.gson.annotations.SerializedName;

@lombok.Data
public class AggregatedData {
    @SerializedName("TYPE")
    private String type;
    @SerializedName("MARKET")
    private String market;
    @SerializedName("FROMSYMBOL")
    private String fromSymbol;
    @SerializedName("TOSYMBOL")
    private String toSymbol;
    @SerializedName("FLAGS")
    private String flags;
    @SerializedName("PRICE")
    private String price;
    @SerializedName("LASTUPDATE")
    private String lastUpdate;
    @SerializedName("LASTVOLUME")
    private String lastVolume;
    @SerializedName("LASTVOLUMETO")
    private String lastVolumeTO;
    @SerializedName("LASTTRADEID")
    private String lastTradeId;
    @SerializedName("VOLUMEDAY")
    private String volumeDay;
    @SerializedName("VOLUMEDAYTO")
    private String volumeDayTo;
    @SerializedName("VOLUME24HOUR")
    private String volume24Hour;
    @SerializedName("VOLUME24HOURTO")
    private String volume24HourTo;
    @SerializedName("OPENDAY")
    private String openDay;
    @SerializedName("HIGHDAY")
    private String highDay;
    @SerializedName("LOWDAY")
    private String lowDay;
    @SerializedName("OPEN24HOUR")
    private String open24Hour;
    @SerializedName("HIGH24HOUR")
    private String high24Hour;
    @SerializedName("LOW24HOUR")
    private String low24Hour;
    @SerializedName("LASTMARKET")
    private String lastMarket;
    @SerializedName("CHANGE24HOUR")
    private String change24Hour;
    @SerializedName("CHANGEPCT24HOUR")
    private String changePct24Hour;
    @SerializedName("CHANGEDAY")
    private String changeDay;
    @SerializedName("CHANGEPCTDAY")
    private String changePctDay;
    @SerializedName("SUPPLY")
    private String supply;
    @SerializedName("MKTCAP")
    private String mktcap;
    @SerializedName("TOTALVOLUME24H")
    private String totalVolume24h;
    @SerializedName("TOTALVOLUME24HTO")
    private String totalVolume24hTo;



}
