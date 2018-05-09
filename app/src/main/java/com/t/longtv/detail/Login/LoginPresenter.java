package com.t.longtv.detail.Login;

import android.text.TextUtils;

import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.UserLoginBean;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserveble;
import com.t.longtv.utils.AppUtils;
import com.t.longtv.utils.MD5Utils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 作者：龙昊
 * 日期：2018/4/27 12:25
 * 描述：
 */
public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {
    public LoginPresenter(LoginContract.View view) {
        super(view);
    }

    @Override
    public void loadData(String user, String password) {
        if (TextUtils.isEmpty(user)||TextUtils.isEmpty(password)){
            AppUtils.Toast("用户名或密码为空！");
            return;
        }
        ApiObserveble.defaultMethed(ApiRetrofit.getInstance()
                .create(ApiService.class)
                .getLogin(loginMap(user,password),"android"))
                .subscribe(new DefaultApiObserveble<UserLoginBean>() {
                    @Override
                    public void onSuccess(UserLoginBean userLoginBean) {
                        getView().loadSuccess(userLoginBean);
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

    private Map loginMap(String user,String pwd) {
        Map map = new LinkedHashMap();
        //  http://api.huomao.com
        // /userlogin/user_login
        // ?refer=android
        // &passwd=7811b593c49e3043f6b0cf7733793edc
        // &refer=android&time=25412251
        // &token=4f1cee342b414f29bc2753885696ed0d
        // &username=13402517521
        // &an=68&ver=2.4
        map.put("refer","android");
        map.put("passwd", MD5Utils.MD5(pwd.trim()));
        map.put("time","25412251");
        map.put("token","4f1cee342b414f29bc2753885696ed0d");
        map.put("username",user);
        map.put("an","68");
        map.put("ver","2.4");

        return map;
    }
}
