package com.t.longtv.detail.LiveDetail;

import com.orhanobut.logger.Logger;
import com.t.longtv.HttpContants;
import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.LiveDetailBean;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserverble;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 作者：龙昊
 * 日期：2018/4/20 11:35
 * 描述：
 */
public class LiveDetailPresenter extends BasePresenter<LiveDetailContract.View> implements LiveDetailContract.Presenter {
    private String cid;

    public LiveDetailPresenter(LiveDetailContract.View view) {
        super(view);
    }

    public LiveDetailPresenter(LiveDetailContract.View view, String cid) {
        super(view);
        this.cid = cid;

        loadData(cid);
    }

    @Override
    public void start() {
    }

    @Override
    public void loadData(String cid) {
        ApiObserveble.defaultMethod(
                ApiRetrofit.getInstance().create(ApiService.class)
                        .getLiveDetail(getMap(cid),"android")
        ).subscribe(new DefaultApiObserverble<LiveDetailBean>() {
            @Override
            public void onSuccess(LiveDetailBean liveDetailBean) {
                getView().loadVideoSuccess(liveDetailBean);
                Logger.json(liveDetailBean.toString());
            }

            @Override
            public void onFailed(Throwable e) {
                getView().loadVideoFailure(e.toString());
            }
        });
    }

    public Map getMap(String cid) {
        //http://api.huomao.com/channels/channelDetail?
        // refer=android&cid=5095&access_token=&expires_time=
        // &mp_openid=0b42720c7aab6f4ca1a0044a696e0a1c&post_data=1
        // &refer=android&time=1524203658&token=9b3656dba0065a23f10037be88c4d918
        // &uid=&now_time=1524203655&an=68&ver=2.4
        Map map = new LinkedHashMap();
        map.put("refer", "android");
        map.put("cid", cid);
        map.put("access_token", "");
        map.put("expires_time", "");
        map.put("mp_openid", HttpContants.getOpenId());
        map.put("post_data", 1);
        map.put("refer", "android");
        map.put("time", HttpContants.getUnixTime());
        map.put("token", HttpContants.getToken());
        map.put("uid", "");
        map.put("now_time", HttpContants.getNowTime());
        map.put("an", "67");
        map.put("ver", "2.3");
        return map;
    }
}
