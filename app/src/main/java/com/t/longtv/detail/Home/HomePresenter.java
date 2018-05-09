package com.t.longtv.detail.Home;

import com.alibaba.android.arouter.launcher.ARouter;
import com.t.longtv.AppConstants;
import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.HMTitleBean;
import com.t.longtv.dao.dbutils.HmDBUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/4/15 15:43
 * 描述：
 */
public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {
    public HomePresenter(HomeContract.View view) {
        super(view);
    }

    @Override
    public List<HMTitleBean> loadTitle() {
        List<HMTitleBean> list=HmDBUtils.getInstance().getHmInfo();
        list.add(0,new HMTitleBean("全部直播","","0"));
        return list;
    }

    @Override
    public List<String> loadLiveTitle() {
        List<String> list=new ArrayList<>(16);
        list.add("全部直播");
        list.add("DOTA2");
        list.add("娱乐星秀");
        list.add("英雄联盟");
        list.add("守望先锋");
        list.add("CSGO");
        return list;
    }

    @Override
    public String getGid(String title) {
        String gid="0";
        switch (title) {
            case "全部直播":
                gid = "0";
                break;
            case "DOTA2":
                gid = "23";
                break;
            case "娱乐星秀":
                gid = "32";
                break;
            case "英雄联盟":
                gid = "17";
                break;
            case "守望先锋":
                gid = "103";
                break;
            case "CSGO":
                gid = "20";
                break;
        }

        return gid;
    }

    @Override
    public void getSearch() {

    }

    @Override
    public void getHistory() {
        ARouter.getInstance().build(AppConstants.ARouter_History).navigation();
//        EventBus.getDefault().post(new PageEvent(AppConstants.ARouter_History));
    }

    @Override
    public void start() {

    }
}
