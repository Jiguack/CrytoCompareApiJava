package com.sijkinc.abstractkim.retrofitpractice;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.CrytoCompareApi;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.CrytoCompareApiRxJava;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.CrytoCompareService;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.ExcuteForResponse;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.News.LatestNewsArticles.LatestNewsArticles;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.News.ListNewsFeeds.ListNewsFeeds;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Price.MultipleSymbolPrice.MultipleSymbolPrice;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Price.SingleSymbolPrice.SingleSymbolPrice;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.ByPairVolume.TopListByPairVolume;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.ByTotalVolume.TopListByTotalVolume;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.ByTradingPair.TopListByTradingPairs;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.TopExchangesFullDataByPair.TopExchangesFullDataByPair;
import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.Toplists.TopExchangesVolumeDataByPair.TopExchangeVolumeDataByPair;


import java.security.CryptoPrimitive;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "PeterLuke";
    private ListView listView;

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Retrofit Builder Part
         *   - add base url
         *   - add GsonConvertor for parsing json
         *
         *   get an interface for request as client
         */
//        CrytoCompareApi api = CrytoCompareService.getCrytoCompareApi();
//        CrytoCompareApiRxJava apiRxJava = CrytoCompareService.getCrytoCompareApiRxJava();

//        /**
//         * Using Generic Method
//         * request query using interface which is created by Retrofit
//         */
//
//        CrytoCompareService.requestAndConsume(api.topListByTotalVolume(10, "USD",null),
//                new ExcuteForResponse<Response<TopListByTotalVolume>>() {
//            @Override
//            public void apply(Response<TopListByTotalVolume> response) {
//                Log.d(TAG, response.body().toString());
//            }
//        }, new ExcuteForResponse<Throwable>() {
//            @Override
//            public void apply(Throwable t) {
//                Log.d(TAG, t.toString());
//            }
//        });
//
//        /**
//         * Using Generic Method (Namda)
//         * request query using interface which is created by Retrofit
//         */
//        CrytoCompareService.requestAndConsume(api.topListByTotalVolume(10, "USD", null),
//                response -> Log.d(TAG, "Nanma topListByTotalVolume -->" + response.body().toString()),
//                t-> Log.d(TAG, t.toString()));
//
//        /**
//         * Using RxJava
//         * request query using interface which is created by Retrofit
//         */
//
//        Observable<TopListByTotalVolume> observableTopListByTotalVolume = apiRxJava.topListByTotalVolume(10, "USD", null);
//        final Disposable subscribe = observableTopListByTotalVolume
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(topListByTotalVolume -> Log.d(TAG, "RXJAVA--> " + topListByTotalVolume.toString()));
//
//
//
//
//        CrytoCompareService.requestAndConsume(api.topListByTradingPairs("BTC", null, null, null),
//                response -> Log.d(TAG, "Nanma topListByTradingPairs -->" + response.body().toString()),
//                t-> Log.d(TAG, t.toString()));
//
//
//
//        Observable<TopListByPairVolume> observableTopListByPairVolume = apiRxJava.topListByPairVolume("BTC", null, null,null);
//        observableTopListByPairVolume
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(topListByPairVolume -> Log.d(TAG, "RXJAVA--> " + topListByPairVolume.toString()));

//        Observable<TopExchangesFullDataByPair> observableTopExchangesFullDataByPair = apiRxJava.topExchangesFullDataByPair("BTC", "USD", null, null,null);
//        observableTopExchangesFullDataByPair
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(topExchangesFullDataByPair -> Log.d(TAG, "RXJAVA--> " + topExchangesFullDataByPair.toString()));



//        Observable<TopExchangeVolumeDataByPair> observableTopExchangeVolumeDataByPair = apiRxJava.topExchangesVolumeDataByPair("BTC", "USD", null, null,null);
//        observableTopExchangeVolumeDataByPair
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(topExchangesVolumeByPair -> Log.d(TAG, "RXJAVA--> " + topExchangesVolumeByPair.toString()));

//        Observable<SingleSymbolPrice> observableSingleSymbolPrice = apiRxJava.singleSymbolPrice("BTC", "USD,EUR,JPY", null, null,null);
//        observableSingleSymbolPrice
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(singleSymbolPrice -> Log.d(TAG, "RXJAVA--> " + singleSymbolPrice.toString()));

//        Observable<MultipleSymbolPrice> observableMultipleSymbolPrice = apiRxJava.multipleSymbolPrice("BTC,ETH", "USD,EUR,JPY", null, null,null, null);
//        observableMultipleSymbolPrice
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(multipleSymbolPrice -> Log.d(TAG, "RXJAVA--> " + multipleSymbolPrice.toString()));

//        Observable<ListNewsFeeds> observableListNewsFeeds = apiRxJava.listNewsFeeds(null, null);
//        final Disposable subscribe = observableListNewsFeeds
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(listNewsFeeds -> Log.d(TAG, "RXJAVA--> " + listNewsFeeds.toString()));

//        CrytoCompareService.requestAndConsume(api.listNewsFeeds(null, null),
//                response -> Log.d(TAG, "Nanma listNewsFeeds -->" + response.body().toString()),
//                t-> Log.d(TAG, t.toString()));


/*         Observable<LatestNewsArticles> observableLatestNewsArticles = apiRxJava.latestNewsArticles(null, null, null, null, "EN", null, null, null);
         final Disposable subscribe = observableLatestNewsArticles
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(latestNewsArticles -> Log.d(TAG, "RXJAVA--> " + latestNewsArticles.toString()));*/

//        CrytoCompareService.requestAndConsume(api.latestNewsArticles(null, null, null, null, "EN", null, null, null),
//                response -> Log.d(TAG, "Nanma latestNewsArticles -->" + response.body().toString()),
//                t-> Log.d(TAG, t.toString()));

//        Observable.create(e->{
//            try {
//                e.onNext(0);
//                e.onComplete();
//            }catch (Throwable t){
//                e.onError(t);
//            }
//        }).subscribe(i-> Log.d(TAG, "onNext()" + i),
//                     t-> Log.d(TAG, "onError()" + t),
//                     ()-> Log.d(TAG, "onComplete()")
//        );

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new CoinListFragment())
                    .commit();
        }
    }


}
