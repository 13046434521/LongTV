package com.t.longtv.detail.Entertain;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.aspsine.irecyclerview.IRecyclerView;
import com.aspsine.irecyclerview.OnLoadMoreListener;
import com.aspsine.irecyclerview.OnRefreshListener;
import com.jtl.failureview.FailureView;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.adapter.BannerAdapter;
import com.t.longtv.adapter.EntertainAdapter;
import com.t.longtv.bean.BannerBean;
import com.t.longtv.bean.EntertainBean;
import com.t.longtv.utils.AppUtils;
import com.t.longtv.utils.DimensionUtils;
import com.t.longtv.utils.StatusUtils;
import com.t.longtv.widget.LoadMoreFooterView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.bingoogolapple.bgabanner.BGABanner;

/**
 * 作者：龙昊
 * 日期：2018/4/15 10:51
 * 描述：娱乐 Fragment
 */
@Route(path = AppConstants.ARouter_Fragment_Entertain)
public class EntertainFragment extends Fragment implements EntertainContract.View {
    @BindView(R.id.tv_toolbar_title)
    TextView tvTitle;
    Unbinder unbinder;
    @BindView(R.id.irv_entertain_container)
    IRecyclerView irvContainer;
    @BindView(R.id.fv_entertain_failure)
    FailureView fvFailure;
    private LoadMoreFooterView loadMoreFooterView;
    private EntertainAdapter entertainAdapter;
    private GridLayoutManager gridLayoutManager;
    private int page = 1;
    private EntertainPresenter entertainPresenter;
    private BGABanner banner;
    private EntertainBean.DataXBean liveDataBean;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_entertain, container, false);
        unbinder = ButterKnife.bind(this, view);
        tvTitle.setText(AppConstants.Entertain_Title);
        loadMoreFooterView = (LoadMoreFooterView) irvContainer.getLoadMoreFooterView();
        View headView=inflater.inflate(R.layout.layout_banner, null,true);
        irvContainer.addHeaderView(headView);
        banner = headView.findViewById(R.id.banner_layout);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        entertainPresenter = new EntertainPresenter(this);
        init();
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

    ///////////////////////////////////////////////////////////////////////////
    // 接口方法
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public void getBannerSuccess(BannerBean bannerBean) {
        banner.setAdapter(new BannerAdapter(getContext()));
        ArrayList imgList = new ArrayList<>();
        ArrayList<String> titleList = new ArrayList<>();
        for (int i = 0; i < bannerBean.getData().size(); i++) {
            imgList.add(bannerBean.getData().get(i).getImage());
            titleList.add(bannerBean.getData().get(i).getImg_title());
        }

        banner.setData(imgList, titleList);
    }

    @Override
    public void getBannerFailed(String msg) {
        AppUtils.Toast(msg);
    }

    @Override
    public void getDataSuccess(EntertainBean.DataXBean dataXBean) {
        fvFailure.hide();
        irvContainer.setVisibility(View.VISIBLE);

        liveDataBean = dataXBean;
        entertainAdapter.setNewData(dataXBean.getList());
        irvContainer.setRefreshing(false);
    }

    @Override
    public void loadDataSuccess(EntertainBean.DataXBean dataXBean) {
        if (dataXBean != null) {
            page++;
            liveDataBean.getList().addAll(dataXBean.getList());
            entertainAdapter.setNewData(liveDataBean.getList());

            loadMoreFooterView.setStatus(LoadMoreFooterView.Status.GONE);
        } else {
            loadMoreFooterView.setStatus(LoadMoreFooterView.Status.THE_END);
        }
    }

    @Override
    public void loadDataFailed(String msg) {
        loadMoreFooterView.setStatus(LoadMoreFooterView.Status.ERROR);
    }

    @Override
    public void getDataFailed(String msg) {
        irvContainer.setVisibility(View.GONE);
        fvFailure.show();
        fvFailure.setLoadingShowing(false);

        irvContainer.setRefreshing(false);
    }

    ///////////////////////////////////////////////////////////////////////////
    // 私有方法
    ///////////////////////////////////////////////////////////////////////////

    private void init() {
        entertainAdapter = new EntertainAdapter(null);
        gridLayoutManager = new GridLayoutManager(getContext(), 2);
        irvContainer.setLayoutManager(gridLayoutManager);
        irvContainer.getRefreshHeaderView().setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, DimensionUtils.getDp(getContext(),60)));
        irvContainer.setIAdapter(entertainAdapter);

        irvContainer.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                page = 1;
                entertainPresenter.loadBanner();
                entertainPresenter.loadData(AppConstants.REFRESH, 1);
            }
        });

        irvContainer.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                if (loadMoreFooterView.canLoadMore() && entertainAdapter.getItemCount() > 0) {
                    loadMoreFooterView.setStatus(LoadMoreFooterView.Status.LOADING);
                    entertainPresenter.loadData(AppConstants.LOADMORE, page + 1);
                }
            }
        });

        fvFailure.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fvFailure.setLoadingShowing(true);
                entertainPresenter.loadBanner();
                entertainPresenter.loadData(AppConstants.REFRESH, 1);
            }
        });
    }
}
