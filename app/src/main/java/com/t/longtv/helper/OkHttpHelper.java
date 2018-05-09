package com.t.longtv.helper;

import android.util.Log;

import com.t.longtv.utils.Preferences;

import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * 作者：龙昊
 * 日期：2018/4/9 18:19
 * 描述：OkHttpHelper帮助类
 */
public class OkHttpHelper {
    private OkHttpClient.Builder  builder;

    public static OkHttpHelper getInstance(){
        return OkHttpHelperInstance.OK_HTTP_HELPER;
    }
    public OkHttpHelper() {
        init();
    }

    private void init() {
        builder=new OkHttpClient.Builder();
        builder.readTimeout(5*1000, TimeUnit.SECONDS);
        builder.writeTimeout(5*1000, TimeUnit.SECONDS);
        builder.connectTimeout(5*1000, TimeUnit.SECONDS);
        //添加loggingInterceptor
        HttpLoggingInterceptor loggingInterceptor=new HttpLoggingInterceptor(new HttpLogger());
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        builder.addInterceptor(loggingInterceptor);
        builder.addInterceptor(new AddCookiesInterceptor());
        builder.addInterceptor(new ReceivedCookiesInterceptor());
//        builder.cookieJar(cookieJar);
/*        //添加cookieJar
        builder.cookieJar(new CookieJar() {
            private HashMap<HttpUrl,List<Cookie>> cookie = new HashMap(16);
            List<Cookie> cookies=new ArrayList<>();
            @Override
            public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                com.orhanobut.logger.Logger.e("cookie","url(save):"+url+"---"+"cookie",cookie);
                cookie.put(url,cookies);
            }

            @Override
            public List<Cookie> loadForRequest(HttpUrl url) {
                cookies=cookie.get(url);

                com.orhanobut.logger.Logger.e("cookie","url(load):"+url+"---"+"cookie",cookie.get(0));
                return cookies==null?new ArrayList<Cookie>():cookie.get(0);
            }
        });*/

        //Cache 缓存
    }

    //获取OkHttpClient实例
    public OkHttpClient getOkHttpClient(){
        checkNotNull(builder);
        return builder.build();
    }



    private static class OkHttpHelperInstance{
        private static final OkHttpHelper OK_HTTP_HELPER=new OkHttpHelper();
    }

    public class AddCookiesInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request.Builder builder = chain.request().newBuilder();
/*            String url= String.valueOf(chain.request().url());

            builder.url(url+"jtl");*/
            HashSet<String> preferences = (HashSet) Preferences.getInstance().getSharedPreferences()
                    .getStringSet(Preferences.COOKIE, new HashSet<String>());
            for (String cookie : preferences) {
                builder.addHeader("Cookie", cookie);
                Log.v("OkHttp", "Adding Header: " + cookie); // This is done so I know which headers are being added; this interceptor is used after the normal logging of OkHttp
            }
            return chain.proceed(builder.build());
        }
    }

    public class ReceivedCookiesInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Response originalResponse = chain.proceed(chain.request());

            if (!originalResponse.headers("Set-Cookie").isEmpty()) {
                HashSet<String> cookies = new HashSet<>();

                for (String header : originalResponse.headers("Set-Cookie")) {
                    cookies.add(header);
                }
                Preferences.getInstance().getSharedPreferences().edit().putStringSet(Preferences.COOKIE,cookies);
            }

            return originalResponse;
        }
    }
}
