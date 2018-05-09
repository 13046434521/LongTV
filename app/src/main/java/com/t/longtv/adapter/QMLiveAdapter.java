package com.t.longtv.adapter;

import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.t.longtv.AppAplication;
import com.t.longtv.AppConstants;
import com.t.longtv.GlideApp;
import com.t.longtv.R;
import com.t.longtv.bean.QmLiveBean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/6 01:12
 * 描述：
 */
public class QMLiveAdapter extends BaseQuickAdapter<QmLiveBean.DataBeanX,BaseViewHolder> {
    AnimationDrawable animationDrawable;
    public QMLiveAdapter(@Nullable List<QmLiveBean.DataBeanX> data) {
        super(R.layout.layout_qmlive_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, final QmLiveBean.DataBeanX item) {
        helper.setText(R.id.tv_qmlive_name,item.getNick());
        helper.setText(R.id.tv_qmlive_title,item.getTitle());
        if (item.getView()>9999){
            helper.setText(R.id.tv_qmlive_people,item.getView()/10000+"万");
        }
        else{
            helper.setText(R.id.tv_qmlive_people,String.valueOf(item.getView()));
        }

        GlideApp.with(AppAplication.getAppAplication())
                .load(item.getLive_thumb())
                .placeholder(R.mipmap.quianmin_live_default)
                .error(R.mipmap.quianmin_live_default)
                .into((ImageView) helper.getView(R.id.iv_qmlive_content));

        animationDrawable= (AnimationDrawable) helper.getView(R.id.iv_qmlive_people).getBackground();
        if (!animationDrawable.isRunning()){
            animationDrawable.start();
        }

        helper.getView(R.id.layout_qmlive_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(AppConstants.ARouter_Fragment_QMLiveDetail)
                        .withString("uid",item.getUid())
                        .withString("stream",item.getStream()).navigation();
            }
        });

    }
}
