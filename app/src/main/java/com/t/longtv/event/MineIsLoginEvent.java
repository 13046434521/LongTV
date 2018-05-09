package com.t.longtv.event;

import com.t.longtv.Tags;

/**
 * 作者：龙昊
 * 日期：2018/4/27 13:08
 * 描述：
 */
public class MineIsLoginEvent {
    private int index;

    public MineIsLoginEvent(@Tags.MineIsLoginTag int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
