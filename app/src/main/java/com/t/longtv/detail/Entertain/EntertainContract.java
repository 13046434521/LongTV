package com.t.longtv.detail.Entertain;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.BannerBean;
import com.t.longtv.bean.EntertainBean;

/**
 * 作者：龙昊
 * 日期：2018/4/23 11:22
 * 描述：
 */
public class EntertainContract {
    interface View extends BaseViewImpl{
        void getBannerSuccess(BannerBean bannerBean);
        void getBannerFailed(String msg);
        void getDataSuccess(EntertainBean.DataXBean dataXBean);
        void loadDataSuccess(EntertainBean.DataXBean dataXBean);
        void loadDataFailed(String msg);
        void getDataFailed(String msg);

    }

    interface Presenter extends BasePresenterImpl{
        void loadBanner();
        void loadData(int status,int page);
    }
}
