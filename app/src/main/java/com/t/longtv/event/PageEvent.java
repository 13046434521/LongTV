package com.t.longtv.event;

import android.os.Bundle;
import android.os.Parcelable;

/**
 * 作者：龙昊
 * 日期：2018/4/26 21:32
 * 描述：页面跳转Event
 */
public class PageEvent {
    private String path;
    private Bundle bundle;
    private Parcelable parcelable;

    public PageEvent(String path, Parcelable parcelable) {
        this.path = path;
        this.parcelable = parcelable;
    }

    public Parcelable getParcelable() {
        return parcelable;
    }

    public void setParcelable(Parcelable parcelable) {
        this.parcelable = parcelable;
    }

    public PageEvent(String path, Bundle bundle) {
        this.path = path;
        this.bundle = bundle;
    }

    public Bundle getBundle() {
        return bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public PageEvent(String path){
        this.path=path;
    }
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
