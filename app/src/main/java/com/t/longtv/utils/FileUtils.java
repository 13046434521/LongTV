package com.t.longtv.utils;

import android.os.Environment;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import java.io.File;

/**
 * @作者JTL.
 * @日期2018/1/30.
 * @说明：文件管理
 */

public class FileUtils {
    private static String mSDCardFolderPath;
    private static String mImgFolderPath;
    private static String mApkFolderPath;
    private static String mCacheFolderPath;
    private static String mLogFolderPath;

    public static FileUtils getInstance() {

        return FileUtilsHolder.instance;
    }

    public void init() {
        mSDCardFolderPath = getSDCardFolderPath();
        mImgFolderPath = getImgFolderPath();
        mApkFolderPath = getApkFolderPath();
        mCacheFolderPath = getSDCardFolderPath();
        mLogFolderPath = getLogFolderPath();

        mkdirs(mImgFolderPath);
        mkdirs(mApkFolderPath);
        mkdirs(mCacheFolderPath);
        mkdirs(mLogFolderPath);
    }

    private String getSDCardFolderPath() {
        if (TextUtils.isEmpty(mSDCardFolderPath)) {
            mSDCardFolderPath = Environment.getExternalStorageDirectory().getPath() + "/LongTV";
        }

        return mSDCardFolderPath;
    }

    public File mkdirs(@NonNull String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        return file;
    }

    public String getCacheFolderPath() {
        if (TextUtils.isEmpty(mCacheFolderPath)) {
            mCacheFolderPath = getSDCardFolderPath() + "/Cache/";
        }
        return mCacheFolderPath;
    }

    public String getImgFolderPath() {
        if (TextUtils.isEmpty(mImgFolderPath)) {
            mSDCardFolderPath = getSDCardFolderPath() + "/Img/";
        }
        return mImgFolderPath;
    }

    public String getApkFolderPath() {
        if (TextUtils.isEmpty(mApkFolderPath)) {
            mSDCardFolderPath = getSDCardFolderPath() + "/Apk/";
        }
        return mApkFolderPath;
    }

    public String getLogFolderPath() {
        if (TextUtils.isEmpty(mLogFolderPath)) {
            mSDCardFolderPath = getSDCardFolderPath() + "/Log/";
        }
        return mLogFolderPath;
    }

    private static class FileUtilsHolder {
        private static FileUtils instance = new FileUtils();
    }
}