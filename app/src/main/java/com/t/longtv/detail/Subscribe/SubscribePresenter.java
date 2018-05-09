package com.t.longtv.detail.Subscribe;

import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.SubscribeBean;
import com.t.longtv.dao.dbutils.UserDBUtils;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserveble;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 作者：龙昊
 * 日期：2018/4/30 20:48
 * 描述：P层
 */
public class SubscribePresenter extends BasePresenter<SubscribeContract.View> implements SubscribeContract.Presenter {

    public SubscribePresenter(SubscribeContract.View view) {
        super(view);
    }

    @Override
    public void loadSubscribe(int page) {
        ApiObserveble.defaultMethed(ApiRetrofit.getInstance().create(ApiService.class)
                .getSubscribe(getMap(String.valueOf(page)),"android"))
                .subscribe(new DefaultApiObserveble<SubscribeBean>() {
                    @Override
                    public void onSuccess(SubscribeBean bean) {
                        getView().getSubscribeSuccess(bean.getData());
                    }

                    @Override
                    public void onFailed(Throwable e) {
                        getView().getSubscribeFailed(e.toString());
                    }
                });
    }

    @Override
    public void start() {

    }


    private Map getMap(String page){
        //http://api.huomao.com
        // /User/getUsersSubscribe
        // ?refer=android&access_token=4ea1b2f93b30add74323cb67f8215569
        // &expires_time=1524805222&mp_openid=c80bd213a7356f7e2650d9b61a88b09c
        // &page=1&time=1525092255
        // &token=256a979344b263a1da1cfee3b0e5f51f
        // &uid=13480061&an=68&ver=2.4
        Map map=new LinkedHashMap(16);
        map.put("refer","android");
        map.put("access_token","4ea1b2f93b30add74323cb67f8215569");
        map.put("expires_time","1524805222");
        map.put("mp_openid","c80bd213a7356f7e2650d9b61a88b09c");
        map.put("page",page);
        map.put("time","1525092255");
        map.put("token","256a979344b263a1da1cfee3b0e5f51f");
        map.put("uid", UserDBUtils.getInstance().getUserInfo().getUid());
        map.put("an","68");
        map.put("ver","2.4");

        return map;
    }
}
