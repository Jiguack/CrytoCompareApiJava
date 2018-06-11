package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.News.ListNewsFeeds;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

@lombok.Data
public class ListNewsFeeds {
    //@SerializedName("https://min-api.cryptocompare.com/data/news/feeds")
    private Call<List<Array>> array;
}
