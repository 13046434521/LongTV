package com.t.longtv.detail.Park;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.bean.ParkBean;
import com.t.longtv.utils.AppUtils;
import com.t.longtv.utils.StatusUtils;
import com.t.longtv.utils.WebViewUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 作者：龙昊
 * 日期：2018/4/15 10:51
 * 描述：游乐园 Fragment
 */
@Route(path = AppConstants.ARouter_Fragment_Park)
public class ParkFragment extends Fragment implements ParkContract.View {
    @BindView(R.id.tv_toolbar_title)
    TextView tvTitle;
    @BindView(R.id.web_park_container)
    WebView webContainer;
    Unbinder unbinder;
    private ParkPresenter parkPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_park, container, false);
        unbinder = ButterKnife.bind(this, view);
        tvTitle.setText(AppConstants.Park_Title);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        parkPresenter = new ParkPresenter(this);
        parkPresenter.loadData();
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
    public void getSuccessData(ParkBean.DataBean dataBean) {
        tvTitle.setText(dataBean.getTitle());
        webContainer.loadUrl(dataBean.getUrl());
        WebViewUtils.initWebView(webContainer, new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                String title = "游乐场";
                if (url.contains("wawaji")) {
                    title = "娃娃大逃杀";
                } else if (url.contains("happyFarm")) {
                    title = "快乐农场";
                } else {
                    title = "赛事预测";
                }
                ARouter.getInstance().build(AppConstants.ARouter_Web)
                        .withString("title", title)
                        .withString("url", url).navigation();
                return true;
            }
        });
    }

    @Override
    public void getFailedData(String msg) {
        AppUtils.Toast(getContext(), msg);
    }

    ///////////////////////////////////////////////////////////////////////////
    // 自定义方法
    ///////////////////////////////////////////////////////////////////////////
}
