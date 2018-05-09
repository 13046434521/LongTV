package com.t.longtv.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * 作者：龙昊
 * 日期：2018/4/26 17:33
 * 描述：
 */
@Entity
public class UserLoginBean {

    /**
     * code : 100
     * status : 1
     * message : 登录成功！
     * invalid : false
     * timeStamp : 1524735129
     * mobile : 13402517521
     * uid : 13480061
     * loginType : mobile
     * access_token : e2b302c97e214c46fa6f353463ec1caa
     * expires_time : 1524735129
     * verity_token : 3664a99ac26a7c7440466ec5da7460da
     */

    private String code;
    private int status;
    private String message;
    private boolean invalid;
    private int timeStamp;
    private String mobile;
    private int uid;
    private String loginType;
    private String access_token;
    private int expires_time;
    private String verity_token;
    @Id(autoincrement = true)
    private long _id;
    @Generated(hash = 1301793819)
    public UserLoginBean(String code, int status, String message, boolean invalid,
            int timeStamp, String mobile, int uid, String loginType,
            String access_token, int expires_time, String verity_token, long _id) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.invalid = invalid;
        this.timeStamp = timeStamp;
        this.mobile = mobile;
        this.uid = uid;
        this.loginType = loginType;
        this.access_token = access_token;
        this.expires_time = expires_time;
        this.verity_token = verity_token;
        this._id = _id;
    }
    @Generated(hash = 751593366)
    public UserLoginBean() {
    }
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public int getStatus() {
        return this.status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMessage() {
        return this.message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean getInvalid() {
        return this.invalid;
    }
    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }
    public int getTimeStamp() {
        return this.timeStamp;
    }
    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getMobile() {
        return this.mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public int getUid() {
        return this.uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getLoginType() {
        return this.loginType;
    }
    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }
    public String getAccess_token() {
        return this.access_token;
    }
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
    public int getExpires_time() {
        return this.expires_time;
    }
    public void setExpires_time(int expires_time) {
        this.expires_time = expires_time;
    }
    public String getVerity_token() {
        return this.verity_token;
    }
    public void setVerity_token(String verity_token) {
        this.verity_token = verity_token;
    }
    public long get_id() {
        return this._id;
    }
    public void set_id(long _id) {
        this._id = _id;
    }
}
