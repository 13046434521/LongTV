package com.t.longtv.utils;

import android.content.SharedPreferences;

import com.t.longtv.AppAplication;

import static android.content.Context.MODE_PRIVATE;

/**
 * 作者：龙昊
 * 日期：2018/4/21 14:08
 * 描述：
 */
public class Preferences {
    private static SharedPreferences sharedPreferences;
    public static final String COOKIE="Cookie";
    public static Preferences getInstance(){
        return PreferencesHolder.instance;
    }

    public Preferences(){
        sharedPreferences = AppAplication.getAppAplication().getSharedPreferences("LongTV",MODE_PRIVATE);
    }

    public  SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    private static  class PreferencesHolder{
        private static Preferences instance=new Preferences();
    }
}