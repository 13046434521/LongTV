package com.t.longtv.detail.Live;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.aspsine.irecyclerview.IRecyclerView;
import com.aspsine.irecyclerview.OnLoadMoreListener;
import com.aspsine.irecyclerview.OnRefreshListener;
import com.jtl.failureview.FailureView;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.adapter.LiveAdapter;
import com.t.longtv.bean.LiveBean;
import com.t.longtv.utils.DimensionUtils;
import com.t.longtv.widget.LoadMoreFooterView;

/**
 * 作者：龙昊
 * 日期：2018/4/15 10:51
 * 描述：直播分类Fragment
 */
@Route(path = AppConstants.ARouter_Fragment_Live)
public class LiveFragment extends Fragment implements LiveContract.View {
    @Autowired
    String gid;
    private IRecyclerView irvContainer;
    private FailureView fvFailure;
    private LoadMoreFooterView loadMoreFooterView;
    private GridLayoutManager gridLayoutManager;
    private LiveAdapter liveAdapter;
    private LivePresenter livePresenter;
    private int page = 1;
    private LiveBean.DataBean liveDataBean;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_live, container, false);
        irvContainer = view.findViewById(R.id.irv_live_container);
        fvFailure = view.findViewById(R.id.fv_live_failure);
        loadMoreFooterView = (LoadMoreFooterView) irvContainer.getLoadMoreFooterView();


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ARouter.getInstance().inject(this);
        
        livePresenter = new LivePresenter(this, gid);
        init();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    ///////////////////////////////////////////////////////////////////////////
    // 私有方法
    ///////////////////////////////////////////////////////////////////////////
    private void init() {
        gridLayoutManager = new GridLayoutManager(getContext(), 2);
        liveAdapter = new LiveAdapter(R.layout.layout_live_item, null);
        irvContainer.setLayoutManager(gridLayoutManager);
        irvContainer.getRefreshHeaderView().setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, DimensionUtils.getDp(getContext(),60)));
        irvContainer.setIAdapter(liveAdapter);

        irvContainer.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                page = 1;
                livePresenter.loadData(AppConstants.REFRESH, gid, 1);
            }
        });

        irvContainer.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                if (loadMoreFooterView.canLoadMore() && liveAdapter.getItemCount() > 0) {
                    loadMoreFooterView.setStatus(LoadMoreFooterView.Status.LOADING);
                    livePresenter.loadData( AppConstants.LOADMORE, gid, page + 1);
                }
            }
        });

        fvFailure.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fvFailure.setLoadingShowing(true);
                livePresenter.loadData(AppConstants.REFRESH, gid, 0);
            }
        });
    }

    ///////////////////////////////////////////////////////////////////////////
    // 接口方法
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public void getDataSuccess(LiveBean.DataBean dataBean) {
        fvFailure.hide();
        irvContainer.setVisibility(View.VISIBLE);

        liveDataBean = dataBean;
        liveAdapter.setNewData(liveDataBean.getList());
        irvContainer.setRefreshing(false);
    }

    @Override
    public void getDataFailed(String msg) {
        irvContainer.setVisibility(View.GONE);
        fvFailure.show();
        fvFailure.setLoadingShowing(false);

        irvContainer.setRefreshing(false);
    }

    @Override
    public void loadMoreDataSuccess(LiveBean.DataBean dataBean) {
        if (dataBean != null) {
            page++;
            liveDataBean.getList().addAll(dataBean.getList());
            liveAdapter.setNewData(liveDataBean.getList());

            loadMoreFooterView.setStatus(LoadMoreFooterView.Status.GONE);
        } else {
            loadMoreFooterView.setStatus(LoadMoreFooterView.Status.THE_END);
        }
    }

    @Override
    public void loadMoreDataFailed(String msg) {
        loadMoreFooterView.setStatus(LoadMoreFooterView.Status.ERROR);
    }
}