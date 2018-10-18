package com.bitcv.bitsdkasdemo;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.bitcv.sdk.BvAche.BvSdkApplication;

/**
 * Created by VULCAN on 2018/8/9.
 */

public class myApplication extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        String appid = "bcv2SnqmaJ4Y4xk2";

        BvSdkApplication bcvSdkApplication = new BvSdkApplication();
        bcvSdkApplication.init(this, appid);

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }
}
