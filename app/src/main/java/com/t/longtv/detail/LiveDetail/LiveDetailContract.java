package com.t.longtv.detail.LiveDetail;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.LiveDetailBean;

/**
 * 作者：龙昊
 * 日期：2018/4/20 11:35
 * 描述：
 */
public class LiveDetailContract {
    interface View extends BaseViewImpl{
        void loadVideoSuccess(LiveDetailBean detailBean);
        void loadVideoFailure(String msg);
        void loadAudio(LiveDetailBean detailBean);
    }

    interface Presenter extends BasePresenterImpl{
        void loadData(String cid);
    }
}
