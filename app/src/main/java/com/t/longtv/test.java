package com.t.longtv;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 作者：龙昊
 * 日期：2018/4/20 12:52
 * 描述：
 */
public class test {
    public static String a(Map<String, String> paramMap)
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
