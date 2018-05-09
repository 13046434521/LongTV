package com.t.longtv.detail.QuanMin;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.t.longtv.AppConstants;
import com.t.longtv.R;
import com.t.longtv.Tags;
import com.t.longtv.adapter.QMAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = AppConstants.ARouter_Fragment_Quanmin)
public class QMFragment extends Fragment {
    @BindView(R.id.tv_toolbar_title)
    TextView tvToolbarTitle;
    @BindView(R.id.tab_qm_title)
    TabLayout tabQmTitle;
    @BindView(R.id.vp_qm_container)
    ViewPager vpQmContainer;
    Unbinder unbinder;
    private QMAdapter qmAdapter;
    private List<String> titleList;
    private List<Fragment> fragmentList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qm, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
    ///////////////////////////////////////////////////////////////////////////
    // View方法
    ///////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////
    // 私有方法
    ///////////////////////////////////////////////////////////////////////////

    private void init() {
        tvToolbarTitle.setText("全民TV");
        getList();

        qmAdapter=new QMAdapter(getActivity().getSupportFragmentManager(),titleList,fragmentList);
        tabQmTitle.setupWithViewPager(vpQmContainer);
        vpQmContainer.setOffscreenPageLimit(8);
        vpQmContainer.setAdapter(qmAdapter);
    }

    private void getList(){
        titleList=new ArrayList<>();
        fragmentList=new ArrayList<>();

        titleList.add(Tags.QM_ALL);
        titleList.add(Tags.QM_DOTA2);
        titleList.add(Tags.QM_HEARTSTONE);
        titleList.add(Tags.QM_LOL);
        for (int i=0;i<titleList.size();i++){
            fragmentList.add((Fragment) ARouter.getInstance().build(AppConstants.ARouter_Fragment_QMLive).withString("title",titleList.get(i)).navigation());
        }
    }
}
