package com.t.longtv.bean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/16 17:01
 * 描述：
 */
public class ParkBean {

    /**
     * code : 100
     * status : true
     * message : 处理成功
     * data : [{"id":"214","title":"游乐场","url":"http://www.huomao.com/active/carnietab?content=5$3$2","more_version":"","less_version":""}]
     * invalid : false
     * timeStamp : 1523869226
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
         * id : 214
         * title : 游乐场
         * url : http://www.huomao.com/active/carnietab?content=5$3$2
         * more_version :
         * less_version :
         */

        private String id;
        private String title;
        private String url;
        private String more_version;
        private String less_version;

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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMore_version() {
            return more_version;
        }

        public void setMore_version(String more_version) {
            this.more_version = more_version;
        }

        public String getLess_version() {
            return less_version;
        }

        public void setLess_version(String less_version) {
            this.less_version = less_version;
        }
    }
}
