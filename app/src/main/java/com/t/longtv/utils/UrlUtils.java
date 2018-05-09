package com.t.longtv.utils;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 作者：龙昊
 * 日期：2018/4/16 12:28
 * 描述：
 */
public class UrlUtils {
/*    public static UrlUtils urlUtils = null;
    private String b;
    private String unixTime;
    private String versionName = String.valueOf(AppUtils.getVersionName(AppAplication.getApplication()));
    private String versionCode = String.valueOf(AppUtils.getVersionCode(AppAplication.getApplication()));

    public static UrlUtils getInstance() {
        if (urlUtils == null) {
            urlUtils = new UrlUtils();
        }
        return urlUtils;
    }

    public String a(Context paramContext) {
*//*        if (y.e(paramContext, y.e(paramContext, "cid")) != null) {
            this.b = aa.j(y.e(paramContext, "uid") + "EU*T*)*(#23ssdfd" + System.currentTimeMillis() / 1000L);
        }*//*
        return this.b;
    }

    public String a(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap) {
        Object localObject = paramMap;
        if (paramMap == null) {
            localObject = new TreeMap();
        }
        if (((Map) localObject).containsKey("token")) {
            ((Map) localObject).remove("token");
        }
        if ((((Map) localObject).containsKey("uid")) && (!y.e(paramContext, "Access_token").equals(""))) {
            ((Map) localObject).put("access_token", y.e(paramContext, "Access_token"));
            ((Map) localObject).put("expires_time", y.e(paramContext, "Expires_time"));
        }
        ((Map) localObject).put("refer", "android");
        ((Map) localObject).put("ver", versionName);
        ((Map) localObject).put("an", versionCode);
        ((Map) localObject).put("time", System.currentTimeMillis() / 60000L + "");
        ((Map) localObject).put("token", aa.j(aa.a((Map) localObject) + "EU*T*)*(#23ssdfd"));
        paramContext = "http://api.huomao.com/" + paramString1 + "/" + paramString2 + "?refer=android";
        paramString1 = ((Map) localObject).keySet().iterator();
        while (paramString1.hasNext()) {
            paramString2 = (String) paramString1.next();
            paramMap = (String) ((Map) localObject).get(paramString2);
            paramContext = paramContext + "&" + paramString2 + "=" + paramMap;
        }
        Log.e("newUrl", paramContext);
        return paramContext;
    }

    public String a(Context paramContext, Map<String, String> paramMap) {
        Object localObject = paramMap;
        if (paramMap == null) {
            localObject = new TreeMap();
        }
        if (((Map) localObject).containsKey("token")) {
            ((Map) localObject).remove("token");
        }
        if ((((Map) localObject).containsKey("uid")) && (y.e(paramContext, "Expires_time") != null)) {
            ((Map) localObject).put("access_token", y.e(paramContext, "Access_token"));
            ((Map) localObject).put("expires_time", y.e(paramContext, "Expires_time"));
        }
        ((Map) localObject).put("refer", "android");
        ((Map) localObject).put("time", unixTime);
        ((Map) localObject).put("ver", versionName);
        ((Map) localObject).put("an", versionCode);
        return aa.j(aa.a((Map) localObject) + "EU*T*)*(#23ssdfd");
    }

    public String getUnixTime() {
        unixTime = String.valueOf(System.currentTimeMillis() / 1000L);
        return unixTime;
    }

    public String b(Context paramContext, Map<String, String> paramMap) {
        unixTime = getUnixTime();
        Object localObject = paramMap;
        if (paramMap == null) {
            localObject = new TreeMap();
        }
        if (((Map) localObject).containsKey("token")) {
            ((Map) localObject).remove("token");
        }
        if ((((Map) localObject).containsKey("uid")) && (y.e(paramContext, "Expires_time") != null)) {
            ((Map) localObject).put("access_token", y.e(paramContext, "Access_token"));
            ((Map) localObject).put("expires_time", y.e(paramContext, "Expires_time"));
        }
        ((Map) localObject).put("refer", "android");
        ((Map) localObject).put("time", unixTime);
        ((Map) localObject).put("ver", versionName);
        ((Map) localObject).put("an", versionCode);
        return aa.j(aa.a((Map) localObject) + "EU*T*)*(#23ssdfd");
    }

    public String c() {
        return unixTime;
    }

    public String c(Map<String, String> paramMap) {
        unixTime = (System.currentTimeMillis() / 60000L + "");
        if (paramMap == null) {
            paramMap = new TreeMap();
        }
        if (paramMap.containsKey("token")) {
            paramMap.remove("token");
        }
        paramMap.put("refer", "android");
        paramMap.put("time", unixTime);
        paramMap.put("ver", versionName);
        paramMap.put("an", versionCode);
        return aa.j(aa.a(paramMap) + "EU*T*)*(#23ssdfd");
    }

    public static String a(Map<String, String> paramMap)
    {
        TreeMap localTreeMap = new TreeMap(new Comparator()
        {
            public int a(String paramAnonymousString1, String paramAnonymousString2)
            {
                return paramAnonymousString2.compareTo(paramAnonymousString1);
            }
        });
        localTreeMap.putAll(paramMap);
        Iterator localIterator = localTreeMap.keySet().iterator();
        String str1 = "";
        String str2;
        for (paramMap = ""; localIterator.hasNext(); paramMap = paramMap + str2)
        {
            str2 = (String)localIterator.next();
            str1 = str1 + str2;
            str2 = (String)localTreeMap.get(str2);
        }
        return paramMap;
    }*/

    public static String getMapString(Map<String, String> paramMap)
    {
        TreeMap<String,String> localTreeMap=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        });
        localTreeMap.putAll(paramMap);
        Iterator localIterator = localTreeMap.keySet().iterator();
        String str1 = "";
        String str2;
        String param;
        for (param = ""; localIterator.hasNext(); param = param + str2)
        {
            str2 = (String)localIterator.next();
            str1 = str1 + str2;
            str2 = localTreeMap.get(str2);
        }
        return param;
    }
}
