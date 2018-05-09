package com.t.longtv;

import android.support.annotation.IntDef;
import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 作者：龙昊
 * 日期：2018/4/22 19:21
 * 描述：Tag类
 */
public class Tags {
    /*HomeFragment切换*/
    public static final int HM_FOUCS = 0x00;
    public static final int HM_RECOMMEND = 0x01;
    public static final int HM_LIVE = 0x02;
    public static final int HM_DOTA = 0x03;
    public static final int HM_ENTERTAIN = 0x04;
    public static final int HM_LOL = 0x05;
    public static final int HM_OW = 0x06;
    public static final int HM_CSGO = 0x07;
    public static final int Is_Login = 0x0;
    public static final int Is_Logout = 0x1;

    /**
     * HomeFragment切换(火猫TV)
     */
    @IntDef({HM_FOUCS, HM_RECOMMEND, HM_LIVE, HM_DOTA,
            HM_ENTERTAIN, HM_LOL, HM_OW, HM_CSGO})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HMPager {
    }
    /**
     * 是否已经登录
     */
    @IntDef({Is_Login, Is_Logout})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MineIsLoginTag {
    }
    public static final String QM_ALL = "全部直播";
    public static final String QM_STAR = "全民星秀";
    public static final String QM_LOL = "英雄联盟";
    public static final String QM_JUEDI = "绝地求生";
    public static final String QM_SHOWING = "Showing";
    public static final String QM_JDMOBILE = "刺激战场";
    public static final String QM_DNF = "DNF";
    public static final String QM_WANGZHE = "王者荣耀";
    public static final String QM_FOOD = "美食";
    public static final String QM_PAJ = "决战平安京";
    public static final String QM_MOBILEGAME = "手游专区";
    public static final String QM_CF = "穿越火线";
    public static final String QM_HOSTGAME = "主机专区";
    public static final String QM_QQCAR= "QQ飞车";
    public static final String QM_GRSM= "光荣使命";
    public static final String QM_HYXD= "荒野行动";
    public static final String QM_TERMINATOR= "终结者";
    public static final String QM_XMCS= "小米超神";
    public static final String QM_QQCARMOBILE= "QQ飞车手游";
    public static final String QM_CFMOBILE= "CF手游";
    public static final String QM_CAR= "汽车";
    public static final String QM_TANK= "坦克世界";
    public static final String QM_STREET= "街头文化";
    public static final String QM_ECY= "二次元";
    public static final String QM_OLD= "怀旧";
    public static final String QM_SNAKE= "疯狂贪吃蛇";
    public static final String QM_BXJG= "变形金刚";
    public static final String QM_JL= "剑灵";
    public static final String QM_KB= "看吧";
    public static final String QM_YYS= "阴阳师";
    public static final String QM_WOLF= "狼人杀";
    public static final String QM_AU= "劲舞团";
    public static final String QM_ZJFB= "装甲风暴";
    public static final String QM_HY= "火影忍者";
    public static final String QM_JXQY= "剑侠情缘3";
    public static final String QM_QP= "棋牌游戏";
    public static final String QM_YMR= "野蛮人大作战";
    public static final String QM_CSZC= "创世战车";
    public static final String QM_PLAY= "精彩推荐";
    public static final String QM_MSG= "梦三国";
    public static final String QM_DOTA2= "DOTA2";
    public static final String QM_FS= "街篮专区";
    public static final String QM_OW= "守望先锋";
    public static final String QM_RW= "人文";
    public static final String QM_HEARTSTONE= "炉石传说";
    public static final String QM_NZ= "逆战";
    public static final String QM_WEBGAME= "网游竞技";
    public static final String QM_CQ= "传奇";
    public static final String QM_QIUQIU= "球球大作战";
    public static final String QM_CSGO= "CSGO";
    public static final String QM_NBA2K= "NBA2K";
    public static final String QM_QHYX= "枪火游侠";
    public static final String QM_FIFA= "FIFA";
    public static final String QM_TTLRS= "天天狼人杀";
    public static final String QM_WAR3= "魔兽争霸3";
    public static final String QM_LZG= "龙之谷";
    public static final String QM_MINECRAFT= "我的世界";
    public static final String QM_QMCP= "全民出品";
    public static final String QM_BLIZZARD= "暴雪经典";
    public static final String QM_XYZX= "新游专区";

    @StringDef({QM_ALL,QM_STAR, QM_SHOWING, QM_JDMOBILE, QM_DNF, QM_JUEDI, QM_LOL, QM_FOOD, QM_PAJ
            , QM_WANGZHE, QM_MOBILEGAME,QM_CF})
    @Retention(RetentionPolicy.SOURCE)
    public @interface QMPager { }


}
