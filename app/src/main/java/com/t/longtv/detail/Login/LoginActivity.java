package com.t.longtv.detail.Login;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.Tags;
import com.t.longtv.base.BaseActivity;
import com.t.longtv.bean.UserLoginBean;
import com.t.longtv.dao.dbutils.UserDBUtils;
import com.t.longtv.event.MineIsLoginEvent;
import com.t.longtv.utils.AppUtils;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 作者：龙昊
 * 日期：2018/4/26 22:56
 * 描述：登录Activity
 */
@Route(path = AppConstants.ARouter_Login)
public class LoginActivity extends BaseActivity implements LoginContract.View {

    @BindView(R.id.tv_toolbar_title)
    TextView tvToolbarTitle;
    @BindView(R.id.tv_toolbar_text)
    TextView tvToolbarText;
    @BindView(R.id.tb_toolbar_bar)
    Toolbar tbToolbarBar;
    @BindView(R.id.img_login_default)
    ImageView imgLoginDefault;
    @BindView(R.id.et_login_account)
    EditText etLoginAccount;
    @BindView(R.id.et_login_password)
    EditText etLoginPassword;
    @BindView(R.id.tv_login_forget)
    TextView tvLoginForget;
    @BindView(R.id.btn_login_login)
    Button btnLoginLogin;
    @BindView(R.id.img_login_qq)
    ImageView imgLoginQq;
    @BindView(R.id.img_login_wechat)
    ImageView imgLoginWechat;
    @BindView(R.id.img_login_weibo)
    ImageView imgLoginWeibo;
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        setStatus(Color.WHITE, R.id.layout_login_title);
        loginPresenter=new LoginPresenter(this);
        init();
    }

    ///////////////////////////////////////////////////////////////////////////
    // 私有方法
    ///////////////////////////////////////////////////////////////////////////
    private void init() {
        tvToolbarTitle.setText("立即登录");
        setToolbar(tbToolbarBar);
        tvToolbarText.setVisibility(View.VISIBLE);
    }


    ///////////////////////////////////////////////////////////////////////////
    // 接口方法
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public void loadSuccess(UserLoginBean userLoginBean) {
        AppUtils.Toast(userLoginBean.getMessage());
        UserDBUtils.getInstance().insert(userLoginBean);
        EventBus.getDefault().post(new MineIsLoginEvent(Tags.Is_Login));
        finish();
    }

    @Override
    public void loadFailed(String msg) {
        AppUtils.Toast(msg);
    }


    /**
     * 点击事件
     * @param view
     */
    @OnClick({R.id.tv_toolbar_title, R.id.tv_toolbar_text, R.id.img_login_default,R.id.tv_login_forget, R.id.btn_login_login, R.id.img_login_qq, R.id.img_login_wechat, R.id.img_login_weibo})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_toolbar_title:
                break;
            case R.id.tv_toolbar_text:
                break;
            case R.id.img_login_default:
                break;
            case R.id.tv_login_forget:
                break;
            case R.id.btn_login_login:
                loginPresenter.loadData(etLoginAccount.getText().toString(),etLoginPassword.getText().toString());
                break;
            case R.id.img_login_qq:
                break;
            case R.id.img_login_wechat:
                break;
            case R.id.img_login_weibo:
                break;
        }
    }
}
