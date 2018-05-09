package com.t.longtv.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：龙昊
 * 日期：2018/5/8 10:39
 * 描述：
 */
@Entity
public class HMTitleBean {
    private String HmGameName;
    private String image;
    private String gid;
    @Generated(hash = 2144537202)
    public HMTitleBean(String HmGameName, String image, String gid) {
        this.HmGameName = HmGameName;
        this.image = image;
        this.gid = gid;
    }
    public HMTitleBean( HmChannenBean.DataBean.SubBean subBean) {
        this.HmGameName = subBean.getCname();
        this.image = subBean.getImages();
        this.gid = subBean.getGid();

    }
    @Generated(hash = 1716814781)
    public HMTitleBean() {
    }
    public String getHmGameName() {
        return this.HmGameName;
    }
    public void setHmGameName(String HmGameName) {
        this.HmGameName = HmGameName;
    }
    public String getImage() {
        return this.image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getGid() {
        return this.gid;
    }
    public void setGid(String gid) {
        this.gid = gid;
    }
}
