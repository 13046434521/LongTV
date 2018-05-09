package com.t.longtv.base;
import static com.google.common.base.Preconditions.checkNotNull;

public abstract class BasePresenter <T> implements BasePresenterImpl {
    private T t;

    public BasePresenter(T t){
        this.t =t;
        start();
    }

    public void CheckNotNull(T t){
        checkNotNull(t);
    }

    public T getView(){
        checkNotNull(t);
        return t;
    }
}
