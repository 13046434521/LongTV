package com.t.longtv.bean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/15 16:14
 * 描述：直播Bean
 */
public class LiveBean {

    /**
     * code : 100
     * status : 1
     * message : 澶勭悊鎴愬姛
     * data : {"allCount":21773,"list":[{"id":"12392","cid":"12392","is_conmic":0,"is_pk":0,"channel":"銆愭矆閿呫�戠兢鍐�10浜洪粦濂栧姳璧�","gid":"20","uid":"603902","img":"https://livepic.huomao.com/12392/i_10.jpg?1523780100","username":"纭眽鏈鸿溅鍙�","is_live":1,"views":"10.51涓�","headimg":"https://static.huomao.com/upload/web/images/headimgs/9fe2adc546a3100d11e55fd3dbda351d/20160804223002674_normal.jpeg","gname":"CS:GO","game_url_rule":"CSGO","type":1,"screenType":2,"labelArr":{"left":{},"right":{}}}],"allPage":1089}
     * invalid : false
     * timeStamp : 1523780496
     * is_square : false
     */

    private int code;
    private int status;
    private String message;
    private DataBean data;
    private boolean invalid;
    private int timeStamp;
    private boolean is_square;


    /**
     * data : {"allCount":21773,"list":[{"id":"12392","cid":"12392","is_conmic":0,"is_pk":0,"channel":"銆愭矆閿呫�戠兢鍐�10浜洪粦濂栧姳璧�","gid":"20","uid":"603902","img":"https://livepic.huomao.com/12392/i_10.jpg?1523780100","username":"纭眽鏈鸿溅鍙�","is_live":1,"views":"10.51涓�","headimg":"https://static.huomao.com/upload/web/images/headimgs/9fe2adc546a3100d11e55fd3dbda351d/20160804223002674_normal.jpeg","gname":"CS:GO","game_url_rule":"CSGO","type":1,"screenType":2}],"allPage":""}
     */


    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * allCount : 21773
         * list : [{"id":"12392","cid":"12392","is_conmic":0,"is_pk":0,"channel":"銆愭矆閿呫�戠兢鍐�10浜洪粦濂栧姳璧�","gid":"20","uid":"603902","img":"https://livepic.huomao.com/12392/i_10.jpg?1523780100","username":"纭眽鏈鸿溅鍙�","is_live":1,"views":"10.51涓�","headimg":"https://static.huomao.com/upload/web/images/headimgs/9fe2adc546a3100d11e55fd3dbda351d/20160804223002674_normal.jpeg","gname":"CS:GO","game_url_rule":"CSGO","type":1,"screenType":2}]
         * allPage :
         */

        private int allCount;
        private String allPage;
        private List<ListBean> list;

        public int getAllCount() {
            return allCount;
        }

        public void setAllCount(int allCount) {
            this.allCount = allCount;
        }

        public String getAllPage() {
            return allPage;
        }

        public void setAllPage(String allPage) {
            this.allPage = allPage;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : 12392
             * cid : 12392
             * is_conmic : 0
             * is_pk : 0
             * channel : 銆愭矆閿呫�戠兢鍐�10浜洪粦濂栧姳璧�
             * gid : 20
             * uid : 603902
             * img : https://livepic.huomao.com/12392/i_10.jpg?1523780100
             * username : 纭眽鏈鸿溅鍙�
             * is_live : 1
             * views : 10.51涓�
             * headimg : https://static.huomao.com/upload/web/images/headimgs/9fe2adc546a3100d11e55fd3dbda351d/20160804223002674_normal.jpeg
             * gname : CS:GO
             * game_url_rule : CSGO
             * type : 1
             * screenType : 2
             */

            private String id;
            private String cid;
            private int is_conmic;
            private int is_pk;
            private String channel;
            private String gid;
            private String uid;
            private String img;
            private String username;
            private int is_live;
            private String views;
            private String headimg;
            private String gname;
            private String game_url_rule;
            private int type;
            private int screenType;
            /**
             * labelArr : {"left":{"type":2,"show_img":"https://static.huomao.com/upload/web/images/game/20180124104402poSQ4xl1.png","labelname":"抽奖中","listcolor":"#666666"},"right":{}}
             */

            private LabelArrBean labelArr;

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

            public int getIs_conmic() {
                return is_conmic;
            }

            public void setIs_conmic(int is_conmic) {
                this.is_conmic = is_conmic;
            }

            public int getIs_pk() {
                return is_pk;
            }

            public void setIs_pk(int is_pk) {
                this.is_pk = is_pk;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getGid() {
                return gid;
            }

            public void setGid(String gid) {
                this.gid = gid;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
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

            public int getIs_live() {
                return is_live;
            }

            public void setIs_live(int is_live) {
                this.is_live = is_live;
            }

            public String getViews() {
                return views;
            }

            public void setViews(String views) {
                this.views = views;
            }

            public String getHeadimg() {
                return headimg;
            }

            public void setHeadimg(String headimg) {
                this.headimg = headimg;
            }

            public String getGname() {
                return gname;
            }

            public void setGname(String gname) {
                this.gname = gname;
            }

            public String getGame_url_rule() {
                return game_url_rule;
            }

            public void setGame_url_rule(String game_url_rule) {
                this.game_url_rule = game_url_rule;
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

            public LabelArrBean getLabelArr() {
                return labelArr;
            }

            public void setLabelArr(LabelArrBean labelArr) {
                this.labelArr = labelArr;
            }

            public static class LabelArrBean {

                /**
                 * left : {"type":2,"show_img":"https://static.huomao.com/upload/web/images/game/20180124104402poSQ4xl1.png","labelname":"抽奖中","listcolor":"#666666"}
                 */

                private LeftBean left;

                public LeftBean getLeft() {
                    return left;
                }

                public void setLeft(LeftBean left) {
                    this.left = left;
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
            }
        }
    }
}
