package com.t.longtv.detail.QMLive;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.adapter.QMLiveAdapter;
import com.t.longtv.base.BaseFragment;
import com.t.longtv.bean.QmLiveBean;
import com.t.longtv.utils.AppUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = AppConstants.ARouter_Fragment_QMLive)
public class QMLiveFragment extends BaseFragment implements QMLiveContarct.View{

    @Autowired
    String title;
    @BindView(R.id.rv_qmlive_layout)
    RecyclerView rvQmliveLayout;
    @BindView(R.id.swipe_qmlive_layout)
    SwipeRefreshLayout swipeQmliveLayout;
    Unbinder unbinder;
    private QMLivePresenter qmLivePresenter;
    private QMLiveAdapter qmLiveAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qmlive, container, false);
        unbinder = ButterKnife.bind(this, view);
        ARouter.getInstance().inject(this);
        return view;
    }

    @Override
    public void Initialize() {
        swipeQmliveLayout.setRefreshing(true);
        qmLivePresenter=new QMLivePresenter(this);

        rvQmliveLayout.setLayoutManager(new GridLayoutManager(getContext(),2));
        qmLiveAdapter=new QMLiveAdapter(null);
        qmLiveAdapter.bindToRecyclerView(rvQmliveLayout);

        swipeQmliveLayout.setColorSchemeColors(getResources().getColor(R.color.colorPink), getResources().getColor(R.color.colorBlue), getResources().getColor(R.color.colorYellow));
        swipeQmliveLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                qmLivePresenter.loadData(title);
            }
        });

        qmLivePresenter.loadData(title);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    ///////////////////////////////////////////////////////////////////////////
    // view方法
    ///////////////////////////////////////////////////////////////////////////

    @Override
    public void loadSuccess(List<QmLiveBean.DataBeanX> dataBeanXList) {
        swipeQmliveLayout.setRefreshing(false);
        qmLiveAdapter.setNewData(dataBeanXList);
    }

    @Override
    public void loadFailed(String msg) {
        swipeQmliveLayout.setRefreshing(false);
        AppUtils.Toast(AppConstants.HTTP.Failed);
        AppUtils.Toast(msg);
        qmLiveAdapter.setEmptyView(R.layout.layout_qm_failed_item);
    }
}
