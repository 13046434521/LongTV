package com.t.longtv.adapter;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.t.longtv.AppAplication;
import com.t.longtv.GlideApp;
import com.t.longtv.R;
import com.t.longtv.bean.SubscribeBean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/30 21:50
 * 描述：
 */
public class SubscribeItemAdapter extends BaseQuickAdapter<SubscribeBean.DataBean, BaseViewHolder> {
    private boolean isLive;

    public SubscribeItemAdapter(boolean isLive, int layoutResId, @Nullable List<SubscribeBean.DataBean> data) {
        super(layoutResId, data);
        this.isLive = isLive;
    }


    @Override
    protected void convert(BaseViewHolder helper, SubscribeBean.DataBean item) {
        if (isLive) {
            GlideApp.with(AppAplication.getAppAplication()).load(item.getImage())
                    .centerInside()
                    .into((ImageView) helper.getView(R.id.iv_subscribe_item_container));

            GlideApp.with(AppAplication.getAppAplication()).load(item.getHeadimg().getBig())
                    .centerInside()
                    .into((ImageView) helper.getView(R.id.civ_subscribe_item_head));


            helper.setText(R.id.iv_subscribe_item_name, item.getUsername());
            helper.setText(R.id.tv_subscribe_item_people, item.getViews());
            helper.setText(R.id.tv_subscribe_item_title,  item.getChannel());
        } else {
            GlideApp.with(AppAplication.getAppAplication()).load(item.getImage())
                    .centerInside()
                    .into((ImageView) helper.getView(R.id.civ_subscribe_item_nolive));
            helper.setText(R.id.tv_subscribe_item_title, item.getUsername());
            helper.setText(R.id.tv_subscribe_item_time, "上次开播时间：" + item.getStartTime());
            if (item.getIs_auto_vod() .equals("yes")) {
                helper.getView(R.id.iv_subscribe_item_report).setVisibility(View.VISIBLE);
            } else {
                helper.getView(R.id.iv_subscribe_item_report).setVisibility(View.GONE);
            }
        }
    }
}
