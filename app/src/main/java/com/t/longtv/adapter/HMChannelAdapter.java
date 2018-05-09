package com.t.longtv.adapter;

import android.support.annotation.Nullable;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.t.longtv.AppAplication;
import com.t.longtv.AppConstants;
import com.t.longtv.GlideApp;
import com.t.longtv.R;
import com.t.longtv.bean.HmChannenBean;
import com.t.longtv.dao.dbutils.HmDBUtils;
import com.t.longtv.utils.DefaultItemTouchHelpCallback;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/8 12:39
 * 描述：
 */
public class HMChannelAdapter extends BaseQuickAdapter<HmChannenBean.DataBean.SubBean, BaseViewHolder> implements DefaultItemTouchHelpCallback.ItemTouchHelperAdapter {
    private List<HmChannenBean.DataBean.SubBean> mItems = new ArrayList<>();
    private DefaultItemTouchHelpCallback.OnStartDragListener mDragStartListener;
    private String status;
    public HMChannelAdapter(String status,@Nullable List<HmChannenBean.DataBean.SubBean> data, DefaultItemTouchHelpCallback.OnStartDragListener dragStartListener) {
        super(R.layout.layout_hm_channel_item, data);
        mDragStartListener = dragStartListener;
        this.status=status;
    }

    @Override
    protected void convert(final BaseViewHolder helper, final HmChannenBean.DataBean.SubBean item) {
        GlideApp.with(AppAplication.getAppAplication())
                .load(item.getImages())
                .into((ImageView) helper.getView(R.id.riv_hm_channel_item));

        helper.getView(R.id.riv_hm_channel_item).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (MotionEventCompat.getActionMasked(event) == MotionEvent.ACTION_DOWN) {
                    mDragStartListener.onStartDrag(helper);
                }
                return false;
            }
        });

        helper.getView(R.id.riv_hm_channel_item).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status.equals("ALL")){
                    ARouter.getInstance().build(AppConstants.ARouter_Live).withString("title",item.getCname())
                            .withString("gid",item.getGid()).navigation();
                }
            }
        });
    }

    @Override
    public void setNewData(@Nullable List<HmChannenBean.DataBean.SubBean> data) {
        super.setNewData(data);
        mItems=data;
    }

    @Override
    public void onItemDismiss(int position) {
        mItems.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        Collections.swap(mItems, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
        try {
            HmDBUtils.getInstance().MoveData(fromPosition,toPosition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
