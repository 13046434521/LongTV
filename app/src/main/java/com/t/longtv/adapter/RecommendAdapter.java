package com.t.longtv.adapter;

import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.t.longtv.AppConstants;
import com.t.longtv.GlideApp;
import com.t.longtv.R;
import com.t.longtv.Tags;
import com.t.longtv.bean.RecommendBean;
import com.t.longtv.event.HomeEvent;
import com.t.longtv.utils.AppUtils;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/23 10:03
 * 描述：
 */
public class RecommendAdapter extends BaseQuickAdapter<RecommendBean.DataBeanX, BaseViewHolder> {
    public RecommendAdapter(@Nullable List<RecommendBean.DataBeanX> data) {
        super(R.layout.layout_recommend_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, final RecommendBean.DataBeanX item) {

        helper.setText(R.id.tv_recommend_item_title,item.getName());

        GlideApp.with(mContext)
                .load(item.getIcon())
                .placeholder(R.mipmap.ic_focus_hot)
                .error(R.mipmap.ic_focus_hot)
                .centerCrop()
                .into((ImageView) helper.getView(R.id.img_recommend_item_title));

        RecyclerView recyclerView=helper.getView(R.id.rv_recommend_item_container);
        recyclerView.setLayoutManager(new GridLayoutManager(mContext,2));

        if (item.getName().equals("娱乐星秀")){
            recyclerView.setAdapter(new RecommendItemAdapter(R.layout.layout_live_entertain_item,item.getData()));
        }
        else{
            recyclerView.setAdapter(new RecommendItemAdapter(R.layout.layout_live_item,item.getData()));
        }

        helper.getView(R.id.tv_recommend_item_more).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (item.getName().equals("热门直播")){
                    EventBus.getDefault().post(new HomeEvent(Tags.HM_LIVE));
                }
                else{
                    ARouter.getInstance().build(AppConstants.ARouter_Live).withString("gid", AppUtils.getGid(item.getName())).withString("title",item.getName()).navigation();
                }
            }
        });
    }
}
