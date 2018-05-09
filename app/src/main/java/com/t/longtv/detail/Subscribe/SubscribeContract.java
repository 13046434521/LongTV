package com.t.longtv.detail.Subscribe;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.SubscribeBean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/30 20:55
 * 描述：
 */
public class SubscribeContract {
    interface View extends BaseViewImpl{
        void getSubscribeSuccess(List<SubscribeBean.DataBean> list);
        void getSubscribeFailed(String msg);
    }

    interface Presenter extends BasePresenterImpl{
        void loadSubscribe(int page);
    }
}
