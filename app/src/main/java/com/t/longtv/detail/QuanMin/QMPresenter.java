package com.t.longtv.detail.QuanMin;

import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.QmLiveBean;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiQmRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserverble;

/**
 * 作者：龙昊
 * 日期：2018/5/6 00:56
 * 描述：
 */
public class QMPresenter extends BasePresenter<QMContarct.View> implements QMContarct.Presenter {
    public QMPresenter(QMContarct.View view) {
        super(view);
    }

    @Override
    public void loadData() {
        ApiObserveble.defaultMethod(
                ApiQmRetrofit.getInstance()
                        .create(ApiService.class).getQMLiveAll()).subscribe(new DefaultApiObserverble<QmLiveBean>() {
            @Override
            public void onSuccess(QmLiveBean qmLiveBean) {
                getView().loadSuccess(qmLiveBean.getData());
            }

            @Override
            public void onFailed(Throwable e) {
                getView().loadFailed(e.toString());
            }
        });
    }

    @Override
    public void start() {

    }
}
