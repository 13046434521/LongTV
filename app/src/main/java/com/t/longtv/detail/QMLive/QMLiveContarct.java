package com.t.longtv.detail.QMLive;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.QmLiveBean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/6 00:37
 * 描述：
 */
public class QMLiveContarct {
    interface View extends BaseViewImpl{
        void loadSuccess(List<QmLiveBean.DataBeanX> dataBeanXList);
        void loadFailed(String msg);
    }

    interface Presenter extends BasePresenterImpl{
        void loadData(String title);
    }
}
