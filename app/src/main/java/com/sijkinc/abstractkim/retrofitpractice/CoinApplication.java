package com.sijkinc.abstractkim.retrofitpractice;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;


public class CoinApplication extends Application {
    private final String TAG = "CoinApplication";
    private static CoinApplication instance;
    private static Context appContext;

    public static CoinApplication getInstance() {return instance;}

    public static Context getAppContext() {return appContext;}
    public static final Drawable getDrawableFromApp(int id){
        final int version = Build.VERSION.SDK_INT;
        if(version >= 21)
            return appContext.getDrawable(id);
        else
            return appContext.getResources().getDrawable(id);

    }

    public void setAppContext(Context appContext) {this.appContext = appContext;}


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        this.setAppContext(getApplicationContext());
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        Log.d(TAG, "onCreate() - i wonder when the CoinApplication is created" );
    }
}


