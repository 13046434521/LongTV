package com.t.longtv;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.alibaba.android.arouter.launcher.ARouter;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.squareup.leakcanary.LeakCanary;
import com.t.longtv.bean.HMTitleBean;
import com.t.longtv.dao.DaoMaster;
import com.t.longtv.dao.DaoSession;
import com.t.longtv.dao.dbutils.HmDBUtils;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/9 14:54
 * 描述：自定义Application
 */
public class AppAplication extends Application {
    private static AppAplication appAplication;
    private DaoSession mUserInfoDaoSession;
    public static Context getApplication() {
        return appAplication;
    }

    public static AppAplication getAppAplication() {
        return appAplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appAplication = this;
        initLeak();
        initARouter();
        initLogger();
        initDB();
    }

    private void initLeak(){
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        // Normal app init code...
    }

    private void initDB() {
        HmDBUtils hmDBUtils=HmDBUtils.getInstance();
        if (!hmDBUtils.hasHmInfo()){
            hmDBUtils.insert(new HMTitleBean("Dota2","23","https://static.huomao.com/upload/web/images/game/20171123220206Ay4PYf7l.jpg"));
            hmDBUtils.insert(new HMTitleBean("绝地求生","117","https://static.huomao.com/upload/web/images/game/20170721113323tevUMEfI.jpg"));
            hmDBUtils.insert(new HMTitleBean("炉石传说","13","https://static.huomao.com/upload/web/images/game/20170512174429Z1rujb5T.jpg"));
        }
        else{
            List<HMTitleBean> list=hmDBUtils.getHmInfo();
            for (int i=0;i<list.size();i++){
                Logger.v("hmtv",list.get(i).getHmGameName()+"---"+list.get(i).getGid());
            }
        }
    }

    /**
     * 初始化Logger
     */
    private void initLogger() {
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    /**
     * 初始化ARouter
     */
    private void initARouter() {
        if (BuildConfig.DEBUG) {
            //打印日志
            ARouter.openLog();
            //开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！
            //线上版本需要关闭,否则有安全风险)
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

    private DaoSession initSingleDaoSession(String dbName) {
        DaoMaster.DevOpenHelper userInfoHelper = new DaoMaster.DevOpenHelper(this, dbName);
        SQLiteDatabase userInfoDatabase = userInfoHelper.getWritableDatabase();
        // 获得Master实例,相当于给database包装工具
        DaoMaster daoMaster = new DaoMaster(userInfoDatabase);
        // 获取类似于缓存管理器,提供各表的DAO类
        return daoMaster.newSession();
    }

    public synchronized DaoSession getUserInfoDaoSession() {
        if (null == mUserInfoDaoSession) {
            mUserInfoDaoSession = initSingleDaoSession("LongTV.db");
        }
        return mUserInfoDaoSession;
    }
}
