package com.t.longtv.detail.Detail;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.base.BaseActivity;
import com.t.longtv.detail.Live.LiveFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

@Route(path = AppConstants.ARouter_Live)
public class DetailActivity extends BaseActivity {
    @Autowired
    String title;
    @Autowired
    String gid;
    @BindView(R.id.tv_toolbar_title)
    TextView tvTitle;
    @BindView(R.id.tb_toolbar_bar)
    Toolbar tbToolbar;
    private LiveFragment liveFragment;
    private FragmentTransaction transaction;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);

        init();
    }

    ///////////////////////////////////////////////////////////////////////////
    // 私有方法
    ///////////////////////////////////////////////////////////////////////////
    private void init() {
        setStatus(Color.WHITE,R.id.layout_detail_title);
        setToolbar(tbToolbar);

        tvTitle.setText(title);
        tvTitle .setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

        fragmentManager=getSupportFragmentManager();
        transaction=fragmentManager.beginTransaction();

        transaction.add(R.id.layout_detail_container,getLiveFragment()).commit();
    }

    public LiveFragment getLiveFragment(){
        if (liveFragment==null){
            liveFragment= (LiveFragment) ARouter.getInstance().build(AppConstants.ARouter_Fragment_Live).withString("gid",gid).navigation();
        }
        return liveFragment;
    }
}
