package com.t.longtv.detail.Home;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.adapter.HomeAdapter;
import com.t.longtv.bean.HMTitleBean;
import com.t.longtv.detail.Foucs.FoucsFragment;
import com.t.longtv.detail.Live.LiveFragment;
import com.t.longtv.detail.Recommend.RecommendFragment;
import com.t.longtv.event.HomeEvent;
import com.t.longtv.utils.StatusUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 作者：龙昊
 * 日期：2018/4/15 10:51
 * 描述：首页 Fragment
 */
@Route(path = AppConstants.ARouter_Fragment_Home)
public class HomeFragment extends Fragment implements HomeContract.View {
    @BindView(R.id.img_fragment_home_history)
    ImageView imgHistory;
    @BindView(R.id.img_fragment_home_search)
    ImageView imgSearch;
    @BindView(R.id.tab_fragment_home_title)
    TabLayout tabTitle;
    @BindView(R.id.vp_fragment_home_container)
    ViewPager vpContainer;
    Unbinder unbinder;
    @BindView(R.id.img_fragment_home_more)
    ImageView imgMore;

    private HomePresenter homePresenter;
    private FoucsFragment foucsFragment;
    private RecommendFragment recommendFragment;
    private HomeAdapter homeAdapter;
    private List<HMTitleBean> titleList;
    private List<Fragment> fragmentList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        homePresenter = new HomePresenter(this);

        init();
        initAdapter();
    }

    private void init() {
        titleList = homePresenter.loadTitle();
        fragmentList=getFragmentList();

    }
    @Override
    public void onStart() {
        super.onStart();
        if (getUserVisibleHint()){
            StatusUtils.setStatus(getActivity(),false);
        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.img_fragment_home_history, R.id.img_fragment_home_search,R.id.img_fragment_home_more})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_fragment_home_history:
                homePresenter.getHistory();
                break;
            case R.id.img_fragment_home_search:
                homePresenter.getSearch();
                break;
            case R.id.img_fragment_home_more:
                ARouter.getInstance().build(AppConstants.ARouter_HM_Channel).navigation();
                break;
        }
    }

    @Override
    public void notifyData() {

    }

    ///////////////////////////////////////////////////////////////////////////
    // 私有方法
    ///////////////////////////////////////////////////////////////////////////

    private void initAdapter() {
        homeAdapter = new HomeAdapter(getActivity().getSupportFragmentManager(), titleList, fragmentList);

        tabTitle.setupWithViewPager(vpContainer);
        vpContainer.setAdapter(homeAdapter);

        vpContainer.setCurrentItem(1);
        vpContainer.setOffscreenPageLimit(8);
    }

    public FoucsFragment getFoucsFragment() {
        if (foucsFragment == null) {
            foucsFragment = (FoucsFragment) ARouter.getInstance().build(AppConstants.ARouter_Fragment_Foucs).navigation();
        }
        return foucsFragment;
    }

    public RecommendFragment getRecommendFragment() {
        if (recommendFragment == null) {
            recommendFragment = (RecommendFragment) ARouter.getInstance().build(AppConstants.ARouter_Fragment_Recommend).navigation();
        }
        return recommendFragment;
    }

    public LiveFragment getLiveFragment(String gid) {
        return  (LiveFragment) ARouter.getInstance().build(AppConstants.ARouter_Fragment_Live).withString("gid", gid).navigation();
    }

    public List<Fragment> getFragmentList() {
        if (fragmentList==null){
            fragmentList = new ArrayList<>(16);
        }

        for (int i=0;i<homePresenter.loadTitle().size();i++){
            fragmentList.add(getLiveFragment(homePresenter.loadTitle().get(i).getGid()));
        }

        fragmentList.add(0,getFoucsFragment());
        fragmentList.add(1,getRecommendFragment());

        titleList.add(0,new HMTitleBean("关注",null,null));
        titleList.add(1,new HMTitleBean("推荐",null,null));

        return fragmentList;
    }

    public void selectTab( HomeEvent event){
        int index=event.getIndex();
        vpContainer.setCurrentItem(index);
    }
}
