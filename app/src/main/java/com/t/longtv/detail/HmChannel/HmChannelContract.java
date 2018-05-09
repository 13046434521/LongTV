package com.t.longtv.detail.HmChannel;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.HmChannenBean;

/**
 * 作者：龙昊
 * 日期：2018/5/8 12:52
 * 描述：
 */
public class HmChannelContract {
    interface View extends BaseViewImpl{
        void loadSuccess(HmChannenBean.DataBean dataBean);
        void loadFailed(String msg);
        void alterSuccess();
        void alterFailed();
    }

    interface Presenter extends BasePresenterImpl{
        void loadData();
        void alterChannel();
    }
}
