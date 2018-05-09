package com.t.longtv.detail.Splash;

import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.internal.LinkedTreeMap;
import com.t.longtv.AppConstants;
import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.HmChannenBean;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserveble;

import java.util.Map;

/**
 * 作者：龙昊
 * 日期：2018/4/15 11:12
 * 描述：
 */
public class SplashPresenter extends BasePresenter<SplashContract.View> implements SplashContract.Presenter {
    public SplashPresenter(SplashContract.View view) {
        super(view);
    }

    @Override
    public void loadToMain() {
        ApiObserveble.defaultMethed(
                ApiRetrofit.getInstance().create(ApiService.class)
                        .getHmChannel(getMap())
        ).subscribe(new DefaultApiObserveble<HmChannenBean>() {

            @Override
            public void onSuccess(HmChannenBean hmChannenBean) {
                getView().loadSuccess(hmChannenBean.getData());
            }

            @Override
            public void onFailed(Throwable e) {
                getView().loadFailed(e.toString());
            }
        });
    }

    @Override
    public void finishActivity() {
        ARouter.getInstance().build(AppConstants.ARouter_Home).navigation();
        getView().finishActivty();
    }

    @Override
    public void start() {
        loadToMain();
    }


    private Map getMap() {
        //http://api.huomao.com
        // /User/get_games
        // ?access_token=e3a674bc14f57a7c569f5e1003b748e5
        // &expires_time=1525330915&mp_openid=1631f8885802b473281a111dc58957ba
        // &refer=android&time=1525751631
        // &token=db8bfe1a6f1c8f8ce95795ab45805eb0&uid=13480061&an=69&ver=2.5

        Map map = new LinkedTreeMap();
        map.put("access_token", "e3a674bc14f57a7c569f5e1003b748e5");
        map.put("expires_time", "1525330915");
        map.put("mp_openid", "1631f8885802b473281a111dc58957ba");
        map.put("refer", "android");
        map.put("time", "1525751631");
        map.put("token", "db8bfe1a6f1c8f8ce95795ab45805eb0");
        map.put("uid", "13480061");
        map.put("an", "69");
        map.put("ver", "2.5");
        return map;
    }
}
