package com.t.longtv.detail.Mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.scwang.wave.MultiWaveHeader;
import com.t.longtv.AppConstants;
import com.t.longtv.GlideApp;
import com.t.longtv.R;
import com.t.longtv.adapter.MineAdapter;
import com.t.longtv.bean.MineBean;
import com.t.longtv.bean.MineModuleBean;
import com.t.longtv.bean.UserInfoBean;
import com.t.longtv.bean.UserinfoAdBean;
import com.t.longtv.dao.dbutils.UserDBUtils;
import com.t.longtv.event.PageEvent;
import com.t.longtv.utils.AppUtils;
import com.t.longtv.utils.StatusUtils;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * 作者：龙昊
 * 日期：2018/4/15 10:51
 * 描述：我的 Fragment
 */
@Route(path = AppConstants.ARouter_Fragment_Mine)
public class MineFragment extends Fragment implements MineContract.View {
    private static final int LINEAR = 0;
    private static final int GRID = 1;
    Unbinder unbinder;
    @BindView(R.id.rv_mine_linear)
    RecyclerView rvMineLinear;
    @BindView(R.id.rv_mine_grid)
    RecyclerView rvMineGrid;
    @BindView(R.id.wave_mine_header)
    MultiWaveHeader waveHeader;
    @BindView(R.id.iv_mine_message)
    ImageView ivMessage;
    @BindView(R.id.iv_mine_set)
    ImageView ivSet;
    @BindView(R.id.iv_mine_ad)
    ImageView ivAd;
    @BindView(R.id.iv_mine_head)
    CircleImageView ivHead;
    @BindView(R.id.tv_mine_login)
    TextView tvLogin;
    @BindView(R.id.tv_mine_user)
    TextView tvUser;
    @BindView(R.id.layout_mine_user)
    RelativeLayout layoutUser;
    @BindView(R.id.tv_mine_cat_coin)
    TextView tvCatCoin;
    @BindView(R.id.tv_mine_cat_beans)
    TextView tvCatBeans;
    @BindView(R.id.tv_mine_fairy_beans)
    TextView tvFairyBeans;
    @BindView(R.id.layout_mine_pay)
    LinearLayout layoutPay;
    @BindView(R.id.layout_mine_bill)
    LinearLayout layoutBill;
    private List<MineBean> linearList;
    private List<MineBean> gridList;
    private MineAdapter linearAdapter;
    private MineAdapter gridAdapter;
    private MinePresenter minePresenter;
    private UserInfoBean.DataBean userInfoBean;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        StatusUtils.setStatus(getActivity(),true);
        minePresenter = new MinePresenter(this);
        initView();
    }

    //显示的时候为false
    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);

        StatusUtils.setStatus(getActivity(),!hidden);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    ///////////////////////////////////////////////////////////////////////////
    // 私有方法
    ///////////////////////////////////////////////////////////////////////////
    private void initView() {
        linearList = new ArrayList();
        gridList = new ArrayList();

        linearList.add(new MineBean(R.mipmap.mine_anchor_icon, "我的订阅", LINEAR));
        linearList.add(new MineBean(R.mipmap.ic_mine_history, "我看过的", LINEAR));
        linearList.add(new MineBean(R.mipmap.new_task_image, "我的任务", LINEAR));

        linearAdapter = new MineAdapter(R.layout.layout_mine_linear_item, linearList);
        rvMineLinear.setAdapter(linearAdapter);
        rvMineLinear.setLayoutManager(new LinearLayoutManager(getContext()));

        gridList.add(new MineBean(R.mipmap.userinfo_fan_icon, "我的粉丝牌", GRID));
        gridList.add(new MineBean(R.mipmap.userinfo_badge_icon, "我的徽章", GRID));
        gridList.add(new MineBean(R.mipmap.userinfo_free_icon, "免流量", GRID));
        gridList.add(new MineBean(R.mipmap.userinfo_tv_icon, "火猫TV版", GRID));
        gridList.add(new MineBean(R.mipmap.userinfo_suggstion_icon, "帮助反馈", GRID));
        gridList.add(new MineBean(R.mipmap.userinfo_service_icon, "联系客服", GRID));
        gridList.add(new MineBean(R.mipmap.userinfo_livepush_icon, "我要开播", GRID));
        gridAdapter = new MineAdapter(R.layout.layout_mine_grid_item, gridList);
        rvMineGrid.setAdapter(gridAdapter);
        rvMineGrid.setLayoutManager(new GridLayoutManager(getContext(), 4));

        setIsLogin(UserDBUtils.getInstance().hasUserInfo());
    }

    ///////////////////////////////////////////////////////////////////////////
    // View接口方法
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public void getModuleSuccess(List<MineModuleBean.DataBean> dataBeans) {
        for (int i = 0; i < dataBeans.size(); i++) {
            MineBean mineBean = gridList.get(i);
            MineModuleBean.DataBean dataBean = dataBeans.get(i);

            mineBean.setIcon(dataBean.getIcon());
            mineBean.setUrl(dataBean.getUrl());
            mineBean.setContent(dataBean.getName());
            mineBean.setId(dataBean.getId());
        }

        gridAdapter.setNewData(gridList);
    }

    @Override
    public void getModuleFailed(String msg) {
        ivAd.setVisibility(View.GONE);
    }

    @Override
    public void getUserAdSuccess(final UserinfoAdBean.DataBean dataBeans) {
        GlideApp.with(getContext())
                .load(dataBeans.getTop().get(0).getImage_url())
                .centerInside()
                .into(ivAd);

        ivAd.setVisibility(View.VISIBLE);

        ivAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(AppConstants.ARouter_Web)
                        .withString("title", dataBeans.getTop().get(0).getTitle())
                        .withString("url", dataBeans.getTop().get(0).getLink()).navigation();
            }
        });
    }

    @Override
    public void getUserAdFailed(String msg) {
    }

    @Override
    public void getUserInfoSuccess(UserInfoBean.DataBean userInfoBean) {
        this.userInfoBean=userInfoBean;

        tvUser.setText(userInfoBean.getUsername());
        tvCatCoin.setText(userInfoBean.getMoney_one());
        tvCatBeans.setText(userInfoBean.getMoney_two());
        tvFairyBeans.setText(String.valueOf(userInfoBean.getYe()));
        GlideApp.with(getContext()).load(userInfoBean.getUser_acount())
                .error(R.mipmap.default_head_icon)
                .circleCrop()
                .placeholder(R.mipmap.default_head_icon)
                .into(ivHead);
    }

    @Override
    public void getUserInfoFailed(String msg) {
        AppUtils.Toast(msg);
    }

    @OnClick({R.id.iv_mine_message, R.id.iv_mine_set, R.id.iv_mine_ad, R.id.iv_mine_head, R.id.tv_mine_login,R.id.layout_mine_user,R.id.layout_mine_pay, R.id.layout_mine_bill})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_mine_message:
//                EventBus.getDefault().post(new MineIsLoginEvent(Tags.Is_Logout));
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Message));
                break;
            case R.id.iv_mine_set:
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Set));
                break;
            case R.id.iv_mine_ad:
                break;
            case R.id.iv_mine_head:
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Personal,userInfoBean));
                break;
            case R.id.tv_mine_login:
                ARouter.getInstance().build(AppConstants.ARouter_Login).navigation();
                break;
            case R.id.layout_mine_user:
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Personal,userInfoBean));
                break;
            case R.id.layout_mine_pay:
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Pay));
                break;
            case R.id.layout_mine_bill:
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Bill));
                break;
        }
    }

    public void setIsLogin(boolean isLogin){
        if (isLogin){
            tvLogin.setVisibility(View.GONE);
            layoutUser.setVisibility(View.VISIBLE);
            minePresenter.loadUserInfo();
        }
        else {
            tvLogin.setVisibility(View.VISIBLE);
            layoutUser.setVisibility(View.GONE);
            tvCatCoin.setText("0");
            tvCatBeans.setText("0");
            tvFairyBeans.setText("0");

            GlideApp.with(getContext()).load(R.mipmap.default_head_icon)
                    .centerInside()
                    .error(R.mipmap.default_head_icon)
                    .placeholder(R.mipmap.default_head_icon)
                    .into(ivHead);
            UserDBUtils.getInstance().deleteAll();
        }
    }
}
