package com.t.longtv.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.TypedValue;

/**
 * 作者：龙昊
 * 日期：2018/5/1 17:46
 * 描述：
 */
public class DimensionUtils {
    private static DimensionUtils getInstance(){
        return  DimensionUtilsHolder.instance;
    }

    /**
     * 转换成DP
     * @param context
     * @param dimens
     * @return
     */
    public static int getDp(Context context,@NonNull int dimens){
       return   (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dimens, context.getResources().getDisplayMetrics());
    }

    /**
     * 转换成SP
     * @param context
     * @param dimens
     * @return
     */
    public static int getSp(Context context,@NonNull int dimens){
        return   (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, dimens, context.getResources().getDisplayMetrics());
    }

    private static class DimensionUtilsHolder{
        private static DimensionUtils instance=new DimensionUtils();
    }
}
