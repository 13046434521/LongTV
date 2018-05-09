package com.t.longtv.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.t.longtv.AppAplication;
import com.t.longtv.GlideApp;
import com.t.longtv.R;
import com.t.longtv.bean.HistoryBean;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * 作者：龙昊
 * 日期：2018/5/1 19:05
 * 描述：
 */
public class HistoryAdapter extends BaseQuickAdapter<HistoryBean.DataBean,BaseViewHolder> {


    public HistoryAdapter(int layoutResId, @Nullable List<HistoryBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HistoryBean.DataBean item) {
        helper.setText(R.id.tv_history_head,item.getChannel());

        helper.setText(R.id.tv_history_name,item.getUsername());

        helper.setText(R.id.tv_history_type,item.getGname());

        helper.setText(R.id.tv_history_time,String.valueOf(item.getTime_text()));

        GlideApp.with(AppAplication.getAppAplication())
                .load(item.getHeadimg())
                .error(R.mipmap.default_head_icon)
                .placeholder(R.mipmap.default_head_icon)
                .into((CircleImageView) helper.getView(R.id.civ_history_head));

        GlideApp.with(AppAplication.getAppAplication())
                .load(item.getImg())
                .centerInside()
                .error(R.mipmap.live_loading_bg)
                .placeholder(R.mipmap.live_loading_bg)
                .into((ImageView) helper.getView(R.id.iv_history_head));
    }
}
