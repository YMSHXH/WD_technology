package com.wd.tech.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.wd.tech.R;
import com.wd.tech.adapter.RecyAdapter;
import com.wd.tech.bean.CinemaBean;

import java.util.List;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        RecyclerView recy_broadcast = findViewById(R.id.recy_broadcast);
        recy_broadcast.setLayoutManager(new LinearLayoutManager(this));

        Intent intent = getIntent();
        Bundle zdy_mesg = intent.getBundleExtra("ZDY_MESG");
        String json = zdy_mesg.getString("cn.jpush.android.MESSAGE");
        CinemaBean cinemaBean = new Gson().fromJson(json, CinemaBean.class);
        List<CinemaBean.Result> result = cinemaBean.getResult();
        Toast.makeText(this,result.size()+"数量",Toast.LENGTH_LONG).show();

        RecyAdapter recyAdapter = new RecyAdapter(result);
        recy_broadcast.setAdapter(recyAdapter);
    }
}
