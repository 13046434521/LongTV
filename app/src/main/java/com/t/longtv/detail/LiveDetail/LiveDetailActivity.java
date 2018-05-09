package com.t.longtv.detail.LiveDetail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.bean.LiveDetailBean;
import com.t.longtv.utils.AppUtils;

import butterknife.ButterKnife;

/**
 * 直播详情
 */
@Route(path = AppConstants.ARouter_Fragment_LiveDetail)
public class LiveDetailActivity extends AppCompatActivity implements LiveDetailContract.View {
    @Autowired
    String cid;

    private LiveDetailPresenter detailPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_detail);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        init();
    }

    ///////////////////////////////////////////////////////////////////////////
    // 接口方法
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public void loadVideoSuccess(LiveDetailBean detailBean) {
    }

    @Override
    public void loadVideoFailure(String msg) {
        AppUtils.Toast(this, msg);
    }

    @Override
    public void loadAudio(LiveDetailBean detailBean) {

    }

    ///////////////////////////////////////////////////////////////////////////
    // 私有方法
    ///////////////////////////////////////////////////////////////////////////
    private void init() {
        detailPresenter = new LiveDetailPresenter(this, cid);
    }
}
