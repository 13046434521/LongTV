package com.t.longtv.detail.Personal;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.t.longtv.AppConstants;
import com.t.longtv.GlideApp;
import com.t.longtv.R;
import com.t.longtv.Tags;
import com.t.longtv.base.BaseActivity;
import com.t.longtv.bean.UserInfoBean;
import com.t.longtv.event.MineIsLoginEvent;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;


@Route(path = AppConstants.ARouter_Personal)
public class PersonalActivity extends BaseActivity {

    @Autowired(name = "key")
    UserInfoBean.DataBean infoBean;
    @BindView(R.id.tv_toolbar_title)
    TextView tvToolbarText;
    @BindView(R.id.tb_toolbar_bar)
    Toolbar tbToolbarBar;
    @BindView(R.id.iv_personal_head)
    CircleImageView ivPersonalHead;
    @BindView(R.id.tv_personal_user_content)
    TextView tvPersonalUserContent;
    @BindView(R.id.tv_personal_nickname_content)
    TextView tvPersonalNicknameContent;
    @BindView(R.id.tv_personal_password_content)
    TextView tvPersonalPasswordContent;
    @BindView(R.id.tv_personal_tel_content)
    TextView tvPersonalTelContent;
    @BindView(R.id.btn_personal_login)
    Button btnPersonalLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        init();
    }

    private void init() {
        setToolbar(tbToolbarBar);
        tvToolbarText.setText("个人信息");
        setStatus(Color.WHITE,R.id.layout_personal_title);

        if (!TextUtils.isEmpty(infoBean.getName())){
            tvPersonalUserContent.setText(infoBean.getName());
        }

        if (!TextUtils.isEmpty(infoBean.getUsername())){
            tvPersonalNicknameContent.setText(infoBean.getUsername());
        }
        if (!TextUtils.isEmpty(infoBean.getMobile())){
            tvPersonalTelContent.setText(infoBean.getMobile());
        }

        GlideApp.with(this)
                .load(infoBean.getUser_acount())
                .placeholder(R.mipmap.default_head_icon)
                .error(R.mipmap.default_head_icon)
                .into(ivPersonalHead);
    }

    @OnClick({R.id.iv_personal_head, R.id.tv_personal_password_content,R.id.btn_personal_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_personal_head:
                break;
            case R.id.tv_personal_password_content:
                break;
            case R.id.btn_personal_login:
                EventBus.getDefault().post(new MineIsLoginEvent(Tags.Is_Logout));
                finish();
                break;
        }
    }
}
