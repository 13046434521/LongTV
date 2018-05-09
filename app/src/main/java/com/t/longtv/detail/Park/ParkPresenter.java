package com.t.longtv.detail.Park;

import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.ParkBean;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserveble;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 作者：龙昊
 * 日期：2018/4/16 17:27
 * 描述：
 */
public class ParkPresenter extends BasePresenter <ParkContract.View>implements ParkContract.Presenter{
    public ParkPresenter(ParkContract.View view) {
        super(view);
    }

    @Override
    public void loadData() {
        ApiObserveble.defaultMethed(
                ApiRetrofit.getInstance()
                .create(ApiService.class)
                .getPark(getMap())
        ).subscribe(new DefaultApiObserveble< ParkBean>() {
            @Override
            public void onSuccess(ParkBean parkBean) {
                if (parkBean.getData()!=null){
                    getView().getSuccessData(parkBean.getData().get(0));
                }
                else{
                    getView().getFailedData(parkBean.getMessage());
                }
            }

            @Override
            public void onFailed(Throwable e) {
                getView().getFailedData(e.toString());
            }
        });
    }

    @Override
    public void start() {
        loadData();
    }

    public Map getMap(){
        Map map=new LinkedHashMap(16);
        map.put("tabid","4");
        map.put("access_token","");
        map.put("expires_time","");
        map.put("token", "2e008ae3c81c1195b539e1369330f7c0");
        map.put("time", "1524398613");
        map.put("refer","android");
        map.put("an","67");
        map.put("ver","2.3");
        return map;
    }
}
