package com.t.longtv.detail.Live;

import android.support.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.t.longtv.AppConstants;
import com.t.longtv.HttpContants;
import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.LiveBean;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserverble;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 作者：龙昊
 * 日期：2018/4/17 18:11
 * 描述：
 */
public class LivePresenter extends BasePresenter<LiveContract.View> implements LiveContract.Presenter {
    public LivePresenter(LiveContract.View view) {
        super(view);
    }

    public LivePresenter(LiveContract.View view, String gid) {
        super(view);
        loadData(1, gid, 1);
    }

    @Override
    public void loadData(final int status, String gid, int page) {
        Map map = getMap(gid, page + "");
        ApiObserveble.defaultMethod(ApiRetrofit.getInstance().create(ApiService.class)
                .getLive(map)).subscribe(new DefaultApiObserverble<LiveBean>() {
            @Override
            public void onSuccess(LiveBean liveBean) {
                if (status == AppConstants.REFRESH) {
                    getView().getDataSuccess(liveBean.getData());
                } else if (status == AppConstants.LOADMORE) {
                    getView().loadMoreDataSuccess(liveBean.getData());
                }
            }

            @Override
            public void onFailed(Throwable e) {
                if (status == AppConstants.REFRESH) {
                    getView().getDataFailed(e.toString());
                } else if (status == AppConstants.LOADMORE) {
                    getView().loadMoreDataFailed(e.toString());
                }
            }
        });

    }

    @Override
    public void loadMoreData(String gid, int page) {
    }

    @Override
    public void jumpDetail(@NonNull String cid) {
        ARouter.getInstance().build(AppConstants.ARouter_Fragment_LiveDetail).withString("cid",cid).navigation();
    }

    @Override
    public void start() {
    }

    public Map getMap(String gid, String page) {
        //http://api.huomao.com/channels/channelpage.json?
        // refer=android&gid=0&page=1
        // &refer=android&time=1523961028
        // &token=5a0f878761c3f7ebe6b94e78d12c46ed&an=67&ver=2.3
        Map map = new LinkedHashMap(16);
        map.put("refer", "android");
        map.put("gid", gid);
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
