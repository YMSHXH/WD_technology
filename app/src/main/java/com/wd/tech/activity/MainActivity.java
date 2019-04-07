package com.wd.tech.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wd.tech.R;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    public static boolean isForeground;
    public static final String MESSAGE_RECEIVED_ACTION = "com.wd.tech.MESSAGE_RECEIVED_ACTION";
    public static final String KEY_TITLE = "title";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_EXTRAS = "extras";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
