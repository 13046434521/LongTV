package com.t.longtv.detail.Home;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.HMTitleBean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/15 15:39
 * 描述：
 */
public class HomeContract {
    interface View extends BaseViewImpl {
        void notifyData();
    }

    interface Presenter extends BasePresenterImpl {
        List<HMTitleBean> loadTitle();
        List<String> loadLiveTitle();
        String getGid(String title);

        void getSearch();

        void getHistory();
    }
}
