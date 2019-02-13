package com.t.longtv.http;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者：龙昊
 * 日期：2018/4/10 18:10
 * 描述：观察者类
 */
public class ApiObserveble {
    public static  <T> Observable<T> defaultMethod(Observable<T> observable){
        return  observable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .timeout(5*1000, TimeUnit.SECONDS)
                .retry(3);
    }
}
