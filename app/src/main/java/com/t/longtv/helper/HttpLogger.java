package com.t.longtv.helper;

import com.socks.library.KLog;

import okhttp3.logging.HttpLoggingInterceptor;

/**
 * 作者：龙昊
 * 日期：2018/4/12 23:58
 * 描述：
 */
public class HttpLogger implements HttpLoggingInterceptor.Logger {
    @Override
    public void log(String message) {
        KLog.json("jtl",message);
//        Logger.json(message);
    }
}
