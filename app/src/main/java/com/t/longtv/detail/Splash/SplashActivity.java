package com.t.longtv.detail.Splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.t.longtv.R;
import com.t.longtv.bean.HMTitleBean;
import com.t.longtv.bean.HmChannenBean;
import com.t.longtv.dao.dbutils.HmDBUtils;

public class SplashActivity extends AppCompatActivity  implements SplashContract.View{
    private SplashPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        presenter=new SplashPresenter(this);
    }

    @Override
    public void loadSuccess(HmChannenBean.DataBean dataBean) {
        HmDBUtils.getInstance().deleteAll();
        for (int i=0;i<dataBean.getIsSub().size();i++){
            HmChannenBean.DataBean.SubBean subBean =dataBean.getIsSub().get(i);
            HmDBUtils.getInstance().insert(new HMTitleBean(subBean));
        }

        presenter.finishActivity();
    }

    @Override
    public void loadFailed(String msg) {

    }

    @Override
    public void finishActivty() {
        finish();
    }
}
