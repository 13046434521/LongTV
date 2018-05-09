package com.t.longtv.detail.History;

import com.google.gson.internal.LinkedTreeMap;
import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.HistoryBean;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserveble;

import java.util.Map;

/**
 * 作者：龙昊
 * 日期：2018/5/1 12:44
 * 描述：历史Bean
 */
public class HistoryPresenter extends BasePresenter<HistoryContract.View> implements HistoryContract.Presenter{


    public HistoryPresenter(HistoryContract.View view) {
        super(view);
    }

    @Override
    public void loadData(int page) {
        ApiObserveble.defaultMethed(
                ApiRetrofit.getInstance().create(ApiService.class)
                .getHistory(getMap(String.valueOf(page)),"android")
        ).subscribe(new DefaultApiObserveble<HistoryBean>() {
            @Override
            public void onSuccess(HistoryBean historyBean) {
                getView().loadSuccess(historyBean.getData());
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

    private Map getMap(String page){
       // http://api.huomao.com/
        // User/getRecentWatch
        // ?refer=android
        // &access_token=4ea1b2f93b30add74323cb67f8215569&
        // expires_time=1524805222
        // &mp_openid=d0c896fd7f5a5de9de784920675d6081
        // &page=1&refer=android&time=1525174745
        // &token=4a1ffabb6c072b95dc4825b07733fee4&uid=13480061&an=68&ver=2.4
        Map map= new LinkedTreeMap();
        map.put("refer","android");
        map.put("access_token","4ea1b2f93b30add74323cb67f8215569");
        map.put("expires_time","1524805222");
        map.put("mp_openid","d0c896fd7f5a5de9de784920675d6081");
        map.put("page",page);
        map.put("refer","android");
        map.put("time","1525174745");
        map.put("token","4a1ffabb6c072b95dc4825b07733fee4");
        map.put("uid", "13480061");
        map.put("an","68");
        map.put("ver","2.4");
        return map;
    }
}
