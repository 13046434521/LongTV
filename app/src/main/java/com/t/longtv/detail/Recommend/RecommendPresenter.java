package com.t.longtv.detail.Recommend;

import com.t.longtv.AppConstants;
import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.BannerBean;
import com.t.longtv.bean.RecommendBean;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserverble;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 作者：龙昊
 * 日期：2018/4/21 15:48
 * 描述：推荐P层
 */
public class RecommendPresenter extends BasePresenter<RecommendContract.View> implements RecommendContract.Presenter {
    public RecommendPresenter(RecommendContract.View view) {
        super(view);
    }

    @Override
    public void loadBanner() {
        ApiObserveble.defaultMethod(
                ApiRetrofit.getInstance()
                        .create(ApiService.class)
                        .getRecommendBanner(getBannerMap(), "android")
        ).subscribe(new DefaultApiObserverble<BannerBean>() {

            @Override
            public void onSuccess(BannerBean bannerBean) {
                getView().getBannerSuccess(bannerBean);
            }

            @Override
            public void onFailed(Throwable e) {

            }
        });
    }

    @Override
    public void loadGame() {

    }

    @Override
    public void loadData() {
        ApiObserveble.defaultMethod(
                ApiRetrofit.getInstance().create(ApiService.class)
                        .getRecommend(getMap(), "android")
        ).subscribe(new DefaultApiObserverble<RecommendBean>() {
            @Override
            public void onSuccess(RecommendBean bean) {
                getView().getDataSuccess(bean.getData());
            }

            @Override
            public void onFailed(Throwable e) {
                getView().getDataFailed(e.toString());
            }
        });
    }

    @Override
    public void start() {

    }

    private Map getBannerMap() {
        Map map = new LinkedHashMap();
/*        GET http://api.huomao.com/channels/getBanner.json?
        // refer=android&refer=android&time=1524296468&
        // token=d1f6b58cd60aaf866e44a13d7967166a&an=67&ver=2.3*/
        map.put("refer", "android");
        map.put("token", "d1f6b58cd60aaf866e44a13d7967166a");
        map.put("time", "1524296468");
        map.put("an", AppConstants.AN);
        map.put("ver", AppConstants.VER);
        return map;
    }

    private Map getMap() {
        //http://api.huomao.com/indexchannel/indexChannelRec
        // ?refer=android&refer=android&time=1524384519
        // &token=a9aea3a14d200061eefa77587d85a067
        // &an=67&ver=2.3
        Map map = new LinkedHashMap();
        map.put("refer", "android");
        map.put("token", "a9aea3a14d200061eefa77587d85a067");
        map.put("time", "1524384519");
        map.put("an", AppConstants.AN);
        map.put("ver", AppConstants.VER);
        return map;
    }
}
