package com.t.longtv.adapter;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.t.longtv.AppConstants;
import com.t.longtv.GlideApp;
import com.t.longtv.R;
import com.t.longtv.bean.EntertainBean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/17 18:05
 * 描述：娱乐适配器
 */
public class EntertainAdapter extends BaseQuickAdapter<EntertainBean.DataXBean.ListBean, BaseViewHolder> {


    public EntertainAdapter(@Nullable List<EntertainBean.DataXBean.ListBean> data) {
        super(R.layout.layout_entertain_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, final EntertainBean.DataXBean.ListBean item) {
        helper.setText(R.id.tv_entertain_name, item.getUsername());
        helper.setText(R.id.tv_entertain_title, item.getChannel());
        helper.setText(R.id.tv_entertain_people, item.getViews());
        GlideApp.with(mContext)
                .load(item.getImg())
                .placeholder(R.mipmap.live_square_loading_bg)
                .error(R.mipmap.live_square_loading_bg)
                .into((ImageView) helper.getView(R.id.img_entertain_container));

        if (item.getIs_live() != 0) {
            helper.getView(R.id.view_entertain_curtain).setAlpha(0);
            helper.getView(R.id.tv_entertain_rest).setVisibility(View.GONE);
        } else {
            helper.getView(R.id.view_entertain_curtain).setAlpha((float) 0.5);
            helper.getView(R.id.tv_entertain_rest).setVisibility(View.VISIBLE);
        }

        if (item.getIs_live() != 0 && item.getLabelArr().getLeft() != null) {
            helper.getView(R.id.img_entertain_show).setVisibility(View.VISIBLE);
            if (item.getLabelArr().getLeft().getType() == 2) {
                GlideApp.with(mContext)
                        .load(item.getLabelArr().getLeft().getShow_img())
                        .into((ImageView) helper.getView(R.id.img_entertain_show));
            }
        /* else  if (item.getLabelArr().getLeft().getType()==1){

            }*/
            else {
                helper.getView(R.id.img_entertain_show).setVisibility(View.GONE);
            }
        } else {
            helper.getView(R.id.img_entertain_show).setVisibility(View.GONE);
        }

        helper.getView(R.id.layout_entertain_container).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(AppConstants.ARouter_Fragment_LiveDetail)
                        .withString("cid",item.getCid()).navigation();
            }
        });
    }
}
