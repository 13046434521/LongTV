package com.t.longtv.detail.Splash;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.HmChannenBean;

/**
 * 作者：龙昊
 * 日期：2018/4/15 11:10
 * 描述：Splash 接口
 */
public class SplashContract {
    interface View extends BaseViewImpl<Presenter>{
        void loadSuccess(HmChannenBean.DataBean dataBean);
        void loadFailed(String msg);
        void finishActivty();
    }

    interface Presenter extends BasePresenterImpl {
        void loadToMain();
        void finishActivity();
    }
}
