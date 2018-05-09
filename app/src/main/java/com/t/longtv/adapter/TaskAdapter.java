package com.t.longtv.adapter;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.t.longtv.AppAplication;
import com.t.longtv.GlideApp;
import com.t.longtv.R;
import com.t.longtv.bean.TaskBean;
import com.t.longtv.utils.AppUtils;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/3 15:32
 * 描述：
 */
public class TaskAdapter extends BaseQuickAdapter<TaskBean.DataBean,BaseViewHolder> {
    public TaskAdapter(@Nullable List<TaskBean.DataBean> data) {
        super(R.layout.layout_task_item,data);
    }

    @Override
    protected void convert(BaseViewHolder helper, final TaskBean.DataBean item) {
        helper.setText(R.id.tv_task_content,item.getName());
        GlideApp.with(AppAplication.getAppAplication())
                .load(item.getIcon())
                .centerInside()
                .into((ImageView) helper.getView(R.id.iv_task_head));
        if (item.getComplete_stat().equals("yes")){
            int res=R.mipmap.get_task_checked;
            if (item.getName().equals("每日签到")){
                res=R.mipmap.get_task_sign;
            }
            GlideApp.with(AppAplication.getAppAplication())
                    .load(res)
                    .centerInside()
                    .into((ImageView) helper.getView(R.id.iv_task_domain));
        }


        helper.getView(R.id.layout_task_container).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(item.getDescription())){
                    AppUtils.Toast(item.getDescription());
                }
            }
        });
    }
}
