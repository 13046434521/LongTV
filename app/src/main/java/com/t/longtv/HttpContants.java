package com.t.longtv;

import com.t.longtv.utils.MD5Utils;
import com.t.longtv.utils.UrlUtils;

import java.util.Map;
import java.util.TreeMap;

/**
 * 作者：龙昊
 * 日期：2018/4/20 13:38
 * 描述：OpenId等参数
 */
public class HttpContants {
    public static String Uid="";

    /**
     * 获取OpenId
     * @return
     */
    public static String getOpenId(){
        String openId="";
        openId= MD5Utils.MD5(Uid+"EU*T*)*(#23ssdfd" + System.currentTimeMillis() / 1000L);
        return openId;
    }

    /**
     * 获取Token
     * @return
     */
    public static String getToken(){
        String openId="";
        openId= MD5Utils.MD5(Uid+"EU*T*)*(#23ssdfd" + System.currentTimeMillis() / 1000L);

        return openId;
    }

    /**
     * 获取Token
     * @return
     */
    public static String setOpenId(String time){
        String openId="";
        openId= MD5Utils.MD5(Uid+"EU*T*)*(#23ssdfd" + Long.valueOf(time));

        return openId;
    }

    public static String getUnixTime(){
        String date= String.valueOf(System.currentTimeMillis() / 1000L);

        return date;
    }

    public static String getNowTime(){
        String date= String.valueOf(System.currentTimeMillis() / 1000L-35);

        return date;
    }

    public String getToken( Map<String, String> paramMap)
    {
        Object localObject = paramMap;
        if (paramMap == null) {
            localObject = new TreeMap();
        }
        if (((Map)localObject).containsKey("token")) {
            ((Map)localObject).remove("token");
        }
/*        if ((((Map)localObject).containsKey("uid")) && (!y.e(paramContext, "Access_token").equals("")))
        {
            ((Map)localObject).put("access_token", y.e(paramContext, "Access_token"));
            ((Map)localObject).put("expires_time", y.e(paramContext, "Expires_time"));
        }*/
        ((Map)localObject).put("access_token","");
        ((Map)localObject).put("expires_time", "");
        ((Map)localObject).put("refer", "android");
        ((Map)localObject).put("ver", "2.3");
        ((Map)localObject).put("an", "67");
        ((Map)localObject).put("time", System.currentTimeMillis() / 60000L + "");
        return MD5Utils.MD5(UrlUtils.getMapString((Map)localObject) + "EU*T*)*(#23ssdfd");
    }
}
