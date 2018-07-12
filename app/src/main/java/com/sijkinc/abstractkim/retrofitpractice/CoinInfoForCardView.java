package com.sijkinc.abstractkim.retrofitpractice;

import android.annotation.SuppressLint;
import android.util.Log;

import com.sijkinc.abstractkim.retrofitpractice.CrytoCompare.CrytoCompareService;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

@lombok.Data
public class CoinInfoForCardView {
    enum GAIN{
        GAIN, LOSS
    }
    private final String TAG = "CoinInfoForCardView";
    public static String CURRENCY  = "USD";

    private String name;
    private String fullName;
    private String price;
    private String change24hour;
    private GAIN gain = GAIN.GAIN;


    public static int COIN_TOTAL_NUMBER;
    public static int COMPLETED_NUM;
    private static MyCompletable completable = new MyCompletable();
    public static MyCompletable getMyCompletable() {return completable;}

    @SuppressLint("CheckResult")
    CoinInfoForCardView(String name, String fullName){
        this.name = name;
        this.fullName = fullName;


        //in order get price and change24Hour
        CrytoCompareService.getCrytoCompareApiRxJava()
                .topExchangesFullDataByPair(name, CURRENCY, null, null, null)
                .subscribeOn(Schedulers.io())
                .subscribe(topExchangesFullDataByPair -> {
                    if(topExchangesFullDataByPair.getData().getAggregatedData() != null){
                        Double dPrice = Double.valueOf(topExchangesFullDataByPair.getData().getAggregatedData().getPrice());
                        this.price = String.format("%.2f",dPrice );
                        Double dChange24hour = Double.valueOf(topExchangesFullDataByPair.getData().getAggregatedData().getChange24Hour());
                        if(dChange24hour < 0){
                            gain = GAIN.LOSS;
                        }
                        this.change24hour = String.format("%.2f",dChange24hour );

                    }else{
                        this.price = "N/A";
                        this.change24hour = "N/A";
                    }
                    ++COMPLETED_NUM;
                    Log.d(TAG, "COMPLETED_NUM:" + COMPLETED_NUM);
                    if(COIN_TOTAL_NUMBER == COMPLETED_NUM){
                        completable.completeAction();
                        Log.d(TAG, "Complete all process. thus, emit completion");
                    }
                });

    }





    //let's look for another way..... i don't like polling;;;;; push push
    public Observable<String> priceObservable(){
        return Observable.create(s -> {
            boolean loop = true;
           while (loop){
               if(price != null){

                   s.onNext(price);
                   s.onComplete();
                   loop = false;
               }
               Thread.sleep(1000);
           }
        });
    }
    public Observable<String> change24HourObservable(){
        return Observable.create(s -> {
            boolean loop = true;
            while (loop){
                if(price != null){

                    s.onNext(change24hour);
                    s.onComplete();
                    loop = false;
                }
                Thread.sleep(1000);
            }
        });
    }
}

