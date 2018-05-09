package com.t.longtv.detail.Park;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.ParkBean;

/**
 * 作者：龙昊
 * 日期：2018/4/16 17:26
 * 描述：
 */
public class ParkContract {
    interface View extends BaseViewImpl{
       void getSuccessData(ParkBean.DataBean dataBean);
       void getFailedData(String msg);
    }

    interface Presenter extends BasePresenterImpl{
        void loadData();
    }
}
