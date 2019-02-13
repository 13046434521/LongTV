package com.t.longtv.bean;

import android.support.annotation.DrawableRes;

/**
 * 作者：龙昊
 * 日期：2018/4/24 02:41
 * 描述：
 */
public class MineBean {
    private  int res;
    private String content;
    private int status;
    private String url;
    private String icon;
    private String weight;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public MineBean(@DrawableRes int res, String content, int status){
        this.res=res;
        this.content=content;
        this.status=status;
    }

    public MineBean(){
    }
    
    public int getRes() {
        return res;
    }

    public void setRes(@DrawableRes int res) {
        this.res = res;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
