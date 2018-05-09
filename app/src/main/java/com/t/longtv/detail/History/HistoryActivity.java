package com.t.longtv.detail.History;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
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
import com.t.longtv.adapter.HistoryAdapter;
import com.t.longtv.base.BaseActivity;
import com.t.longtv.bean.HistoryBean;
import com.t.longtv.helper.ItemDecoration;
import com.t.longtv.helper.ItemDecorationHelper;
import com.t.longtv.utils.DimensionUtils;
import com.t.longtv.widget.LoadMoreFooterView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：龙昊
 * 日期：2018/4/26 22:56
 * 描述：历史Activity
 */
@Route(path = AppConstants.ARouter_History)
public class HistoryActivity extends BaseActivity implements HistoryContract.View {
    @BindView(R.id.tv_toolbar_title)
    TextView tvTitle;
    @BindView(R.id.tv_toolbar_text)
    TextView tvText;
    @BindView(R.id.tb_toolbar_bar)
    Toolbar tbBar;
    @BindView(R.id.irv_history_container)
    IRecyclerView irvHistory;
    @BindView(R.id.fv_history_container)
    FailureView fvHistory;
    private HistoryPresenter historyPresenter;
    private int page = 1;
    private HistoryAdapter historyAdapter;
    private ItemDecorationHelper itemDecorationHelper;
    private LoadMoreFooterView loadMoreFooterView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        ButterKnife.bind(this);

        historyPresenter = new HistoryPresenter(this);
        init();
    }

    private void init() {
        tvTitle.setText("历史记录");
        tvText.setText("清空");
        tvText.setVisibility(View.VISIBLE);

        setStatus(Color.WHITE,R.id.layout_history_title);
        setToolbar(tbBar);

        irvHistory.getRefreshHeaderView().setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, DimensionUtils.getDp(this,60)));
        loadMoreFooterView = (LoadMoreFooterView) irvHistory.getLoadMoreFooterView();
        historyAdapter=new HistoryAdapter(R.layout.layout_history_item,null);
        irvHistory.setLayoutManager(new LinearLayoutManager(this));
        irvHistory.setIAdapter(historyAdapter);

        fvHistory.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fvHistory.setLoadingShowing(true);
                historyPresenter.loadData(page);
            }
        });

        irvHistory.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                page=1;
                historyPresenter.loadData(page);
            }
        });

        irvHistory.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                if (loadMoreFooterView.canLoadMore() && historyAdapter.getItemCount() > 0) {
                    page++;
                    historyPresenter.loadData(page);
                    loadMoreFooterView.setStatus(LoadMoreFooterView.Status.LOADING);
                }
            }
        });

        irvHistory.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                page=1;
                historyPresenter.loadData(page);
            }
        });

        historyPresenter.loadData(page);
    }

    @Override
    public void loadSuccess(List<HistoryBean.DataBean> beanList) {
        irvHistory.setRefreshing(false);
        fvHistory.setVisibility(View.GONE);
        irvHistory.setVisibility(View.VISIBLE);

   /*     itemDecorationHelper=new ItemDecorationHelper(this,beanList);
        irvHistory.addItemDecoration(itemDecorationHelper);*/

        irvHistory.addItemDecoration(new ItemDecoration(this,beanList));
        historyAdapter.setNewData(beanList);
    }

    @Override
    public void loadFailed(String msg) {
        fvHistory.setVisibility(View.VISIBLE);
        fvHistory.setLoadingShowing(false);
        irvHistory.setVisibility(View.GONE);
    }
}
