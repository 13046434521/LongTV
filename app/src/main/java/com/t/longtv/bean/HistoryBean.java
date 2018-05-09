package com.t.longtv.bean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/1 12:55
 * 描述：
 */
public class HistoryBean {

    /**
     * code : 100
     * status : 1
     * message : 处理成功
     * data : [{"cid":"237","room_number":"237","is_auto_vod":"no","is_conmic":0,"is_pk":0,"gid":"23","views":"3.02万","channel":"落日的直播日常","is_live":"1","headimg":"https://static.huomao.com/upload/web/images/headimgs/d7d24e55537bac15a676684507b3beac/2016072623571989_normal.jpeg","img":"https://static.huomao.com/upload/web/images/channel/2017/35/20170901153858x4vqPmaX.jpg","username":"小落日","gname":"DOTA2","time":1525149464,"type":1,"screenType":1,"time_text":"5分钟前"}]
     * invalid : false
     * timeStamp : 1525149783
     */

    private String code;
    private int status;
    private String message;
    private boolean invalid;
    private int timeStamp;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * cid : 237
         * room_number : 237
         * is_auto_vod : no
         * is_conmic : 0
         * is_pk : 0
         * gid : 23
         * views : 3.02万
         * channel : 落日的直播日常
         * is_live : 1
         * headimg : https://static.huomao.com/upload/web/images/headimgs/d7d24e55537bac15a676684507b3beac/2016072623571989_normal.jpeg
         * img : https://static.huomao.com/upload/web/images/channel/2017/35/20170901153858x4vqPmaX.jpg
         * username : 小落日
         * gname : DOTA2
         * time : 1525149464
         * type : 1
         * screenType : 1
         * time_text : 5分钟前
         */

        private String gid;
        private String views;
        private String channel;
        private String is_live;
        private String headimg;
        private String img;
        private String username;
        private String gname;
        private int time;
        private int type;
        private int screenType;
        private String time_text;

        public String getGid() {
            return gid;
        }

        public void setGid(String gid) {
            this.gid = gid;
        }

        public String getViews() {
            return views;
        }

        public void setViews(String views) {
            this.views = views;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getIs_live() {
            return is_live;
        }

        public void setIs_live(String is_live) {
            this.is_live = is_live;
        }

        public String getHeadimg() {
            return headimg;
        }

        public void setHeadimg(String headimg) {
            this.headimg = headimg;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getGname() {
            return gname;
        }

        public void setGname(String gname) {
            this.gname = gname;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getScreenType() {
            return screenType;
        }

        public void setScreenType(int screenType) {
            this.screenType = screenType;
        }

        public String getTime_text() {
            return time_text;
        }

        public void setTime_text(String time_text) {
            this.time_text = time_text;
        }
    }
}
