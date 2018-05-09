package com.t.longtv.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：龙昊
 * 日期：2018/5/7 16:02
 * 描述：
 */
@Entity
public class QmTitleBean {
    private String QMTitle;
    @Id(autoincrement = true)
    private long _id;
    @Generated(hash = 1863574356)
    public QmTitleBean(String QMTitle, long _id) {
        this.QMTitle = QMTitle;
        this._id = _id;
    }
    @Generated(hash = 143033547)
    public QmTitleBean() {
    }
    public String getQMTitle() {
        return this.QMTitle;
    }
    public void setQMTitle(String QMTitle) {
        this.QMTitle = QMTitle;
    }
    public long get_id() {
        return this._id;
    }
    public void set_id(long _id) {
        this._id = _id;
    }

}
