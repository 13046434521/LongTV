package com.t.longtv.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.t.longtv.bean.HMTitleBean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/15 15:34
 * 描述：
 */
public class HomeAdapter extends FragmentPagerAdapter {
    private List<HMTitleBean> titles;
    private List<Fragment> fragmentList;
    public HomeAdapter(FragmentManager fm , List<HMTitleBean> titles, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList=fragmentList;
        this.titles=titles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position).getHmGameName();
    }
}
