package com.t.longtv.bean;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/20 11:50
 * 描述：
 */
public class LiveDetailBean {

    /**
     * code : 100
     * status : 1
     * message : 处理成功
     * data : {"views":10848,"is_tuijian":"1","is_entertainment":"no","is_sub":"0","username":"何庸","is_live":1,"id":1882,"cid":"1882","is_gf":"0","uid":218148,"content":"\r\n\t从你的全世界路过。我是，何庸。 \r\n\r\n\r\n\t我的直播间左下角： \r\n\r\n\r\n\t火猫饰品竞猜，安全，稳定，何庸邀请你来当预测之王！ \r\n\r\n\r\n\t链接：huomao.com/yc/1882\r\n \r\n\r\n\r\n\t \r\n\r\n\r\n\t微信公众号：电竞美学 \r\n\r\n\r\n\t \r\n\r\n\r\n\t何庸公益群：533410978 （足球篮球实力预测） \r\n\r\n\r\n\t新浪微博：何庸 \r\n\r\n我是DOTA2解说\u2014\u2014何庸\r\nTi7 V社线上预选赛邀请解说\r\n2017 基辅特锦赛V社线上预选赛邀请解说\r\nMDL 2017夏季赛 线下解说\r\nMDL 2016秋季赛 线下解说\r\nDOPIT 5 火猫直播间线下解说\r\nMPGL 2016 火猫直播间线下解说\r\n个人QQ：403342690","channel":"GF-CG【何庸】","image":"https://livepic.huomao.com/1882/i_10.jpg?1524196500","room_number":"1882","gid":23,"tj_pic":"https://livepic.huomao.com/1882/i_10.jpg?1524196500","is_conmic":0,"stream":"XI/RT9KcyeOXaRNCC3g","headimg":"https://static.huomao.com/upload/web/images/headimgs/bb28bb7392741af90da1442728d236e0/20161015100450252_big.jpeg","desrc_count":144486,"gname":"DOTA2","type":1,"screenType":0,"freeCDN":0,"cdn_key":5,"cdn_count":8,"streamList":[{"TD":"http://live-tx-hdl.huomaotv.cn/live/8aimtu.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android","HD":"http://live-tx-hdl.huomaotv.cn/live/8aimtu_720.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android","SD":"http://live-tx-hdl.huomaotv.cn/live/8aimtu_480.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android","BD":"http://live-tx-hdl.huomaotv.cn/live/8aimtu.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android"}],"defaultBitRate":"HD","is_desrc":0,"manager":0,"experience":2869038,"is_guard":0,"bannerExist":0,"channelBanner":{"banner_url":"","banner_title":"活动","bannerid":"","banner_img":"","is_channel":0},"specialRoom":0,"is_notice":0,"noticeInfo":{},"isBeginGuess":0,"activeExist":1,"activeList":[{"id":"196","activename":"小冰冰传奇","typeArea":"1","gameVal":"星际争霸2,炉石传说,穿越火线,英雄联盟,DOTA2,FIFA Online3,娱乐星秀,格斗怀旧,魔兽世界,体育竞技,我的世界,赛事综合,手机游戏","labelVal":null,"starttime":"1520870400","endtime":"1678291200","roomNumbers":null,"opusername":"魏祥","imgUrl":"/upload/web/images/channel/6ca5a663c4a63b7407e7d3b1717bc4aa/20180330163703BjOfe6LY.png","url":"http://www.huomao.com/mobileformat/xxbcq.html","weight":"88","addtime":"1520922432","update_time":"1524016664","type":"3","anchorShow":"0","less_version":"","more_version":"","status":"1","isAdvert":"1","actPos":"1","h5url":"","is_event":"0","event_words":null,"is_channel":0}],"is_jingcai":0,"spjc_url":"https://www.huomao.com","spjc_title":"title","notice":"","qq_count":0,"is_videoPls":true,"is_smallGourd":true,"isExtraTab":false,"tabInfo":[],"stream_refresh":0,"channel_uid":"218148","credits_2_get_vip":2869038,"isChannelThirdAd":1}
     * invalid : false
     * timeStamp : 1524196768
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

    public static class DataBean {
        /**
         * views : 10848
         * is_tuijian : 1
         * is_entertainment : no
         * is_sub : 0
         * username : 何庸
         * is_live : 1
         * id : 1882
         * cid : 1882
         * is_gf : 0
         * uid : 218148
         * content :
         从你的全世界路过。我是，何庸。


         我的直播间左下角：


         火猫饰品竞猜，安全，稳定，何庸邀请你来当预测之王！


         链接：huomao.com/yc/1882






         微信公众号：电竞美学





         何庸公益群：533410978 （足球篮球实力预测）


         新浪微博：何庸

         我是DOTA2解说——何庸
         Ti7 V社线上预选赛邀请解说
         2017 基辅特锦赛V社线上预选赛邀请解说
         MDL 2017夏季赛 线下解说
         MDL 2016秋季赛 线下解说
         DOPIT 5 火猫直播间线下解说
         MPGL 2016 火猫直播间线下解说
         个人QQ：403342690
         * channel : GF-CG【何庸】
         * image : https://livepic.huomao.com/1882/i_10.jpg?1524196500
         * room_number : 1882
         * gid : 23
         * tj_pic : https://livepic.huomao.com/1882/i_10.jpg?1524196500
         * is_conmic : 0
         * stream : XI/RT9KcyeOXaRNCC3g
         * headimg : https://static.huomao.com/upload/web/images/headimgs/bb28bb7392741af90da1442728d236e0/20161015100450252_big.jpeg
         * desrc_count : 144486
         * gname : DOTA2
         * type : 1
         * screenType : 0
         * freeCDN : 0
         * cdn_key : 5
         * cdn_count : 8
         * streamList : [{"TD":"http://live-tx-hdl.huomaotv.cn/live/8aimtu.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android","HD":"http://live-tx-hdl.huomaotv.cn/live/8aimtu_720.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android","SD":"http://live-tx-hdl.huomaotv.cn/live/8aimtu_480.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android","BD":"http://live-tx-hdl.huomaotv.cn/live/8aimtu.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android"}]
         * defaultBitRate : HD
         * is_desrc : 0
         * manager : 0
         * experience : 2869038
         * is_guard : 0
         * bannerExist : 0
         * channelBanner : {"banner_url":"","banner_title":"活动","bannerid":"","banner_img":"","is_channel":0}
         * specialRoom : 0
         * is_notice : 0
         * noticeInfo : {}
         * isBeginGuess : 0
         * activeExist : 1
         * activeList : [{"id":"196","activename":"小冰冰传奇","typeArea":"1","gameVal":"星际争霸2,炉石传说,穿越火线,英雄联盟,DOTA2,FIFA Online3,娱乐星秀,格斗怀旧,魔兽世界,体育竞技,我的世界,赛事综合,手机游戏","labelVal":null,"starttime":"1520870400","endtime":"1678291200","roomNumbers":null,"opusername":"魏祥","imgUrl":"/upload/web/images/channel/6ca5a663c4a63b7407e7d3b1717bc4aa/20180330163703BjOfe6LY.png","url":"http://www.huomao.com/mobileformat/xxbcq.html","weight":"88","addtime":"1520922432","update_time":"1524016664","type":"3","anchorShow":"0","less_version":"","more_version":"","status":"1","isAdvert":"1","actPos":"1","h5url":"","is_event":"0","event_words":null,"is_channel":0}]
         * is_jingcai : 0
         * spjc_url : https://www.huomao.com
         * spjc_title : title
         * notice :
         * qq_count : 0
         * is_videoPls : true
         * is_smallGourd : true
         * isExtraTab : false
         * tabInfo : []
         * stream_refresh : 0
         * channel_uid : 218148
         * credits_2_get_vip : 2869038
         * isChannelThirdAd : 1
         */

        private int views;
        private String is_tuijian;
        private String is_entertainment;
        private String is_sub;
        private String username;
        private int is_live;
        private int id;
        private String cid;
        private String is_gf;
        private int uid;
        private String content;
        private String channel;
        private String image;
        private String room_number;
        private int gid;
        private String tj_pic;
        private int is_conmic;
        private String stream;
        private String headimg;
        private int desrc_count;
        private String gname;
        private int type;
        private int screenType;
        private int freeCDN;
        private int cdn_key;
        private int cdn_count;
        private String defaultBitRate;
        private int is_desrc;
        private int manager;
        private int experience;
        private int is_guard;
        private int bannerExist;
        private ChannelBannerBean channelBanner;
        private int specialRoom;
        private int is_notice;
        private NoticeInfoBean noticeInfo;
        private int isBeginGuess;
        private int activeExist;
        private int is_jingcai;
        private String spjc_url;
        private String spjc_title;
        private String notice;
        private int qq_count;
        private boolean is_videoPls;
        private boolean is_smallGourd;
        private boolean isExtraTab;
        private int stream_refresh;
        private String channel_uid;
        private int credits_2_get_vip;
        private int isChannelThirdAd;
        private List<StreamListBean> streamList;
        private List<ActiveListBean> activeList;
        private List<?> tabInfo;

        public int getViews() {
            return views;
        }

        public void setViews(int views) {
            this.views = views;
        }

        public String getIs_tuijian() {
            return is_tuijian;
        }

        public void setIs_tuijian(String is_tuijian) {
            this.is_tuijian = is_tuijian;
        }

        public String getIs_entertainment() {
            return is_entertainment;
        }

        public void setIs_entertainment(String is_entertainment) {
            this.is_entertainment = is_entertainment;
        }

        public String getIs_sub() {
            return is_sub;
        }

        public void setIs_sub(String is_sub) {
            this.is_sub = is_sub;
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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getIs_gf() {
            return is_gf;
        }

        public void setIs_gf(String is_gf) {
            this.is_gf = is_gf;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
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

        public String getRoom_number() {
            return room_number;
        }

        public void setRoom_number(String room_number) {
            this.room_number = room_number;
        }

        public int getGid() {
            return gid;
        }

        public void setGid(int gid) {
            this.gid = gid;
        }

        public String getTj_pic() {
            return tj_pic;
        }

        public void setTj_pic(String tj_pic) {
            this.tj_pic = tj_pic;
        }

        public int getIs_conmic() {
            return is_conmic;
        }

        public void setIs_conmic(int is_conmic) {
            this.is_conmic = is_conmic;
        }

        public String getStream() {
            return stream;
        }

        public void setStream(String stream) {
            this.stream = stream;
        }

        public String getHeadimg() {
            return headimg;
        }

        public void setHeadimg(String headimg) {
            this.headimg = headimg;
        }

        public int getDesrc_count() {
            return desrc_count;
        }

        public void setDesrc_count(int desrc_count) {
            this.desrc_count = desrc_count;
        }

        public String getGname() {
            return gname;
        }

        public void setGname(String gname) {
            this.gname = gname;
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

        public int getFreeCDN() {
            return freeCDN;
        }

        public void setFreeCDN(int freeCDN) {
            this.freeCDN = freeCDN;
        }

        public int getCdn_key() {
            return cdn_key;
        }

        public void setCdn_key(int cdn_key) {
            this.cdn_key = cdn_key;
        }

        public int getCdn_count() {
            return cdn_count;
        }

        public void setCdn_count(int cdn_count) {
            this.cdn_count = cdn_count;
        }

        public String getDefaultBitRate() {
            return defaultBitRate;
        }

        public void setDefaultBitRate(String defaultBitRate) {
            this.defaultBitRate = defaultBitRate;
        }

        public int getIs_desrc() {
            return is_desrc;
        }

        public void setIs_desrc(int is_desrc) {
            this.is_desrc = is_desrc;
        }

        public int getManager() {
            return manager;
        }

        public void setManager(int manager) {
            this.manager = manager;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }

        public int getIs_guard() {
            return is_guard;
        }

        public void setIs_guard(int is_guard) {
            this.is_guard = is_guard;
        }

        public int getBannerExist() {
            return bannerExist;
        }

        public void setBannerExist(int bannerExist) {
            this.bannerExist = bannerExist;
        }

        public ChannelBannerBean getChannelBanner() {
            return channelBanner;
        }

        public void setChannelBanner(ChannelBannerBean channelBanner) {
            this.channelBanner = channelBanner;
        }

        public int getSpecialRoom() {
            return specialRoom;
        }

        public void setSpecialRoom(int specialRoom) {
            this.specialRoom = specialRoom;
        }

        public int getIs_notice() {
            return is_notice;
        }

        public void setIs_notice(int is_notice) {
            this.is_notice = is_notice;
        }

        public NoticeInfoBean getNoticeInfo() {
            return noticeInfo;
        }

        public void setNoticeInfo(NoticeInfoBean noticeInfo) {
            this.noticeInfo = noticeInfo;
        }

        public int getIsBeginGuess() {
            return isBeginGuess;
        }

        public void setIsBeginGuess(int isBeginGuess) {
            this.isBeginGuess = isBeginGuess;
        }

        public int getActiveExist() {
            return activeExist;
        }

        public void setActiveExist(int activeExist) {
            this.activeExist = activeExist;
        }

        public int getIs_jingcai() {
            return is_jingcai;
        }

        public void setIs_jingcai(int is_jingcai) {
            this.is_jingcai = is_jingcai;
        }

        public String getSpjc_url() {
            return spjc_url;
        }

        public void setSpjc_url(String spjc_url) {
            this.spjc_url = spjc_url;
        }

        public String getSpjc_title() {
            return spjc_title;
        }

        public void setSpjc_title(String spjc_title) {
            this.spjc_title = spjc_title;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }

        public int getQq_count() {
            return qq_count;
        }

        public void setQq_count(int qq_count) {
            this.qq_count = qq_count;
        }

        public boolean isIs_videoPls() {
            return is_videoPls;
        }

        public void setIs_videoPls(boolean is_videoPls) {
            this.is_videoPls = is_videoPls;
        }

        public boolean isIs_smallGourd() {
            return is_smallGourd;
        }

        public void setIs_smallGourd(boolean is_smallGourd) {
            this.is_smallGourd = is_smallGourd;
        }

        public boolean isIsExtraTab() {
            return isExtraTab;
        }

        public void setIsExtraTab(boolean isExtraTab) {
            this.isExtraTab = isExtraTab;
        }

        public int getStream_refresh() {
            return stream_refresh;
        }

        public void setStream_refresh(int stream_refresh) {
            this.stream_refresh = stream_refresh;
        }

        public String getChannel_uid() {
            return channel_uid;
        }

        public void setChannel_uid(String channel_uid) {
            this.channel_uid = channel_uid;
        }

        public int getCredits_2_get_vip() {
            return credits_2_get_vip;
        }

        public void setCredits_2_get_vip(int credits_2_get_vip) {
            this.credits_2_get_vip = credits_2_get_vip;
        }

        public int getIsChannelThirdAd() {
            return isChannelThirdAd;
        }

        public void setIsChannelThirdAd(int isChannelThirdAd) {
            this.isChannelThirdAd = isChannelThirdAd;
        }

        public List<StreamListBean> getStreamList() {
            return streamList;
        }

        public void setStreamList(List<StreamListBean> streamList) {
            this.streamList = streamList;
        }

        public List<ActiveListBean> getActiveList() {
            return activeList;
        }

        public void setActiveList(List<ActiveListBean> activeList) {
            this.activeList = activeList;
        }

        public List<?> getTabInfo() {
            return tabInfo;
        }

        public void setTabInfo(List<?> tabInfo) {
            this.tabInfo = tabInfo;
        }

        public static class ChannelBannerBean {
        }

        public static class NoticeInfoBean {
        }

        public static class StreamListBean {
            /**
             * TD : http://live-tx-hdl.huomaotv.cn/live/8aimtu.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android
             * HD : http://live-tx-hdl.huomaotv.cn/live/8aimtu_720.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android
             * SD : http://live-tx-hdl.huomaotv.cn/live/8aimtu_480.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android
             * BD : http://live-tx-hdl.huomaotv.cn/live/8aimtu.flv?t=1524196768&r=127277988771&stream=8aimtu&rid=oubvc2y3v&token=539bf4eab58de6f488498cda0e2caf5e&from=android
             */

            private String TD;
            private String HD;
            private String SD;
            private String BD;

            public String getTD() {
                return TD;
            }

            public void setTD(String TD) {
                this.TD = TD;
            }

            public String getHD() {
                return HD;
            }

            public void setHD(String HD) {
                this.HD = HD;
            }

            public String getSD() {
                return SD;
            }

            public void setSD(String SD) {
                this.SD = SD;
            }

            public String getBD() {
                return BD;
            }

            public void setBD(String BD) {
                this.BD = BD;
            }
        }

        public static class ActiveListBean {
            /**
             * id : 196
             * activename : 小冰冰传奇
             * typeArea : 1
             * gameVal : 星际争霸2,炉石传说,穿越火线,英雄联盟,DOTA2,FIFA Online3,娱乐星秀,格斗怀旧,魔兽世界,体育竞技,我的世界,赛事综合,手机游戏
             * labelVal : null
             * starttime : 1520870400
             * endtime : 1678291200
             * roomNumbers : null
             * opusername : 魏祥
             * imgUrl : /upload/web/images/channel/6ca5a663c4a63b7407e7d3b1717bc4aa/20180330163703BjOfe6LY.png
             * url : http://www.huomao.com/mobileformat/xxbcq.html
             * weight : 88
             * addtime : 1520922432
             * update_time : 1524016664
             * type : 3
             * anchorShow : 0
             * less_version :
             * more_version :
             * status : 1
             * isAdvert : 1
             * actPos : 1
             * h5url :
             * is_event : 0
             * event_words : null
             * is_channel : 0
             */

            private String id;
            private String activename;
            private String typeArea;
            private String gameVal;
            private Object labelVal;
            private String starttime;
            private String endtime;
            private Object roomNumbers;
            private String opusername;
            private String imgUrl;
            private String url;
            private String weight;
            private String addtime;
            private String update_time;
            private String type;
            private String anchorShow;
            private String less_version;
            private String more_version;
            private String status;
            private String isAdvert;
            private String actPos;
            private String h5url;
            private String is_event;
            private Object event_words;
            private int is_channel;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getActivename() {
                return activename;
            }

            public void setActivename(String activename) {
                this.activename = activename;
            }

            public String getTypeArea() {
                return typeArea;
            }

            public void setTypeArea(String typeArea) {
                this.typeArea = typeArea;
            }

            public String getGameVal() {
                return gameVal;
            }

            public void setGameVal(String gameVal) {
                this.gameVal = gameVal;
            }

            public Object getLabelVal() {
                return labelVal;
            }

            public void setLabelVal(Object labelVal) {
                this.labelVal = labelVal;
            }

            public String getStarttime() {
                return starttime;
            }

            public void setStarttime(String starttime) {
                this.starttime = starttime;
            }

            public String getEndtime() {
                return endtime;
            }

            public void setEndtime(String endtime) {
                this.endtime = endtime;
            }

            public Object getRoomNumbers() {
                return roomNumbers;
            }

            public void setRoomNumbers(Object roomNumbers) {
                this.roomNumbers = roomNumbers;
            }

            public String getOpusername() {
                return opusername;
            }

            public void setOpusername(String opusername) {
                this.opusername = opusername;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getAnchorShow() {
                return anchorShow;
            }

            public void setAnchorShow(String anchorShow) {
                this.anchorShow = anchorShow;
            }

            public String getLess_version() {
                return less_version;
            }

            public void setLess_version(String less_version) {
                this.less_version = less_version;
            }

            public String getMore_version() {
                return more_version;
            }

            public void setMore_version(String more_version) {
                this.more_version = more_version;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getIsAdvert() {
                return isAdvert;
            }

            public void setIsAdvert(String isAdvert) {
                this.isAdvert = isAdvert;
            }

            public String getActPos() {
                return actPos;
            }

            public void setActPos(String actPos) {
                this.actPos = actPos;
            }

            public String getH5url() {
                return h5url;
            }

            public void setH5url(String h5url) {
                this.h5url = h5url;
            }

            public String getIs_event() {
                return is_event;
            }

            public void setIs_event(String is_event) {
                this.is_event = is_event;
            }

            public Object getEvent_words() {
                return event_words;
            }

            public void setEvent_words(Object event_words) {
                this.event_words = event_words;
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
