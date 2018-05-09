package com.t.longtv.detail.Subscribe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.aspsine.irecyclerview.IRecyclerView;
import com.aspsine.irecyclerview.OnLoadMoreListener;
import com.aspsine.irecyclerview.OnRefreshListener;
import com.jtl.failureview.FailureView;
import com.t.longtv.AppConstants;
import com.t.longtv.GlideApp;
import com.t.longtv.R;
import com.t.longtv.adapter.SubscribeItemAdapter;
import com.t.longtv.base.BaseActivity;
import com.t.longtv.bean.SubscribeBean;
import com.t.longtv.utils.AppUtils;
import com.t.longtv.utils.DimensionUtils;
import com.t.longtv.widget.LoadMoreFooterView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：龙昊
 * 日期：2018/4/26 22:56
 * 描述：订阅Activity
 */
@Route(path = AppConstants.ARouter_Subscribe)
public class SubscribeActivity extends BaseActivity implements SubscribeContract.View {
    @BindView(R.id.irv_subscribe_container)
    IRecyclerView irvSubscribeContainer;
    @BindView(R.id.fv_subscribe_failure)
    FailureView fvSubscribeFailure;
    @BindView(R.id.tv_toolbar_title)
    TextView tvToolbarTitle;
    @BindView(R.id.tb_toolbar_bar)
    Toolbar tbToolbarBar;
    private LoadMoreFooterView loadMoreFooterView;
    private SubscribePresenter subscribePresenter;
    private SubscribeAdapter subscribeAdapter;
    List<SubscribeBean.DataBean> isLive;
    List<SubscribeBean.DataBean> notLive;
    List <List<SubscribeBean.DataBean>>list;
    private int page = 1;
    private int STATUS;
    private final int REFRESH = 0;
    private final int LOADMORE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);
        ButterKnife.bind(this);
        setToolbar(tbToolbarBar);
        setStatus(Color.WHITE,R.id.layout_subscribe_title);
        subscribePresenter = new SubscribePresenter(this);
        init();
    }

    private void init() {
        tvToolbarTitle.setText("我的订阅");
        irvSubscribeContainer.getRefreshHeaderView().setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, DimensionUtils.getDp(this,60)));
        loadMoreFooterView = (LoadMoreFooterView) irvSubscribeContainer.getLoadMoreFooterView();
        irvSubscribeContainer.setLayoutManager(new LinearLayoutManager(this));
        subscribeAdapter = new SubscribeAdapter();
        irvSubscribeContainer.setIAdapter(subscribeAdapter);

        subscribePresenter.loadSubscribe(page);
        irvSubscribeContainer.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                STATUS = REFRESH;
                page = 1;
                subscribePresenter.loadSubscribe(page);
            }
        });

        irvSubscribeContainer.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                if (loadMoreFooterView.canLoadMore() && subscribeAdapter.getItemCount() > 0) {
                    loadMoreFooterView.setStatus(LoadMoreFooterView.Status.LOADING);
                    STATUS = LOADMORE;
                    page++;
                    subscribePresenter.loadSubscribe(page);
                }
            }
        });

        fvSubscribeFailure.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fvSubscribeFailure.setLoadingShowing(true);
                STATUS = REFRESH;
                page = 1;
                subscribePresenter.loadSubscribe(page);
            }
        });
    }

    ///////////////////////////////////////////////////////////////////////////
    // View接口方法
    ///////////////////////////////////////////////////////////////////////////


    @Override
    public void getSubscribeSuccess(List<SubscribeBean.DataBean> listData) {
        if (listData!=null){
            isLive = new ArrayList();
            notLive = new ArrayList();
            for (int i = 0; i < listData.size(); i++) {
                SubscribeBean.DataBean dataxBean = listData.get(i);
                if (dataxBean.getIs_live() == 1) {
                    isLive.add(dataxBean);
                } else {
                    notLive.add(dataxBean);
                }
            }
            list=new ArrayList<>(16);
            list.add(isLive);
            list.add(notLive);
            subscribeAdapter.notifyDataSetChanged();

            if (STATUS==REFRESH){
                irvSubscribeContainer.setRefreshing(false);
                fvSubscribeFailure.setVisibility(View.GONE);
                irvSubscribeContainer.setVisibility(View.VISIBLE);
            }
            else{
                loadMoreFooterView.setStatus(LoadMoreFooterView.Status.GONE);
            }
        }
        else{
            loadMoreFooterView.setStatus(LoadMoreFooterView.Status.THE_END);
        }
    }

    @Override
    public void getSubscribeFailed(String msg) {
        if (STATUS == REFRESH) {
            irvSubscribeContainer.setRefreshing(false);
            fvSubscribeFailure.setVisibility(View.VISIBLE);
            fvSubscribeFailure.setLoadingShowing(false);
            irvSubscribeContainer.setVisibility(View.GONE);
        } else {
            irvSubscribeContainer.setLoadMoreFooterView(R.layout.layout_irecyclerview_load_more_footer_error_view);
        }
        AppUtils.Toast(msg);
    }


    private class SubscribeAdapter extends RecyclerView.Adapter<SubscribeViewHolder> {

        @NonNull
        @Override
        public SubscribeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            SubscribeViewHolder viewHolder=new SubscribeViewHolder(LayoutInflater.from(SubscribeActivity.this)
                    .inflate(R.layout.layout_subscribe_item, parent,false));;

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull SubscribeViewHolder holder, int position) {
            String title = "";
            @DrawableRes int res;

            if (position == 0) {
                title = "正在直播";
                res = R.mipmap.subscriber_living;
                holder.subscribeItemAdapter=new SubscribeItemAdapter(true,R.layout.layout_subscribe_item_islive,list.get(position));
                holder.recyclerView.setLayoutManager(new GridLayoutManager(SubscribeActivity.this,2));
                holder.recyclerView.setAdapter(holder.subscribeItemAdapter);
              } else {
                res = R.mipmap.subscribe_stop;
                title = "暂未开播";
                holder.subscribeItemAdapter=new SubscribeItemAdapter(false,R.layout.layout_subscribe_item_nolive,list.get(position));
                holder.recyclerView.setLayoutManager(new LinearLayoutManager(SubscribeActivity.this));
                holder.recyclerView.setAdapter(holder.subscribeItemAdapter);

            }

            holder.textView.setText(title);
            GlideApp.with(SubscribeActivity.this)
                    .load(res)
                    .into(holder.imageView);
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }

    private class SubscribeViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout linearLayout;
        private TextView textView;
        private RecyclerView recyclerView;
        private ImageView imageView;
        private SubscribeItemAdapter subscribeItemAdapter;

        public SubscribeViewHolder(View itemView) {
            super(itemView);

            linearLayout=itemView.findViewById(R.id.layout_subscribe_item_head);
            textView = itemView.findViewById(R.id.tv_subscribe_item_head);
            imageView = itemView.findViewById(R.id.iv_subscribe_item_head);
            recyclerView = itemView.findViewById(R.id.rv_subscribe_item_container);
        }
    }
}
