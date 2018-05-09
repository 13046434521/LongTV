package com.t.longtv.detail.Recommend;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.BannerBean;
import com.t.longtv.bean.RecommendBean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/21 15:46
 * 描述：推荐接口类
 */
public class RecommendContract {
    interface View extends BaseViewImpl{
        void getBannerSuccess(BannerBean bannerBean);
        void getBannerFailed(String msg);
        void getDataSuccess(List<RecommendBean.DataBeanX> data);
        void getDataFailed(String msg);
    }

    interface Presenter extends BasePresenterImpl{
        void loadBanner();
        void loadGame();
        void loadData();
    }
}
