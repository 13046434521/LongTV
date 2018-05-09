package com.t.longtv.detail.Main;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;

/**
 * 作者：龙昊
 * 日期：2018/4/15 10:51
 * 描述：Home 接口
 */
public class HomeContract {
    interface View extends BaseViewImpl{
        void replaceFragment(String tag);
    }

    interface Presenter extends BasePresenterImpl{
        void selectFragment(int position);
    }
}
