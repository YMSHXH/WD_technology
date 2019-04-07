package com.wd.tech.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wd.tech.R

class Test2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
        initData()
    }

    /**
     * 获取推送过来的数据
     */
    private fun initData() {


    }

}
