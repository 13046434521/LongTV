package com.t.longtv.detail.Login;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.UserLoginBean;

/**
 * 作者：龙昊
 * 日期：2018/4/27 12:23
 * 描述：
 */
public class LoginContract {
    interface View extends BaseViewImpl{
        void loadSuccess(UserLoginBean userLoginBean);
        void loadFailed(String msg);
    }

    interface Presenter extends BasePresenterImpl{
        void loadData(String user,String password);
    }
}
