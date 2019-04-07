package com.wd.tech.adapter

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.wd.tech.R
import com.wd.tech.bean.CinemaBean
import java.text.SimpleDateFormat
import java.util.*

/**
 * FileName: RecyAdapter推送列表
 * Author: 杨明森
 * Date: 2019/4/7 16:32
 */
class RecyAdapter(data: List<CinemaBean.Result>?) : BaseQuickAdapter<CinemaBean.Result, BaseViewHolder>(R.layout.item_recy, data) {

    override fun convert(helper: BaseViewHolder, item: CinemaBean.Result) {
        //时间格式化
        val releaseTime = item.releaseTime
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd")
        val d1 = Date(releaseTime)
        val brith = simpleDateFormat.format(d1)

        helper.setText(R.id.begin1_name, item.name)
                .setText(R.id.movie1_summey, item.summary)
                .setText(R.id.movie1_time, brith)

        // 设置图片
        Glide.with(mContext).load(item.imageUrl).into(helper.getView(R.id.begin1_image) as ImageView)

    }
}