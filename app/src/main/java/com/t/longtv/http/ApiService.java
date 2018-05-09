package com.t.longtv.http;

import com.t.longtv.AppConstants;
import com.t.longtv.bean.BannerBean;
import com.t.longtv.bean.EntertainBean;
import com.t.longtv.bean.HistoryBean;
import com.t.longtv.bean.HmChannenBean;
import com.t.longtv.bean.LiveBean;
import com.t.longtv.bean.LiveDetailBean;
import com.t.longtv.bean.MineModuleBean;
import com.t.longtv.bean.ParkBean;
import com.t.longtv.bean.QmLiveBean;
import com.t.longtv.bean.QmRecommendBean;
import com.t.longtv.bean.RecommendBean;
import com.t.longtv.bean.SubscribeBean;
import com.t.longtv.bean.TaskBean;
import com.t.longtv.bean.UserInfoBean;
import com.t.longtv.bean.UserLoginBean;
import com.t.longtv.bean.UserinfoAdBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * 作者：龙昊
 * 日期：2018/4/10 08:08
 * 描述：Api类
 */
public interface ApiService {
    @GET(AppConstants.HTTP.Live_URL)
    Observable<LiveBean> getLive(@QueryMap Map<String,String> map);

    @GET(AppConstants.HTTP.Live_Detail_URL)
    Observable<LiveDetailBean> getLiveDetail(@QueryMap Map<String, String> map, @Query("refer") String refer );

    @GET(AppConstants.HTTP.Park_URL)
    Observable<ParkBean> getPark(@QueryMap Map<String, String> map);

    @GET(AppConstants.HTTP.Recommend_Banner_URL)
    Observable<BannerBean> getRecommendBanner(@QueryMap Map<String, String> map, @Query("refer") String refer);

    @GET(AppConstants.HTTP.Recommend_URL)
    Observable<RecommendBean> getRecommend(@QueryMap Map<String,String>map,@Query("refer") String refer);

    @GET(AppConstants.HTTP.Entertain_URL)
    Observable<EntertainBean> getEntertain(@QueryMap Map<String,String> map);

    @GET(AppConstants.HTTP.Entertain_Banner_URL)
    Observable<BannerBean> getEntertainBanner(@QueryMap Map<String,String>map,@Query("refer") String refer);

    @GET(AppConstants.HTTP.Mine_AD_URL)
    Observable<UserinfoAdBean> getUserAd(@QueryMap Map<String,String> map);

    @GET(AppConstants.HTTP.Mine_Module_URL)
    Observable<MineModuleBean> getMineModule(@QueryMap Map<String,String> map);

    @GET(AppConstants.HTTP.Login_URL)
    Observable<UserLoginBean> getLogin(@QueryMap Map<String,String>map, @Query("refer") String refer);

    @GET(AppConstants.HTTP.UserInfo_URL)
    Observable<UserInfoBean> getUserInfo(@QueryMap Map<String,String>map, @Query("refer") String refer);

    @GET(AppConstants.HTTP.Subscribe_URL)
    Observable<SubscribeBean> getSubscribe(@QueryMap Map<String,String> map,@Query("refer") String refer);

    @GET(AppConstants.HTTP.History_URL)
    Observable<HistoryBean>getHistory(@QueryMap Map<String,String> map,@Query("refer")String refer);

    @GET(AppConstants.HTTP.Task_URL)
    Observable<TaskBean> getTask(@QueryMap Map<String,String> map);

    @GET(AppConstants.HTTP.QUANMIN_RECOMMEND_URL)
    Observable<QmRecommendBean> getQMRecmmend();

    @GET(AppConstants.HTTP.QUANMIN_LiveAll_URL)
    Observable<QmLiveBean> getQMLiveAll();

    @GET(AppConstants.HTTP.QUANMIN_Live_URL)
    Observable<QmLiveBean> getQMLive(@Path("slug")String slug);

    @GET(AppConstants.HTTP.QUANMIN_ROOM_URL)
    Observable<QmLiveBean> getQMRoom(@Path("uid")String uid);

    @GET(AppConstants.HTTP.HmChannel_URL)
    Observable<HmChannenBean> getHmChannel(@QueryMap Map<String,String> map);
}
