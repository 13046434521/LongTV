package com.t.longtv.http;

import io.reactivex.observers.DefaultObserver;

/**
 * 作者：龙昊
 * 日期：2018/4/11 08:56
 * 描述：被观察者类
 */
public abstract  class DefaultApiObserveble<T> extends DefaultObserver<T> {
    @Override
    public void onNext(T t) {
        onSuccess(t);
    }

    @Override
    public void onError(Throwable e) {
        onFailed(e);
    }

    @Override
    public void onComplete() {

    }

    public abstract void onSuccess(T t);

    public abstract void onFailed(Throwable e);
}
