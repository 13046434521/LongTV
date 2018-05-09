package com.t.longtv.detail.Task;

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
import com.jtl.failureview.FailureView;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.adapter.TaskAdapter;
import com.t.longtv.base.BaseActivity;
import com.t.longtv.bean.TaskBean;
import com.t.longtv.utils.DimensionUtils;
import com.t.longtv.widget.LoadMoreFooterView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：龙昊
 * 日期：2018/4/26 22:56
 * 描述：任务Activity
 */
@Route(path = AppConstants.ARouter_Task)
public class TaskActivity extends BaseActivity implements TaskContract.View{

    @BindView(R.id.tv_toolbar_title)
    TextView tvToolbarTitle;
    @BindView(R.id.tb_toolbar_bar)
    Toolbar tbToolbarBar;
    @BindView(R.id.irv_task_container)
    IRecyclerView irvTaskContainer;
    @BindView(R.id.fv_task_failure)
    FailureView fvTaskFailure;
    private LoadMoreFooterView loadMoreFooterView;
    private TaskAdapter adapter;
    private TaskPresenter taskPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        ButterKnife.bind(this);

        taskPresenter=new TaskPresenter(this);
        init();
    }

    private void init() {
        setStatus(Color.WHITE,R.id.layout_task_title);
        setToolbar(tbToolbarBar);
        tvToolbarTitle.setText("我的任务");

        loadMoreFooterView = (LoadMoreFooterView) irvTaskContainer.getLoadMoreFooterView();
        irvTaskContainer.getRefreshHeaderView().setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, DimensionUtils.getDp(this,60)));

        adapter=new TaskAdapter(null);
        irvTaskContainer.setAdapter(adapter);
        irvTaskContainer.setLayoutManager(new LinearLayoutManager(this));

        taskPresenter.loadData();
    }


    @Override
    public void loadDataSuccess(List<TaskBean.DataBean> dataBeans) {
        adapter.setNewData(dataBeans);
        irvTaskContainer.setRefreshing(false);
        irvTaskContainer.setVisibility(View.VISIBLE);
        fvTaskFailure.setVisibility(View.GONE);
    }

    @Override
    public void loadDataFailed(String msg) {

    }
}
