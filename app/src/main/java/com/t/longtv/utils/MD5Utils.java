package com.t.longtv.utils;

import java.security.MessageDigest;

/**
 * 作者：龙昊
 * 日期：2018/4/16 12:06
 * 描述：
 */
public class MD5Utils {
    private static final char[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    public static String MD5(String paramString) {
        if (paramString == null) {
            return null;
        }
        try {
            MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
            localMessageDigest.update(paramString.getBytes());
            paramString = a(localMessageDigest.digest());
            return paramString;
        } catch (Exception e) {
            throw new RuntimeException(paramString);
        }
    }

    private static String a(byte[] paramArrayOfByte)
    {
        int j = paramArrayOfByte.length;
        StringBuilder localStringBuilder = new StringBuilder(j * 2);
        int i = 0;
        while (i < j)
        {
            localStringBuilder.append(c[(paramArrayOfByte[i] >> 4 & 0xF)]);
            localStringBuilder.append(c[(paramArrayOfByte[i] & 0xF)]);
            i += 1;
        }
        return localStringBuilder.toString();
    }
}
