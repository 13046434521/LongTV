package com.t.longtv.detail.Main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.Tags;
import com.t.longtv.detail.Entertain.EntertainFragment;
import com.t.longtv.detail.Home.HomeFragment;
import com.t.longtv.detail.Match.MatchFragment;
import com.t.longtv.detail.Mine.MineFragment;
import com.t.longtv.detail.Park.ParkFragment;
import com.t.longtv.detail.QuanMin.QMFragment;
import com.t.longtv.event.HomeEvent;
import com.t.longtv.event.MineIsLoginEvent;
import com.t.longtv.event.PageEvent;
import com.t.longtv.utils.AppUtils;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;

@Route(path = AppConstants.ARouter_Home)
public class HomeActivity extends AppCompatActivity implements HomeContract.View {

    @BindView(R.id.frame_main_container)
    FrameLayout layoutContainer;
    @BindView(R.id.navigation_main_bottom)
    BottomNavigationBar navigationBottom;

    private HomeFragment homeFragment;
    private MatchFragment matchFragment;
    private MineFragment mineFragment;
    private ParkFragment parkFragment;
    private EntertainFragment entertainFragment;
    private Fragment currentFragment;

    private BottomNavigationItem homeNavigation;
    private BottomNavigationItem matchNavigation;
    private BottomNavigationItem mineNavigation;
    private BottomNavigationItem parkNavigation;
    private BottomNavigationItem entertainNavigation;
    private HomePresenter homePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);
        EventBus.getDefault().register(this);

        homePresenter = new HomePresenter(this);
        initNavigation();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    ///////////////////////////////////////////////////////////////////////////
    // 私有方法
    ///////////////////////////////////////////////////////////////////////////
    private void initNavigation() {
        homeNavigation = new BottomNavigationItem(R.mipmap.ic_home_selected, "首页");
        homeNavigation.setInactiveIconResource(R.mipmap.ic_home_normal);

        matchNavigation = new BottomNavigationItem(R.mipmap.icon_match_select, "赛事");
        matchNavigation.setInactiveIconResource(R.mipmap.icon_match_normal);

        entertainNavigation = new BottomNavigationItem(R.mipmap.ic_video_selected, "娱乐");
        entertainNavigation.setInactiveIconResource(R.mipmap.ic_video_normal);

        parkNavigation = new BottomNavigationItem(R.mipmap.icon_play_selected, "游乐场");
        parkNavigation.setInactiveIconResource(R.mipmap.icon_play_normal);

        mineNavigation = new BottomNavigationItem(R.mipmap.ic_care_selected, "我的");
        mineNavigation.setInactiveIconResource(R.mipmap.ic_care_normal);


        navigationBottom.addItem(homeNavigation)
                .addItem(matchNavigation)
                .addItem(entertainNavigation)
                .addItem(parkNavigation)
                .addItem(mineNavigation)
                .initialise();

        navigationBottom.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                homePresenter.selectFragment(position);
            }

            @Override
            public void onTabUnselected(int position) {
            }

            @Override
            public void onTabReselected(int position) {
            }
        });

        navigationBottom.selectTab(0);
    }

    @Override
    public void replaceFragment(String tag) {
        if (currentFragment != null) {
            getSupportFragmentManager().beginTransaction().hide(currentFragment).commit();
        }
        currentFragment = getSupportFragmentManager().findFragmentByTag(tag);
        if (currentFragment == null) {
            switch (tag) {
                case "Home":
                    currentFragment = getHomeFragment();
                    break;
                case "Match":
                    currentFragment=new QMFragment();
//                    currentFragment = getMatchFragment();
                    break;
                case "Entertain":
                    currentFragment = getEntertainFragment();
                    break;
                case "Park":
                    currentFragment = getParkFragment();
                    break;
                case "Mine":
                    currentFragment = getMineFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().add(R.id.frame_main_container, currentFragment, tag).commit();
        } else {
            getSupportFragmentManager().beginTransaction().show(currentFragment).commit();
        }
    }

    public HomeFragment getHomeFragment() {
        if (homeFragment == null) {
            homeFragment = (HomeFragment) ARouter.getInstance().build(AppConstants.ARouter_Fragment_Home).navigation();
        }
        return homeFragment;
    }

    public MatchFragment getMatchFragment() {
        if (matchFragment == null) {
            matchFragment = (MatchFragment) ARouter.getInstance().build(AppConstants.ARouter_Fragment_Match).navigation();
        }
        return matchFragment;
    }

    public EntertainFragment getEntertainFragment() {
        if (entertainFragment == null) {
            entertainFragment = (EntertainFragment) ARouter.getInstance().build(AppConstants.ARouter_Fragment_Entertain).navigation();
        }
        return entertainFragment;
    }

    public ParkFragment getParkFragment() {
        if (parkFragment == null) {
            parkFragment = (ParkFragment) ARouter.getInstance().build(AppConstants.ARouter_Fragment_Park).navigation();
        }
        return parkFragment;
    }

    public MineFragment getMineFragment() {
        if (mineFragment == null) {
            mineFragment = (MineFragment) ARouter.getInstance().build(AppConstants.ARouter_Fragment_Mine).navigation();
        }
        return mineFragment;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void selectTab(HomeEvent event) {
        getHomeFragment().selectTab(event);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void jumpPage(PageEvent event) {
        if (!AppUtils.isLogin()) {
            ARouter.getInstance().build(AppConstants.ARouter_Login).navigation();
        } else {
            ARouter.getInstance().build(event.getPath()).withParcelable("key", event.getParcelable()).navigation();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void MineIsLogin(MineIsLoginEvent event) {
        if (event.getIndex() == Tags.Is_Login) {
            getMineFragment().setIsLogin(true);
        } else {
            getMineFragment().setIsLogin(false);
        }
    }
}
