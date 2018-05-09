package com.t.longtv.detail.Recommend;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.aspsine.irecyclerview.IRecyclerView;
import com.aspsine.irecyclerview.OnRefreshListener;
import com.jtl.failureview.FailureView;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.Tags;
import com.t.longtv.adapter.BannerAdapter;
import com.t.longtv.adapter.RecommendAdapter;
import com.t.longtv.bean.BannerBean;
import com.t.longtv.bean.RecommendBean;
import com.t.longtv.event.HomeEvent;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.bingoogolapple.bgabanner.BGABanner;

/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = AppConstants.ARouter_Fragment_Recommend)
public class RecommendFragment extends Fragment implements RecommendContract.View {

    BGABanner bannerRecommend;
    Unbinder unbinder;
    @BindView(R.id.tv_recommend_more)
    TextView tvRecommendMore;
    @BindView(R.id.cl_recommend_container)
    ConstraintLayout clContainer;
    private NestedScrollView svContainer;
    private FailureView fvRecommend;
    private RecommendPresenter recommendPresenter;
    private RecommendAdapter recommendAdapter;
    @BindView(R.id.irv_recommend_container)
    IRecyclerView irvContainer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recommend, container, false);
        unbinder = ButterKnife.bind(this, view);

        svContainer = view.findViewById(R.id.sv_recommend_container);
        fvRecommend = view.findViewById(R.id.fv_recommend);
        View headView=inflater.inflate(R.layout.layout_banner, null,true);
        irvContainer.addHeaderView(headView);
        bannerRecommend = headView.findViewById(R.id.banner_layout);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recommendPresenter = new RecommendPresenter(this);
        init();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    ///////////////////////////////////////////////////////////////////////////
    // 接口方法
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public void getBannerSuccess(final BannerBean bannerBean) {
        bannerRecommend.setAdapter(new BannerAdapter(getContext()));
        ArrayList imgList = new ArrayList<>();
        ArrayList<String> titleList = new ArrayList<>();
        for (int i = 0; i < bannerBean.getData().size(); i++) {
            imgList.add(bannerBean.getData().get(i).getImage());
            titleList.add(bannerBean.getData().get(i).getImg_title());
        }

        bannerRecommend.setData(imgList, titleList);
    }

    @Override
    public void getBannerFailed(String msg) {

    }

    @Override
    public void getDataSuccess(List<RecommendBean.DataBeanX> data) {
        recommendAdapter.setNewData(data);

        svContainer.setVisibility(View.VISIBLE);
        fvRecommend.setVisibility(View.GONE);

//        irvContainer.setRefreshing(false);
    }

    @Override
    public void getDataFailed(String msg) {
        svContainer.setVisibility(View.GONE);
        fvRecommend.setVisibility(View.VISIBLE);
        fvRecommend.setLoadingShowing(false);
    }

    ///////////////////////////////////////////////////////////////////////////
    //私有方法
    ///////////////////////////////////////////////////////////////////////////

    private void init() {
//        irvContainer.getRefreshHeaderView().setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        recommendAdapter = new RecommendAdapter(null);
        irvContainer.setLayoutManager(new LinearLayoutManager(getContext()));
        irvContainer.setAdapter(recommendAdapter);

        recommendPresenter.loadBanner();
        recommendPresenter.loadData();

        irvContainer.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                recommendPresenter.loadBanner();
                recommendPresenter.loadData();
            }
        });

        tvRecommendMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post(new HomeEvent(Tags.HM_LIVE));
            }
        });

        fvRecommend.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fvRecommend.setLoadingShowing(true);
                recommendPresenter.loadBanner();
                recommendPresenter.loadData();
            }
        });
    }
}
