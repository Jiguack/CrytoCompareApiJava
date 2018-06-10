package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare;

import android.util.Log;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CrytoCompareService {
    static final String TAG = "CrytoCompareService";
    static private CrytoCompareApi api = null;
    static private CrytoCompareApiRxJava apiRxJava = null;

    static public CrytoCompareApi getCrytoCompareApi(){
        if(api == null) {
            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl("https://min-api.cryptocompare.com/")
                    .addConverterFactory(GsonConverterFactory.create());
            Retrofit retrofit = builder.build();
            api = retrofit.create(CrytoCompareApi.class);
        }
        return api;

    }

    static public CrytoCompareApiRxJava getCrytoCompareApiRxJava(){
        if(apiRxJava == null) {
            Retrofit.Builder builderRxJava = new Retrofit.Builder()
                    .baseUrl("https://min-api.cryptocompare.com/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create());
            Retrofit retrofitRxJava= builderRxJava.build();
            apiRxJava = retrofitRxJava.create(CrytoCompareApiRxJava.class);
        }
        return apiRxJava;

    }

    static public <T> void requestAndConsume(Call<T> call, ExcuteForResponse<Response<T>> excute, ExcuteForResponse<Throwable> error){
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                Log.d(TAG, response.toString());
                excute.apply(response);
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                error.apply(t);
            }
        });
    }
}
