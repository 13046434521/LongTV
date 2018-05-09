package com.t.longtv.bean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/24 16:13
 * 描述：MineGride数据Bean
 */
public class MineModuleBean {

    /**
     * code : 100
     * status : true
     * message : 处理成功
     * data : [{"id":"1","url":"","name":"我的粉丝牌","type":"1","weight":"10","icon":""},{"id":"2","url":"","name":"我的徽章","type":"1","weight":"9","icon":""},{"id":"3","url":"","name":"免流量","type":"1","weight":"8","icon":""},{"id":"4","url":"http://www.huomao.com/mobile/tvDetail","name":"火猫TV版","type":"1","weight":"7","icon":""},{"id":"6","url":"","name":"帮助反馈","type":"1","weight":"5","icon":""},{"id":"5","url":"","name":"联系客服","type":"1","weight":"4","icon":""},{"id":"7","url":"http://a.app.qq.com/o/simple.jsp?pkgname=com.huomaotv.livepush","name":"我要开播","type":"1","weight":"3","icon":""}]
     * invalid : false
     * timeStamp : 1524557522
     */

    private String code;
    private boolean status;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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
         * id : 1
         * url :
         * name : 我的粉丝牌
         * type : 1
         * weight : 10
         * icon :
         */

        private String id;
        private String url;
        private String name;
        private String type;
        private String weight;
        private String icon;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
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
    }
}
