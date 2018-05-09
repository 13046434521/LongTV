package com.t.longtv;

/**
 * 作者：龙昊
 * 日期：2018/4/9 14:45
 * 描述：静态全局变量
 */
public class AppConstants {
    public static final String ARouter_Home = "/detail/home";
    public static final String ARouter_Live = "/detail/live";
    public static final String ARouter_Web = "/detail/web";
    public static final String ARouter_Login = "/detail/login";
    public static final String ARouter_Set = "/detail/set";
    public static final String ARouter_Message = "/detail/message";
    public static final String ARouter_Pay = "/detail/pay";
    public static final String ARouter_Bill = "/detail/bill";
    public static final String ARouter_Subscribe = "/detail/subscribe";;
    public static final String ARouter_History = "/detail/history";
    public static final String ARouter_Task = "/detail/task";
    public static final String ARouter_Fans = "/detail/fans";
    public static final String ARouter_Badge = "/detail/badge";
    public static final String ARouter_Traffic = "/detail/traffic";
    public static final String ARouter_Feedback = "/detail/feedback";
    public static final String ARouter_Personal = "/detail/personal";
    public static final String ARouter_HM_Channel = "/detail/hm/channel";

    public static final String ARouter_Fragment_Home = "/fragment/home";
    public static final String ARouter_Fragment_Entertain = "/fragment/entertain";
    public static final String ARouter_Fragment_Park = "/fragment/Park";
    public static final String ARouter_Fragment_Mine = "/fragment/mine";
    public static final String ARouter_Fragment_Match = "/fragment/match";
    public static final String ARouter_Fragment_Live = "/fragment/live";
    public static final String ARouter_Fragment_Foucs = "/fragment/foucs";
    public static final String ARouter_Fragment_Recommend = "/fragment/recommend";
    public static final String ARouter_Fragment_LiveDetail = "/fragment/livedetail";
    public static final String ARouter_Fragment_Web = "/fragment/web";
    public static final String ARouter_Fragment_Quanmin="/fragment/quanmin";


    public static final String ARouter_Fragment_QMLive="/fragment/qmlive";
    public static final String ARouter_Fragment_QMLiveDetail="/fragment/qmlivedetail";
    public static final String ARouter_Fragment_Douyu="/fragment/douyu";
    public static final String ARouter_Fragment_Panda="/fragment/panda";
    public static final String ARouter_Fragment_Max="/fragment/max";
    public static final String ARouter_Fragment_Zhanqi="/fragment/zhanqi";

    public static final String ACCESS_TOKEN = "21e006dc3481d0c76572d99231b89543";
    public static final String TOKEN = "49dac4d4e6c331efd546df331380f9dd";
    public static final String EXPIRES_TIME = "1523848867";
    public static final String TIME = "1523869150";
    public static final String AN = "67";
    public static final String VER = "2.3";
    public static final String Park_Title = "游乐场";
    public static final String Recommend_Title = "推荐";
    public static final String Match_Title = "赛事";
    public static final String Entertain_Title = "娱乐";
    public static final int REFRESH = 1;
    public static final int LOADMORE = 2;
    public static final String Salt = "EU*T*)*(#23ssdfd";

    public class HTTP {
        public static final String BASE_URL = "http://api.huomao.com";
        public static final String Park_URL = "/plugs/getTopTabs";
        public static final String Entertain_URL = "/channels/channelpage.json";
        public static final String Entertain_Banner_URL = "/Entertainment/getBanner";
        public static final String Live_URL = "/channels/channelpage.json";
        public static final String Live_Detail_URL = "/channels/channelDetail";
        public static final String Recommend_Banner_URL = "/channels/getBanner.json";
        public static final String Recommend_URL = "/indexchannel/indexChannelRec";
        public static final String Mine_AD_URL = "/advert/getUserInfoAd";
        public static final String Mine_Module_URL = "/plugs/mobileModule";
        public static final String Login_URL = "/userlogin/user_login";
        public static final String UserInfo_URL="/User/getUserInfo";
        public static final String Subscribe_URL="/User/getUsersSubscribe";
        public static final String Task_URL="/task/getAllTaskStat";
        public static final String History_URL="/User/getRecentWatch";
        public static final String HmChannel_URL="/User/get_games";



        public static final String BASE_QUANMIN_URL = "http://www.quanmin.tv/";
        public static final String QUANMIN_RECOMMEND_URL="json/app/index/recommend/list-android.json?v=3.0.1&os=1&ver=4";
        public static final String QUANMIN_LiveAll_URL ="json/play/list.json?v=3.0.1&os=1&ver=4";
        public static final String QUANMIN_Live_URL ="json/categories/{slug}/list.json?v=3.0.1&os=1&ver=4";
        public static final String QUANMIN_ROOM_URL="json/rooms/{uid}/info.json?v=3.0.1&os=1&ver=4";

        public static final String Failed="请求失败，请检查网络";
    }
}
