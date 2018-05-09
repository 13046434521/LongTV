package com.t.longtv.detail.Mine;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.MineModuleBean;
import com.t.longtv.bean.UserInfoBean;
import com.t.longtv.bean.UserinfoAdBean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/24 16:12
 * 描述：
 */
public class MineContract {
    interface View extends BaseViewImpl{
        void getModuleSuccess(List<MineModuleBean.DataBean> dataBeans);
        void getModuleFailed(String msg);
        void getUserAdSuccess(UserinfoAdBean.DataBean dataBeans);
        void getUserAdFailed(String msg);
        void getUserInfoSuccess(UserInfoBean.DataBean userInfoBean);
        void getUserInfoFailed(String msg);
    }

    interface Presenter extends BasePresenterImpl{
        void loadModule();
        void loadAD();
        void loadUserInfo();
    }
}
