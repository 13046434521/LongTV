package com.t.longtv.detail.Task;

import com.t.longtv.base.BasePresenterImpl;
import com.t.longtv.base.BaseViewImpl;
import com.t.longtv.bean.TaskBean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/3 15:08
 * 描述：
 */
public class TaskContract {
    interface View extends BaseViewImpl{
        void loadDataSuccess(List<TaskBean.DataBean>dataBeans);
        void loadDataFailed(String msg);
    }

    interface Presenter extends BasePresenterImpl{
        void loadData();
        void commitData();
    }
}
