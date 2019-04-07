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

        // 一般登录之后调用此方法设置别名
        // sequence 用来标识一次操作的唯一性(退出登录时根据此参数删除别名)
        // alias 设置有效的别名
        // 有效的别名组成：字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|。限制：alias 命名长度限制为 40 字节。
        JPushInterface.setAlias(this, 12312, "AaMs__");
        // 退出登录删除别名
        //PushInterface.deleteAlias(Context context,int sequence);

    }
}
