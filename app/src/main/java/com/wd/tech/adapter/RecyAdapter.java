package com.wd.tech.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.wd.tech.R;
import com.wd.tech.bean.CinemaBean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * FileName: RecyAdapter
 * Author: 杨明森
 * Date: 2019/4/7 16:19
 */
public class RecyAdapter extends BaseQuickAdapter<CinemaBean.Result, BaseViewHolder> {
    public RecyAdapter(@Nullable List<CinemaBean.Result> data) {
        super(R.layout.item_recy,data);
    }

    @Override
    protected void convert(BaseViewHolder helper, CinemaBean.Result item) {
        //时间格式化
        long releaseTime = item.getReleaseTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1=new Date(releaseTime);
        String brith = simpleDateFormat.format(d1);

        helper.setText(R.id.begin1_name,item.getName())
                .setText(R.id.movie1_summey,item.getSummary())
                .setText(R.id.movie1_time,brith);

        // 设置图片
        Glide.with(mContext).load(item.getImageUrl()).into((ImageView) helper.getView(R.id.begin1_image));

    }
}