package com.t.longtv.bean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/24 16:19
 * 描述：
 */
public class UserinfoAdBean {

    /**
     * code : 100
     * status : true
     * message : 处理成功
     * data : {"top":[{"id":"3426","title":"快乐农场  赢百万猫豆","link":"http://www.huomao.com/mobile/happyFarm","img_url":"http://www.huomao.com/mobile/happyFarm","image_url":"https://static.huomao.com/upload/web/images/hm/20171212191426GEjSbk59.png","mobile_title":"快乐农场  赢百万猫豆","order":"99","is_channel":0}],"middle":[],"bottom":[]}
     * invalid : false
     * timeStamp : 1524557879
     */

    private String code;
    private boolean status;
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

    public static class DataBean {
        private List<TopBean> top;
        private List<?> middle;
        private List<?> bottom;

        public List<TopBean> getTop() {
            return top;
        }

        public void setTop(List<TopBean> top) {
            this.top = top;
        }

        public List<?> getMiddle() {
            return middle;
        }

        public void setMiddle(List<?> middle) {
            this.middle = middle;
        }

        public List<?> getBottom() {
            return bottom;
        }

        public void setBottom(List<?> bottom) {
            this.bottom = bottom;
        }

        public static class TopBean {
            /**
             * id : 3426
             * title : 快乐农场  赢百万猫豆
             * link : http://www.huomao.com/mobile/happyFarm
             * img_url : http://www.huomao.com/mobile/happyFarm
             * image_url : https://static.huomao.com/upload/web/images/hm/20171212191426GEjSbk59.png
             * mobile_title : 快乐农场  赢百万猫豆
             * order : 99
             * is_channel : 0
             */

            private String id;
            private String title;
            private String link;
            private String img_url;
            private String image_url;
            private String mobile_title;
            private String order;
            private int is_channel;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getMobile_title() {
                return mobile_title;
            }

            public void setMobile_title(String mobile_title) {
                this.mobile_title = mobile_title;
            }

            public String getOrder() {
                return order;
            }

            public void setOrder(String order) {
                this.order = order;
            }

            public int getIs_channel() {
                return is_channel;
            }

            public void setIs_channel(int is_channel) {
                this.is_channel = is_channel;
            }
        }
    }
}
