package com.wd.tech.application;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * FileName: MyApplication
 * Author: 杨明森
 * Date: 2019/4/7 13:58
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //极光推送
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);

    }
}
