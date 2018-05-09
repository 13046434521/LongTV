package com.t.longtv.detail.History;

import com.t.longtv.bean.HistoryBean;
import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/1 13:05
 * 描述：
 */
public class HistoryContract {
    interface View extends BaseViewImpl{
        void loadSuccess(List<HistoryBean.DataBean>beanList);
        void loadFailed(String msg);
    }

    interface Presenter extends BasePresenterImpl{
        void loadData(int page);
    }
}
