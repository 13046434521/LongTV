package com.t.longtv.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.t.longtv.GlideApp;
import com.t.longtv.R;

import cn.bingoogolapple.bgabanner.BGABanner;

/**
 * 作者：龙昊
 * 日期：2018/4/21 16:05
 * 描述：推荐Banner 适配器
 */
public  class BannerAdapter implements BGABanner.Adapter<ImageView, String> {
    private Context context;
    public BannerAdapter(Context context){
        this.context=context;
    }


    @Override
    public void fillBannerItem(BGABanner banner, ImageView itemView, @Nullable String model, int position) {
        GlideApp.with(context)
                .load(model)
                .placeholder(R.mipmap.home_banner_loading_bg)
                .error(R.mipmap.home_banner_loading_bg)
                .centerCrop()
                .dontAnimate()
                .into(itemView);
    }
}
