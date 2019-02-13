package com.t.longtv.detail.Entertain;

import com.t.longtv.AppConstants;
import com.t.longtv.HttpContants;
import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.BannerBean;
import com.t.longtv.bean.EntertainBean;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserverble;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 作者：龙昊
 * 日期：2018/4/23 11:24
 * 描述：
 */
public class EntertainPresenter extends BasePresenter<EntertainContract.View> implements EntertainContract.Presenter {
    public EntertainPresenter(EntertainContract.View view) {
        super(view);
    }

    @Override
    public void start() {
        loadBanner();
        loadData(AppConstants.REFRESH, 1);
    }

    @Override
    public void loadBanner() {
        ApiObserveble.defaultMethod(ApiRetrofit.getInstance().create(ApiService.class)
                .getRecommendBanner(getBannerMap(), "android"))
                .subscribe(new DefaultApiObserverble<BannerBean>() {
                    @Override
                    public void onSuccess(BannerBean bannerBean) {
                        getView().getBannerSuccess(bannerBean);
                    }

                    @Override
                    public void onFailed(Throwable e) {
                        getView().getBannerFailed(e.toString());
                    }
                });
    }

    @Override
    public void loadData(final int status, int page) {
        Map map = getMap(page + "");
        ApiObserveble.defaultMethod(ApiRetrofit.getInstance().create(ApiService.class)
                .getEntertain(map)).subscribe(new DefaultApiObserverble<EntertainBean>() {
            @Override
            public void onSuccess(EntertainBean entertainBean) {
                if (status == AppConstants.REFRESH) {
                    getView().getDataSuccess(entertainBean.getData());
                } else if (status == AppConstants.LOADMORE) {
                    getView().loadDataSuccess(entertainBean.getData());
                }
            }

            @Override
            public void onFailed(Throwable e) {
                if (status == AppConstants.REFRESH) {
                    getView().getDataFailed(e.toString());
                } else if (status == AppConstants.LOADMORE) {
                    getView().loadDataFailed(e.toString());
                }
            }
        });

    }

    private Map getBannerMap() {
        //GET http://api.huomao.com
        // /Entertainment/getBanner?
        // refer=android&refer=android
        // &time=1524459359
        // &token=52ae792c49a4fe88438110909553b0ab
        // &an=68&ver=2.4
        Map map = new LinkedHashMap(16);
        map.put("refer", "android");
        map.put("time", "1524460038");
        map.put("token", "6f0397c38232cc8049f781c97aec4ba3");
/*        map.put("time", "1523961028");
        map.put("token", AppConstants.TOKEN);*/
        map.put("an", "67");
        map.put("ver", "2.3");
        return map;
    }

    private Map getMap(String page) {
        //http://api.huomao.com/channels/channelpage.json
        // ?refer=android&gid=32&page=1
        // &token=788da601a7b908014dbd34195410a516
        // &time=1524453393
        // &an=68&ver=2.4
        Map map = new LinkedHashMap(16);
        map.put("refer", "android");
        map.put("gid", "32");
        map.put("page", page);
        map.put("refer", "android");
        map.put("time", HttpContants.getUnixTime());
        map.put("token", HttpContants.getToken());
/*        map.put("time", "1523961028");
        map.put("token", AppConstants.TOKEN);*/
        map.put("an", "67");
        map.put("ver", "2.3");
        return map;
    }
}
