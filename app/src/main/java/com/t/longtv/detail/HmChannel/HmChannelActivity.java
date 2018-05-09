package com.t.longtv.detail.HmChannel;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.adapter.HMChannelAdapter;
import com.t.longtv.base.BaseActivity;
import com.t.longtv.bean.HMTitleBean;
import com.t.longtv.bean.HmChannenBean;
import com.t.longtv.dao.dbutils.HmDBUtils;
import com.t.longtv.utils.DefaultItemTouchHelpCallback;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = AppConstants.ARouter_HM_Channel)
public class HmChannelActivity extends BaseActivity implements HmChannelContract.View,DefaultItemTouchHelpCallback.OnStartDragListener{
    @BindView(R.id.tv_toolbar_title)
    TextView tvTitle;
    @BindView(R.id.tv_toolbar_text)
    TextView tvText;
    @BindView(R.id.tb_toolbar_bar)
    Toolbar tbBar;
    @BindView(R.id.tv_hmchannel_mine_content)
    TextView tvMineContent;
    @BindView(R.id.rv_hmchannel_mine)
    RecyclerView rvMine;
    @BindView(R.id.tv_hmchannel_all_content)
    TextView tvAllContent;
    @BindView(R.id.rv_hmchannel_all)
    RecyclerView rvAll;
    private HMChannelAdapter mineAdapter;
    private HMChannelAdapter allAdapter;
    private HmChannelPresenter presenter;
    private ItemTouchHelper itemTouchHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hm_channel);
        ButterKnife.bind(this);

        initToolBar();
        initRecycler();
        presenter=new HmChannelPresenter(this);
        presenter.loadData();
    }

    private void initRecycler() {
        mineAdapter = new HMChannelAdapter("MINE",null,this);
        allAdapter = new HMChannelAdapter("ALL",null,this);
        rvMine.setLayoutManager(new GridLayoutManager(this,4));
        rvAll.setLayoutManager(new GridLayoutManager(this,4));
        mineAdapter.bindToRecyclerView(rvMine);
        allAdapter.bindToRecyclerView(rvAll);

        ItemTouchHelper.Callback callback = new DefaultItemTouchHelpCallback(mineAdapter);
        itemTouchHelper = new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(rvMine);
    }

    private void initToolBar() {
        setStatus(Color.WHITE, R.id.layout_hmchannel_title);
        setToolbar(tbBar);
        tvTitle.setText("常用频道");
        tvText.setText("编辑");
        tvText.setVisibility(View.VISIBLE);
    }


    @OnClick(R.id.tv_toolbar_text)
    public void onViewClicked() {
    }

    ///////////////////////////////////////////////////////////////////////////
    // View方法
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public void loadSuccess(final HmChannenBean.DataBean dataBean) {
        mineAdapter.setNewData(dataBean.getIsSub());

        allAdapter.setNewData(dataBean.getAll());

        HmDBUtils.getInstance().deleteAll();
        for (int i=0;i<dataBean.getIsSub().size();i++){
            HmChannenBean.DataBean.SubBean subBean =dataBean.getIsSub().get(i);
            HmDBUtils.getInstance().insert(new HMTitleBean(subBean));
        }
    }

    @Override
    public void loadFailed(String msg) {

    }

    @Override
    public void alterSuccess() {

    }

    @Override
    public void alterFailed() {

    }

    @Override
    public void onStartDrag(RecyclerView.ViewHolder viewHolder) {
        itemTouchHelper.startDrag(viewHolder);
    }
}
