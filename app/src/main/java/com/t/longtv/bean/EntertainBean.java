package com.t.longtv.bean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/23 11:30
 * 描述：
 */
public class EntertainBean {

    /**
     * code : 100
     * status : 1
     * message : 处理成功
     * data : {"allCount":1778,"list":[{"id":"8952","cid":"8952","is_conmic":0,"is_pk":0,"channel":"晚上好","gid":"32","uid":"831091","img":"https://static.huomao.com/upload/web/images/channels/20bb5021de2d9d0460bb66cf82e67279/e71ca73df77c5f6b2b834158f90a6943.jpg?cache=1524453900","username":"candy小滴滴","is_live":0,"views":"40","headimg":"https://static.huomao.com/upload/web/images/headimgs/c0247434b23e61e16c6bd7e738c77812/20171016052445257_normal.jpg","gname":"娱乐星秀","game_url_rule":"ylxx","square":"https://static.huomao.com/upload/web/images/channels/20bb5021de2d9d0460bb66cf82e67279/6f0aed9e369ad5bc9205fdaa0b54891d.jpg?cache=1524453900","type":2,"screenType":2,"labelname":"月榜第二","listcolor":"#666666","labelArr":{"left":{"type":2,"show_img":"https://static.huomao.com/upload/web/images/game/20170818140352VN0h1tRS.png","labelname":"月榜第二","listcolor":"#666666"},"right":{}}}],"allPage":89}
     * invalid : false
     * timeStamp : 1524453935
     * is_square : false
     */

    private int code;
    private int status;
    private String message;
    private DataXBean data;
    private boolean invalid;
    private int timeStamp;
    private boolean is_square;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

    public DataXBean getData() {
        return data;
    }

    public void setData(DataXBean data) {
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

    public boolean isIs_square() {
        return is_square;
    }

    public void setIs_square(boolean is_square) {
        this.is_square = is_square;
    }

    public static class DataXBean {
        /**
         * allCount : 1778
         * list : [{"id":"8952","cid":"8952","is_conmic":0,"is_pk":0,"channel":"晚上好","gid":"32","uid":"831091","img":"https://static.huomao.com/upload/web/images/channels/20bb5021de2d9d0460bb66cf82e67279/e71ca73df77c5f6b2b834158f90a6943.jpg?cache=1524453900","username":"candy小滴滴","is_live":0,"views":"40","headimg":"https://static.huomao.com/upload/web/images/headimgs/c0247434b23e61e16c6bd7e738c77812/20171016052445257_normal.jpg","gname":"娱乐星秀","game_url_rule":"ylxx","square":"https://static.huomao.com/upload/web/images/channels/20bb5021de2d9d0460bb66cf82e67279/6f0aed9e369ad5bc9205fdaa0b54891d.jpg?cache=1524453900","type":2,"screenType":2,"labelname":"月榜第二","listcolor":"#666666","labelArr":{"left":{"type":2,"show_img":"https://static.huomao.com/upload/web/images/game/20170818140352VN0h1tRS.png","labelname":"月榜第二","listcolor":"#666666"},"right":{}}}]
         * allPage : 89
         */

        private int allCount;
        private int allPage;
        private List<ListBean> list;

        public int getAllCount() {
            return allCount;
        }

        public void setAllCount(int allCount) {
            this.allCount = allCount;
        }

        public int getAllPage() {
            return allPage;
        }

        public void setAllPage(int allPage) {
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
             * id : 8952
             * cid : 8952
             * is_conmic : 0
             * is_pk : 0
             * channel : 晚上好
             * gid : 32
             * uid : 831091
             * img : https://static.huomao.com/upload/web/images/channels/20bb5021de2d9d0460bb66cf82e67279/e71ca73df77c5f6b2b834158f90a6943.jpg?cache=1524453900
             * username : candy小滴滴
             * is_live : 0
             * views : 40
             * headimg : https://static.huomao.com/upload/web/images/headimgs/c0247434b23e61e16c6bd7e738c77812/20171016052445257_normal.jpg
             * gname : 娱乐星秀
             * game_url_rule : ylxx
             * square : https://static.huomao.com/upload/web/images/channels/20bb5021de2d9d0460bb66cf82e67279/6f0aed9e369ad5bc9205fdaa0b54891d.jpg?cache=1524453900
             * type : 2
             * screenType : 2
             * labelname : 月榜第二
             * listcolor : #666666
             * labelArr : {"left":{"type":2,"show_img":"https://static.huomao.com/upload/web/images/game/20170818140352VN0h1tRS.png","labelname":"月榜第二","listcolor":"#666666"},"right":{}}
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
            private String square;
            private int type;
            private int screenType;
            private String labelname;
            private String listcolor;
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

            public String getSquare() {
                return square;
            }

            public void setSquare(String square) {
                this.square = square;
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
                 * left : {"type":2,"show_img":"https://static.huomao.com/upload/web/images/game/20170818140352VN0h1tRS.png","labelname":"月榜第二","listcolor":"#666666"}
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
                     * show_img : https://static.huomao.com/upload/web/images/game/20170818140352VN0h1tRS.png
                     * labelname : 月榜第二
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
