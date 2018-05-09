package com.t.longtv.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.t.longtv.AppAplication;
import com.t.longtv.R;
import com.t.longtv.dao.dbutils.UserDBUtils;

/**
 * 作者：龙昊
 * 日期：2018/4/9 14:55
 * 描述：App常用工具类
 */
public class AppUtils {

    /**
     * 配置Toast,统一修改
     *
     * @param context
     * @param message
     */
    public static void Toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void Toast( String message) {
        Toast.makeText(AppAplication.getApplication(), message, Toast.LENGTH_SHORT).show();
    }

    /**
     * 配置Logger，统一修改
     *
     * @param message
     */
    public static void Logger(String message) {
        Logger.d(message);
    }

    /**
     * 配置SwipeRefreshLayout，统一修改
     *
     * @param swipeRefresh
     */
    public static void setSwipeRefresh(@NonNull SwipeRefreshLayout swipeRefresh) {
        swipeRefresh.setColorSchemeResources(R.color.colorBlue, R.color.colorPink);
    }

    /**
     * 获取版本名
     *
     * @param context
     * @return
     */
    public static String getVersionName(Context context) {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;

        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return "1.0.0";
        }
    }

    /**
     * 获取版本号
     * @param context
     * @return
     */
    public static int getVersionCode(Context context) {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;

        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException a) {
            a.printStackTrace();
        }
        return 0;
    }

    public static String getUnixTime(){
        String date= String.valueOf(System.currentTimeMillis() / 1000L);

        return date;
    }

    public static String getGid(String title) {
        String gid="0";
        switch (title) {
            case "全部直播":
                gid = "0";
                break;
            case "DOTA2":
                gid = "23";
                break;
            case "娱乐星秀":
                gid = "32";
                break;
            case "英雄联盟":
                gid = "17";
                break;
            case "守望先锋":
                gid = "103";
                break;
            case "CSGO":
                gid = "20";
                break;
            case "QQ游戏":
                gid = "100";
                break;
        }

        return gid;
    }

    /**
     * 是否已登录
     * @return
     */
    public static boolean isLogin(){
        return UserDBUtils.getInstance().hasUserInfo();
    }
}

