package com.t.longtv.detail.Match;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.aspsine.irecyclerview.IRecyclerView;
import com.jtl.failureview.FailureView;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.utils.StatusUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.bingoogolapple.bgabanner.BGABanner;

/**
 * 作者：龙昊
 * 日期：2018/4/15 10:51
 * 描述：比赛Fragment
 */
@Route(path = AppConstants.ARouter_Fragment_Match)
public class MatchFragment extends Fragment {
    @BindView(R.id.tv_toolbar_title)
    TextView tvTitle;
    Unbinder unbinder;
    @BindView(R.id.fv_match_test)
    FailureView fvTest;
    @BindView(R.id.irv_match_container)
    IRecyclerView irvContainer;
    @BindView(R.id.tv_toolbar_text)
    TextView tvToolbarText;
    private BGABanner bannerRecommend;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_match, container, false);
        unbinder = ButterKnife.bind(this, view);
        tvTitle.setText(AppConstants.Match_Title);
        irvContainer.addHeaderView(inflater.inflate(R.layout.layout_banner, null, false));
        bannerRecommend = inflater.inflate(R.layout.layout_banner, null, false).findViewById(R.id.banner_layout);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
    }

    @Override
    public void onStart() {
        super.onStart();
        if (getUserVisibleHint()) {
            StatusUtils.setStatus(getActivity(), false);
        }
    }

    private void init() {
        fvTest.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
