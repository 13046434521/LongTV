package com.t.longtv.adapter;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.t.longtv.AppConstants;
import com.t.longtv.GlideApp;
import com.t.longtv.R;
import com.t.longtv.bean.MineBean;
import com.t.longtv.event.PageEvent;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/24 02:37
 * 描述：
 */
public class MineAdapter extends BaseQuickAdapter<MineBean,BaseViewHolder> {

    public MineAdapter(int layoutResId, @Nullable List<MineBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, final MineBean item) {
        helper.setText(R.id.tv_mine_item_content,item.getContent());
        if (item.getStatus()==0){
            GlideApp.with(mContext)
                    .load(item.getRes())
                    .centerCrop()
                    .into((ImageView) helper.getView(R.id.img_mine_item_head));

            helper.getView(R.id.layout_mine_item_container).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    jump(item.getContent());
                }
            });
        }
        else{
            if (TextUtils.isEmpty(item.getIcon())){
                GlideApp.with(mContext)
                        .load(item.getRes())
                        .centerInside()
                        .into((ImageView) helper.getView(R.id.img_mine_item_head));
            }
            else {
                GlideApp.with(mContext)
                        .load(item.getIcon())
                        .centerInside()
                        .into((ImageView) helper.getView(R.id.img_mine_item_head));
            }

            helper.getView(R.id.layout_mine_item_container).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    jump(item);
                }
            });
        }
    }

    private void jump(MineBean item){
        switch (item.getId()){
            case "1":
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Fans));
                break;
            case "2":
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Badge));
                break;
            case "3":
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Traffic));
                break;
            case "4":
                break;
            case "5":
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Feedback));
                break;
            case "6":
                break;
            case "7":
                ARouter.getInstance().build(AppConstants.ARouter_Web)
                        .withString("title",item.getContent())
                        .withString("url",item.getUrl()).navigation();
                break;
        }
    }

    private void jump(String content){
        switch (content){
            case "我的订阅":
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Subscribe));
                break;
            case "我看过的":
                ARouter.getInstance().build(AppConstants.ARouter_History).navigation();
                break;
            case "我的任务":
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Task));
                break;
        }
    }
}
