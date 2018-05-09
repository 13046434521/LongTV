package com.t.longtv.detail.Live;

import android.support.annotation.NonNull;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.LiveBean;

/**
 * 作者：龙昊
 * 日期：2018/4/17 18:09
 * 描述：
 */
public class LiveContract  {
    interface View extends BaseViewImpl{
        void getDataSuccess(LiveBean.DataBean dataBean);
        void getDataFailed(String msg);
        void loadMoreDataSuccess(LiveBean.DataBean dataBean);
        void loadMoreDataFailed(String msg);
    }

    interface Presenter extends BasePresenterImpl{
        void loadData(int status,String gid,int  page);
        void loadMoreData(String gid,int  page);

        void jumpDetail(@NonNull String cid);
    }
}
