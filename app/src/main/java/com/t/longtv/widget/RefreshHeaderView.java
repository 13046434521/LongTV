package com.t.longtv.widget;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.aspsine.irecyclerview.RefreshTrigger;
import com.t.longtv.R;

/**
 * 作者：龙昊
 * 日期：2018/4/17 18:49
 * 描述：IRecyclerView刷新Header
 */
public class RefreshHeaderView extends FrameLayout implements RefreshTrigger {
    ImageView imgRefresh;
    TextView tvRefresh;
    private int mHeight;
    private AnimationDrawable drawable;

    public RefreshHeaderView(Context context) {
        this(context, null);
    }

    public RefreshHeaderView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RefreshHeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.layout_irecyclerview_refresh_header_view, this);
        imgRefresh=findViewById(R.id.img_refresh);
        tvRefresh=findViewById(R.id.tv_refresh);
        drawable = (AnimationDrawable) imgRefresh.getBackground();
    }

    @Override
    public void onStart(boolean automatic, int headerHeight, int finalHeight) {
        mHeight = headerHeight;
        if (!drawable.isRunning()){
            drawable.start();
        }
        tvRefresh.setText("下拉刷新");
    }

    @Override
    public void onMove(boolean finished, boolean automatic, int moved) {
        if (moved <= this.mHeight) {
            tvRefresh.setText("下拉刷新");
        }
        else{
            tvRefresh.setText("释放立即刷新");
        }
    }

    @Override
    public void onRefresh() {
        tvRefresh.setText("正在刷新...");
    }

    @Override
    public void onRelease() {
    }

    @Override
    public void onComplete() {
        tvRefresh.setText("刷新完成...");
        drawable.stop();
    }

    @Override
    public void onReset() {
    }
}