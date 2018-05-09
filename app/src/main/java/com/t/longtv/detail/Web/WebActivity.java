package com.t.longtv.detail.Web;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.base.BaseActivity;
import com.t.longtv.utils.StatusUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

@Route(path = AppConstants.ARouter_Web)
public class WebActivity extends BaseActivity {
    @Autowired
    String title;
    @Autowired
    String url;
    @BindView(R.id.tv_toolbar_title)
    TextView tvTitle;
    @BindView(R.id.tb_toolbar_bar)
    Toolbar tbBar;
    @BindView(R.id.fl_web_container)
    FrameLayout flContainer;
    private FragmentTransaction transaction;
    private FragmentManager fragmentManager;
    private WebFragment webFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        StatusUtils.setStatus(this, Color.WHITE);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        init();
    }

    private void init() {
        setStatus(Color.WHITE,R.id.layout_web_title);
        setToolbar(tbBar);
        tvTitle.setText(title);

        fragmentManager=getSupportFragmentManager();
        transaction=fragmentManager.beginTransaction();

        transaction.add(R.id.fl_web_container,getWebFragment()).commit();
    }

    ///////////////////////////////////////////////////////////////////////////
    // 私有方法
    ///////////////////////////////////////////////////////////////////////////
    private WebFragment getWebFragment() {
        if (webFragment == null) {
            webFragment = (WebFragment) ARouter.getInstance().build(AppConstants.ARouter_Fragment_Web).withString("url",url).navigation();
        }
        return webFragment;
    }
}
