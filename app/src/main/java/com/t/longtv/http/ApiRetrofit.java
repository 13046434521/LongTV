package com.t.longtv.http;

import com.t.longtv.AppConstants;
import com.t.longtv.helper.OkHttpHelper;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者：龙昊
 * 日期：2018/4/9 18:16
 * 描述：
 */
public class ApiRetrofit {
    private Retrofit retrofit;
    public static ApiRetrofit getInstance(){
        return ApiRetrofitHolder.API_RETROFIT;
    }
    public ApiRetrofit (){
        init();
    }

    private void init(){
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl(AppConstants.HTTP.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(OkHttpHelper.getInstance().getOkHttpClient())
                .build();

        retrofit = builder.build();
    }

    public <T> T create(Class<T> clazz){
        return retrofit.create(clazz);
    }

    private static class ApiRetrofitHolder{
        private static final ApiRetrofit API_RETROFIT=new ApiRetrofit();
    }
}
