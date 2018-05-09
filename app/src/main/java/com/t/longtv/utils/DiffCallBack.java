package com.t.longtv.utils;

import android.support.v7.util.DiffUtil;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/18 15:32
 * 描述：
 */
public class DiffCallBack<T> extends DiffUtil.Callback {
    private List<T> oldDatas;
    private List<T> newDatas;

    public DiffCallBack(List<T> oldDatas, List<T> newDatas) {
        this.oldDatas = oldDatas;
        this.newDatas = newDatas;
    }

    @Override
    public int getOldListSize() {
        return oldDatas!=null?oldDatas.size():0;
    }

    @Override
    public int getNewListSize() {
        return newDatas!=null?newDatas.size():0;
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldDatas.get(oldItemPosition).equals(newDatas.get(newItemPosition));
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        T beanOld = oldDatas.get(oldItemPosition);
        T beanNew = newDatas.get(newItemPosition);
        if (!beanOld.equals(beanNew)) {
            return false;//如果有内容不同，就返回false
        }
        return true; //默认两个data内容是相同的
    }
}
