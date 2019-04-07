package com.wd.tech.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.google.gson.Gson
import com.wd.tech.R
import com.wd.tech.adapter.RecyAdapter
import com.wd.tech.bean.CinemaBean
import kotlinx.android.synthetic.main.activity_test2.*

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
        val zdy_mesg = this.intent.getBundleExtra("ZDY_MESG")
        val json = zdy_mesg.getString("cn.jpush.android.MESSAGE")
        val (_, result) = Gson().fromJson(json, CinemaBean::class.java)

        val recyAdapter = RecyAdapter(result)
        recy_broadcast.layoutManager = LinearLayoutManager(this)
        recy_broadcast.adapter = recyAdapter
    }

}
