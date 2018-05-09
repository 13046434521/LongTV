package com.t.longtv.detail.Foucs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jtl.failureview.FailureView;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.event.PageEvent;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 作者：龙昊
 * 日期：2018/4/26 22:56
 * 描述：关注
 */
@Route(path = AppConstants.ARouter_Fragment_Foucs)
public class FoucsFragment extends Fragment {

    @BindView(R.id.fv_foucs)
    FailureView fvFoucs;
    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_foucs, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        init();
    }

    private void init() {
        fvFoucs.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_Login));
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
