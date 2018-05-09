package com.t.longtv.detail.Traffic;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 作者：龙昊
 * 日期：2018/4/26 22:56
 * 描述：流量Activity
 */

@Route(path = AppConstants.ARouter_Traffic)
public class TrafficActivity extends BaseActivity {

    @BindView(R.id.tv_toolbar_title)
    TextView tvToolbarTitle;
    @BindView(R.id.tb_toolbar_bar)
    Toolbar tbToolbarBar;
    @BindView(R.id.iv_traffic_huomao)
    ImageView ivTrafficHuomao;
    @BindView(R.id.iv_traffic_huomao_active)
    ImageView ivTrafficHuomaoActive;
    @BindView(R.id.iv_traffic_tecent)
    ImageView ivTrafficTecent;
    @BindView(R.id.iv_traffic_tecent_active)
    ImageView ivTrafficTecentActive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);
        ButterKnife.bind(this);

        init();
    }

    private void init() {
        setStatus(Color.WHITE,R.id.layout_traffic_title);
        setToolbar(tbToolbarBar);
        tvToolbarTitle.setText("免流量看直播");
    }

    @OnClick({R.id.iv_traffic_huomao, R.id.iv_traffic_huomao_active, R.id.iv_traffic_tecent, R.id.iv_traffic_tecent_active})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_traffic_huomao:
                break;
            case R.id.iv_traffic_huomao_active:
                break;
            case R.id.iv_traffic_tecent:
                break;
            case R.id.iv_traffic_tecent_active:
                break;
        }
    }
}
