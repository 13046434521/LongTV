package com.t.longtv.bean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/3 14:25
 * 描述：
 */
public class TaskBean {

    /**
     * code : 150
     * status : 1
     * message : 获取成功
     * data : [{"times":0,"lastdotime":0,"is_get":0,"is_open":true,"tid":4,"name":"参与聊天","alltimes":3,"type":"day","credits":20,"buttonTxt":"去聊天","description":"在聊天室中发言3次，即可获得奖励","doway":"floatup","linkurl":"","complete_stat":"no","icon":"https://www.huomao.com/static/api/images/public/task_icon/task_10_new.png"},{"times":0,"lastdotime":0,"is_get":0,"is_open":true,"tid":5,"name":"赠送仙豆","alltimes":2,"type":"day","credits":20,"buttonTxt":"去赠送","description":"赠送2次仙豆，即可领取奖励","doway":"floatup","linkurl":"","complete_stat":"no","icon":"https://www.huomao.com/static/api/images/public/task_icon/task_12_new.png"},{"times":0,"lastdotime":0,"is_get":0,"is_open":true,"tid":6,"name":"订阅主播","alltimes":2,"type":"day","credits":20,"buttonTxt":"去订阅","description":"成功订阅2位主播，即可领取奖励","doway":"floatup","linkurl":"","complete_stat":"no","icon":"https://www.huomao.com/static/api/images/public/task_icon/task_14_new.png"},{"name":"每日签到","tid":100,"is_get":1,"complete_stat":"yes","icon":"https://www.huomao.com/static/api/images/public/task_icon/task_18_new.png"}]
     * invalid : false
     * timeStamp : 1525328608
     * text : 今日还可领取60仙豆
     */

    private String code;
    private int status;
    private String message;
    private boolean invalid;
    private int timeStamp;
    private String text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * times : 0
         * lastdotime : 0
         * is_get : 0
         * is_open : true
         * tid : 4
         * name : 参与聊天
         * alltimes : 3
         * type : day
         * credits : 20
         * buttonTxt : 去聊天
         * description : 在聊天室中发言3次，即可获得奖励
         * doway : floatup
         * linkurl :
         * complete_stat : no
         * icon : https://www.huomao.com/static/api/images/public/task_icon/task_10_new.png
         */

        private int times;
        private int lastdotime;
        private int is_get;
        private boolean is_open;
        private int tid;
        private String name;
        private int alltimes;
        private String type;
        private int credits;
        private String buttonTxt;
        private String description;
        private String doway;
        private String linkurl;
        private String complete_stat;
        private String icon;

        public int getTimes() {
            return times;
        }

        public void setTimes(int times) {
            this.times = times;
        }

        public int getLastdotime() {
            return lastdotime;
        }

        public void setLastdotime(int lastdotime) {
            this.lastdotime = lastdotime;
        }

        public int getIs_get() {
            return is_get;
        }

        public void setIs_get(int is_get) {
            this.is_get = is_get;
        }

        public boolean isIs_open() {
            return is_open;
        }

        public void setIs_open(boolean is_open) {
            this.is_open = is_open;
        }

        public int getTid() {
            return tid;
        }

        public void setTid(int tid) {
            this.tid = tid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAlltimes() {
            return alltimes;
        }

        public void setAlltimes(int alltimes) {
            this.alltimes = alltimes;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getCredits() {
            return credits;
        }

        public void setCredits(int credits) {
            this.credits = credits;
        }

        public String getButtonTxt() {
            return buttonTxt;
        }

        public void setButtonTxt(String buttonTxt) {
            this.buttonTxt = buttonTxt;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDoway() {
            return doway;
        }

        public void setDoway(String doway) {
            this.doway = doway;
        }

        public String getLinkurl() {
            return linkurl;
        }

        public void setLinkurl(String linkurl) {
            this.linkurl = linkurl;
        }

        public String getComplete_stat() {
            return complete_stat;
        }

        public void setComplete_stat(String complete_stat) {
            this.complete_stat = complete_stat;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
