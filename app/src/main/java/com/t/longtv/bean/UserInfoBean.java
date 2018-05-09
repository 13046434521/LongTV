package com.t.longtv.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 作者：龙昊
 * 日期：2018/4/27 13:31
 * 描述：Mine用户数据
 */
public class UserInfoBean {

    /**
     * code : 100
     * status : 1
     * message : 处理成功
     * data : {"username":"龙昊","avatar":"https://static.huomao.com/upload/web/images/headimgs/d7d24e55537bac15a676684507b3beac/20160729182648949_normal.jpeg","user_acount":"https://static.huomao.com/upload/web/images/headimgs/d7d24e55537bac15a676684507b3beac/20160729182648949_normal.jpeg","uid":13480061,"email":"","mobile":"13402517521","name":"","anchor_experience":0,"money_one_get":"0","money_one":"0","money_two_get":"0","money_two":"0","stream_address":"","stream_url":"null","stream_url_cn":"null","poor":950,"level":15,"nextLv":{"lid":16,"name":"大猫4级","img":"https://www.huomao.com/static/web/images/normal_user_lv_imgs/u_lv3_4.png","user_experience":11080,"noimg":"https://www.huomao.com/static/web/images/next_user_lv_imgs/u_lv3_4.png"},"ye":1155}
     * invalid : false
     * timeStamp : 1524806930
     */

    private String code;
    private int status;
    private String message;
    private DataBean data;
    private boolean invalid;
    private int timeStamp;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public static class DataBean implements Parcelable{
        /**
         * username : 龙昊
         * avatar : https://static.huomao.com/upload/web/images/headimgs/d7d24e55537bac15a676684507b3beac/20160729182648949_normal.jpeg
         * user_acount : https://static.huomao.com/upload/web/images/headimgs/d7d24e55537bac15a676684507b3beac/20160729182648949_normal.jpeg
         * uid : 13480061
         * email :
         * mobile : 13402517521
         * name :
         * anchor_experience : 0
         * money_one_get : 0
         * money_one : 0
         * money_two_get : 0
         * money_two : 0
         * stream_address :
         * stream_url : null
         * stream_url_cn : null
         * poor : 950
         * level : 15
         * nextLv : {"lid":16,"name":"大猫4级","img":"https://www.huomao.com/static/web/images/normal_user_lv_imgs/u_lv3_4.png","user_experience":11080,"noimg":"https://www.huomao.com/static/web/images/next_user_lv_imgs/u_lv3_4.png"}
         * ye : 1155
         */

        private String username;
        private String avatar;
        private String user_acount;
        private int uid;
        private String email;
        private String mobile;
        private String name;
        private int anchor_experience;
        private String money_one_get;
        private String money_one;
        private String money_two_get;
        private String money_two;
        private String stream_address;
        private String stream_url;
        private String stream_url_cn;
        private int poor;
        private int level;
        private NextLvBean nextLv;
        private int ye;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getUser_acount() {
            return user_acount;
        }

        public void setUser_acount(String user_acount) {
            this.user_acount = user_acount;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAnchor_experience() {
            return anchor_experience;
        }

        public void setAnchor_experience(int anchor_experience) {
            this.anchor_experience = anchor_experience;
        }

        public String getMoney_one_get() {
            return money_one_get;
        }

        public void setMoney_one_get(String money_one_get) {
            this.money_one_get = money_one_get;
        }

        public String getMoney_one() {
            return money_one;
        }

        public void setMoney_one(String money_one) {
            this.money_one = money_one;
        }

        public String getMoney_two_get() {
            return money_two_get;
        }

        public void setMoney_two_get(String money_two_get) {
            this.money_two_get = money_two_get;
        }

        public String getMoney_two() {
            return money_two;
        }

        public void setMoney_two(String money_two) {
            this.money_two = money_two;
        }

        public String getStream_address() {
            return stream_address;
        }

        public void setStream_address(String stream_address) {
            this.stream_address = stream_address;
        }

        public String getStream_url() {
            return stream_url;
        }

        public void setStream_url(String stream_url) {
            this.stream_url = stream_url;
        }

        public String getStream_url_cn() {
            return stream_url_cn;
        }

        public void setStream_url_cn(String stream_url_cn) {
            this.stream_url_cn = stream_url_cn;
        }

        public int getPoor() {
            return poor;
        }

        public void setPoor(int poor) {
            this.poor = poor;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public NextLvBean getNextLv() {
            return nextLv;
        }

        public void setNextLv(NextLvBean nextLv) {
            this.nextLv = nextLv;
        }

        public int getYe() {
            return ye;
        }

        public void setYe(int ye) {
            this.ye = ye;
        }





        public static class NextLvBean {
            /**
             * lid : 16
             * name : 大猫4级
             * img : https://www.huomao.com/static/web/images/normal_user_lv_imgs/u_lv3_4.png
             * user_experience : 11080
             * noimg : https://www.huomao.com/static/web/images/next_user_lv_imgs/u_lv3_4.png
             */

            private int lid;
            private String name;
            private String img;
            private int user_experience;
            private String noimg;

            public int getLid() {
                return lid;
            }

            public void setLid(int lid) {
                this.lid = lid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public int getUser_experience() {
                return user_experience;
            }

            public void setUser_experience(int user_experience) {
                this.user_experience = user_experience;
            }

            public String getNoimg() {
                return noimg;
            }

            public void setNoimg(String noimg) {
                this.noimg = noimg;
            }
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.username);
            dest.writeString(this.avatar);
            dest.writeString(this.user_acount);
            dest.writeInt(this.uid);
            dest.writeString(this.email);
            dest.writeString(this.mobile);
            dest.writeString(this.name);
            dest.writeInt(this.anchor_experience);
            dest.writeString(this.money_one_get);
            dest.writeString(this.money_one);
            dest.writeString(this.money_two_get);
            dest.writeString(this.money_two);
            dest.writeString(this.stream_address);
            dest.writeString(this.stream_url);
            dest.writeString(this.stream_url_cn);
            dest.writeInt(this.poor);
            dest.writeInt(this.level);
            dest.writeInt(this.ye);
        }

        protected DataBean(Parcel in) {
            this.username = in.readString();
            this.avatar = in.readString();
            this.user_acount = in.readString();
            this.uid = in.readInt();
            this.email = in.readString();
            this.mobile = in.readString();
            this.name = in.readString();
            this.anchor_experience = in.readInt();
            this.money_one_get = in.readString();
            this.money_one = in.readString();
            this.money_two_get = in.readString();
            this.money_two = in.readString();
            this.stream_address = in.readString();
            this.stream_url = in.readString();
            this.stream_url_cn = in.readString();
            this.poor = in.readInt();
            this.level = in.readInt();
            this.nextLv = in.readParcelable(NextLvBean.class.getClassLoader());
            this.ye = in.readInt();
        }

        public static final Creator<DataBean> CREATOR = new Creator<DataBean>() {
            @Override
            public DataBean createFromParcel(Parcel source) {
                return new DataBean(source);
            }

            @Override
            public DataBean[] newArray(int size) {
                return new DataBean[size];
            }
        };
    }
}
