package com.t.longtv.bean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/21 15:51
 * 描述：
 */
public class BannerBean {

    /**
     * code : 100
     * status : 1
     * message : 处理成功
     * data : [{"id":"4346","image":"https://static.huomao.com/upload/web/images/hm/20180420142214Her1SzT7.png","mobile_title":"","img_url":"10519","img_title":"DPL中国DOTA2职业联赛顶级联赛","order":"95","seat":"0","room_number":"10519","is_channel":1,"type":1,"screenType":0},{"id":"4319","image":"https://static.huomao.com/upload/web/images/hm/20180418210805U8GyX4fz.jpg","mobile_title":"","img_url":"22611","img_title":"单排王小九九","order":"60","seat":"0","room_number":"771055","is_channel":1,"type":1,"screenType":0},{"id":"2197","image":"https://static.huomao.com/upload/web/images/hm/20171129093922SE47UGTv.jpg","mobile_title":"","img_url":"18211","img_title":"兔司机","order":"55","seat":"0","room_number":"466250","is_channel":1,"type":1,"screenType":2},{"id":"3692","image":"https://static.huomao.com/upload/web/images/hm/20171222184914z4fqdETJ.jpg","mobile_title":"","img_url":"11614","img_title":"声优橙子","order":"50","seat":"0","room_number":"11614","is_channel":1,"type":1,"screenType":2},{"id":"908","image":"https://static.huomao.com/upload/web/images/hm/20170417144248xiLjNSgn.jpg","mobile_title":"","img_url":"5339","img_title":"网瘾少女！","order":"42","seat":"0","room_number":"5339","is_channel":1,"type":1,"screenType":0}]
     * invalid : false
     * timeStamp : 1524297025
     * TimeLimit : 180
     */

    private String code;
    private int status;
    private String message;
    private boolean invalid;
    private int timeStamp;
    private int TimeLimit;
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

    public int getTimeLimit() {
        return TimeLimit;
    }

    public void setTimeLimit(int TimeLimit) {
        this.TimeLimit = TimeLimit;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 4346
         * image : https://static.huomao.com/upload/web/images/hm/20180420142214Her1SzT7.png
         * mobile_title :
         * img_url : 10519
         * img_title : DPL中国DOTA2职业联赛顶级联赛
         * order : 95
         * seat : 0
         * room_number : 10519
         * is_channel : 1
         * type : 1
         * screenType : 0
         */

        private String id;
        private String image;
        private String mobile_title;
        private String img_url;
        private String img_title;
        private String order;
        private String seat;
        private String room_number;
        private int is_channel;
        private int type;
        private int screenType;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getMobile_title() {
            return mobile_title;
        }

        public void setMobile_title(String mobile_title) {
            this.mobile_title = mobile_title;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public String getImg_title() {
            return img_title;
        }

        public void setImg_title(String img_title) {
            this.img_title = img_title;
        }

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public String getSeat() {
            return seat;
        }

        public void setSeat(String seat) {
            this.seat = seat;
        }

        public String getRoom_number() {
            return room_number;
        }

        public void setRoom_number(String room_number) {
            this.room_number = room_number;
        }

        public int getIs_channel() {
            return is_channel;
        }

        public void setIs_channel(int is_channel) {
            this.is_channel = is_channel;
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
    }
}
