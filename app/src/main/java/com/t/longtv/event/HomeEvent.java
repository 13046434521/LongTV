package com.t.longtv.event;

import com.t.longtv.Tags;

/**
 * 作者：龙昊
 * 日期：2018/4/22 19:34
 * 描述：ViewPager跳转
 */
public class HomeEvent {
    private int index;

    public HomeEvent(@Tags.HMPager int index){
        this.index=index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(@Tags.HMPager int index) {
        this.index = index;
    }
}
