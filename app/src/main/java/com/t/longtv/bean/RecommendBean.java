package com.t.longtv.bean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/15 16:11
 * 描述：推荐Bean
 */
public class RecommendBean {

    /**
     * code : 100
     * status : true
     * message : 处理成功
     * data : [{"id":"","type":3,"icon":"https://www.huomao.com/static/api/images/public/rec_icon/hotlive.png","is_square":0,"name":"热门直播","data":[{"type":1,"screenType":2,"is_live":1,"channel":"解说DPL季后赛 IG-NEWBEE","image":"https://static.huomao.com/upload/web/images/channel/2018/04/20180126155147KvkA41re.jpg","views":"15.10万","nickname":"Burning徐志雷","id":"12095","cid":"12095","labelname":"电竞男神","listcolor":"#FF9900","labelArr":{"left":{"type":1,"show_img":"","labelname":"电竞男神","listcolor":"#FF9900"},"right":{}}}]}]
     * invalid : false
     * timeStamp : 1524301493
     */

    private String code;
    private boolean status;
    private String message;
    private boolean invalid;
    private int timeStamp;
    private List<DataBeanX> data;

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

    public List<DataBeanX> getData() {
        return data;
    }

    public void setData(List<DataBeanX> data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * id :
         * type : 3
         * icon : https://www.huomao.com/static/api/images/public/rec_icon/hotlive.png
         * is_square : 0
         * name : 热门直播
         * data : [{"type":1,"screenType":2,"is_live":1,"channel":"解说DPL季后赛 IG-NEWBEE","image":"https://static.huomao.com/upload/web/images/channel/2018/04/20180126155147KvkA41re.jpg","views":"15.10万","nickname":"Burning徐志雷","id":"12095","cid":"12095","labelname":"电竞男神","listcolor":"#FF9900","labelArr":{"left":{"type":1,"show_img":"","labelname":"电竞男神","listcolor":"#FF9900"},"right":{}}}]
         */

        private String id;
        private int type;
        private String icon;
        private int is_square;
        private String name;
        private List<DataBean> data;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getIs_square() {
            return is_square;
        }

        public void setIs_square(int is_square) {
            this.is_square = is_square;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * type : 1
             * screenType : 2
             * is_live : 1
             * channel : 解说DPL季后赛 IG-NEWBEE
             * image : https://static.huomao.com/upload/web/images/channel/2018/04/20180126155147KvkA41re.jpg
             * views : 15.10万
             * nickname : Burning徐志雷
             * id : 12095
             * cid : 12095
             * labelname : 电竞男神
             * listcolor : #FF9900
             * labelArr : {"left":{"type":1,"show_img":"","labelname":"电竞男神","listcolor":"#FF9900"},"right":{}}
             */

            private int type;
            private int screenType;
            private int is_live;
            private String channel;
            private String image;
            private String views;
            private String nickname;
            private String id;
            private String cid;
            private String labelname;
            private String listcolor;
            private LabelArrBean labelArr;

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

            public int getIs_live() {
                return is_live;
            }

            public void setIs_live(int is_live) {
                this.is_live = is_live;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getViews() {
                return views;
            }

            public void setViews(String views) {
                this.views = views;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getLabelname() {
                return labelname;
            }

            public void setLabelname(String labelname) {
                this.labelname = labelname;
            }

            public String getListcolor() {
                return listcolor;
            }

            public void setListcolor(String listcolor) {
                this.listcolor = listcolor;
            }

            public LabelArrBean getLabelArr() {
                return labelArr;
            }

            public void setLabelArr(LabelArrBean labelArr) {
                this.labelArr = labelArr;
            }

            public static class LabelArrBean {
                /**
                 * left : {"type":1,"show_img":"","labelname":"电竞男神","listcolor":"#FF9900"}
                 * right : {}
                 */

                private LeftBean left;
                private RightBean right;

                public LeftBean getLeft() {
                    return left;
                }

                public void setLeft(LeftBean left) {
                    this.left = left;
                }

                public RightBean getRight() {
                    return right;
                }

                public void setRight(RightBean right) {
                    this.right = right;
                }

                public static class LeftBean {
                    /**
                     * type : 2
                     * show_img : https://static.huomao.com/upload/web/images/game/20180124104402poSQ4xl1.png
                     * labelname : 抽奖中
                     * listcolor : #666666
                     */

                    private int type;
                    private String show_img;
                    private String labelname;
                    private String listcolor;

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public String getShow_img() {
                        return show_img;
                    }

                    public void setShow_img(String show_img) {
                        this.show_img = show_img;
                    }

                    public String getLabelname() {
                        return labelname;
                    }

                    public void setLabelname(String labelname) {
                        this.labelname = labelname;
                    }

                    public String getListcolor() {
                        return listcolor;
                    }

                    public void setListcolor(String listcolor) {
                        this.listcolor = listcolor;
                    }
                }

                public static class RightBean {
                }
            }
        }
    }
}
