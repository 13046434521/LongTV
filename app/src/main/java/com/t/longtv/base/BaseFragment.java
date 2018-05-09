package com.t.longtv.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * 作者：龙昊
 * 日期：2018/5/6 10:31
 * 描述：懒加载
 */
public abstract class BaseFragment extends Fragment {
    private boolean isCreated = false;
    private boolean isInit = false;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isCreated && isVisibleToUser && !isInit) {
            Initialize();
            isInit = true;
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        isCreated = true;
        if (isCreated && getUserVisibleHint() && !isInit) {
            Initialize();
            isInit = true;
        }
    }

    /**
     * 初始化方法
     */
    public abstract void Initialize();


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        isCreated = false;
        isInit = false;
    }
}
