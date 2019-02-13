package com.t.longtv.detail.Mine;

import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.MineModuleBean;
import com.t.longtv.bean.UserInfoBean;
import com.t.longtv.bean.UserLoginBean;
import com.t.longtv.bean.UserinfoAdBean;
import com.t.longtv.dao.dbutils.UserDBUtils;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserverble;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 作者：龙昊
 * 日期：2018/4/24 16:20
 * 描述：
 */
public class MinePresenter extends BasePresenter<MineContract.View> implements MineContract.Presenter {
    public MinePresenter(MineContract.View view) {
        super(view);
    }

    @Override
    public void start() {
        loadAD();
        loadModule();
    }

    @Override
    public void loadModule() {
        ApiObserveble.defaultMethod(
                ApiRetrofit.getInstance().create(ApiService.class)
                        .getMineModule(getModuleMap()))
                .subscribe(new DefaultApiObserverble<MineModuleBean>() {

                    @Override
                    public void onSuccess(MineModuleBean mineModuleBean) {
                        getView().getModuleSuccess(mineModuleBean.getData());
                    }

                    @Override
                    public void onFailed(Throwable e) {
                        getView().getModuleFailed(e.toString());
                    }
                });
    }

    @Override
    public void loadAD() {
        ApiObserveble.defaultMethod(
                ApiRetrofit.getInstance().create(ApiService.class)
                        .getUserAd(getAdMap("")))
                .subscribe(new DefaultApiObserverble<UserinfoAdBean>() {

                    @Override
                    public void onSuccess(UserinfoAdBean userinfoAdBean) {
                        getView().getUserAdSuccess(userinfoAdBean.getData());
                    }

                    @Override
                    public void onFailed(Throwable e) {
                        getView().getUserAdFailed(e.toString());
                    }
                });
    }

    @Override
    public void loadUserInfo() {
        ApiObserveble.defaultMethod(ApiRetrofit.getInstance().create(ApiService.class)
            .getUserInfo(getUserInfoMap(),"android"))
                .subscribe(new DefaultApiObserverble<UserInfoBean>() {
                    @Override
                    public void onSuccess(UserInfoBean userInfoBean) {
                        getView().getUserInfoSuccess(userInfoBean.getData());
                    }

                    @Override
                    public void onFailed(Throwable e) {
                        getView().getUserInfoFailed(e.toString());
                    }
                });
    }

    private Map getAdMap(String uid) {
        //http://api.huomao.com
        // /advert/getUserInfoAd
        // ?refer=android&uid=0
        // &token=8c9847eb1f468e46b7c8e92e33ffdecc
        // &time=25409297&an=68&ver=2.4
        //http://api.huomao.com/advert/getUserInfoAd
        // ?refer=android&uid=
        // &token=40e876eb3f609fabdbc376eaeebb66c1
        // &time=25409331&an=68&ver=2.4
        Map map = new LinkedHashMap(16);
        map.put("refer", "android");
        map.put("uid", "");
        map.put("token", "40e876eb3f609fabdbc376eaeebb66c1");
        map.put("time", "25409331");
        map.put("an", "68");
        map.put("ver", "2.4");
        return map;
    }

    private Map getModuleMap() {

        //http://api.huomao.com
        // /plugs/mobileModule
        // ?refer=android&time=1524558227
        // &token=31f84802edfbc72816ac1c800b3c7915
        // &an=68&ver=2.4
        Map map = new LinkedHashMap(16);
        map.put("refer", "android");
        map.put("token", "31f84802edfbc72816ac1c800b3c7915");
        map.put("time", "1524558227");
        map.put("an", "67");
        map.put("ver", "2.3");
        return map;
    }

    private Map getUserInfoMap() {

        //http://api.huomao.com
        // /User/getUserInfo
        // ?refer=android
        // &access_token=4ea1b2f93b30add74323cb67f8215569
        // &expires_time=1524805222
        // &mp_openid=f7abb25fe88fe5ff2c8d51821534b01c
        // &refer=android&time=1524805221
        // &token=a740b32ab65b21258918e696bc40f3be
        // &uid=13480061&an=68&ver=2.4
        UserLoginBean userLoginBean=UserDBUtils.getInstance().getUserInfo();
        Map map = new LinkedHashMap(16);
        map.put("refer", "android");
        map.put("access_token", "4ea1b2f93b30add74323cb67f8215569");
        map.put("expires_time","1524805222");
        map.put("mp_openid", "f7abb25fe88fe5ff2c8d51821534b01c");
        map.put("time", "1524805221");
        map.put("token", "a740b32ab65b21258918e696bc40f3be");
        map.put("uid",userLoginBean.getUid());
        map.put("an", "68");
        map.put("ver", "2.4");
        return map;
    }
}
