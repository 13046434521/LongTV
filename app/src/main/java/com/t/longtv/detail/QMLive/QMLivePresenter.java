package com.t.longtv.detail.QMLive;

import com.t.longtv.Tags;
import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.QmLiveBean;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiQmRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserveble;

import io.reactivex.Observable;

/**
 * 作者：龙昊
 * 日期：2018/5/6 00:56
 * 描述：
 */
public class QMLivePresenter extends BasePresenter<QMLiveContarct.View> implements QMLiveContarct.Presenter {
    public QMLivePresenter(QMLiveContarct.View view) {
        super(view);
    }

    @Override
    public void loadData(String title) {
        Observable observable=null;
        if (title.equals(Tags.QM_ALL)){
            observable=ApiQmRetrofit.getInstance().create(ApiService.class).getQMLiveAll();
        }
        else{
            observable=ApiQmRetrofit.getInstance().create(ApiService.class).getQMLive(getSlug(title));
        }

        ApiObserveble.defaultMethed(observable).subscribe(new DefaultApiObserveble<QmLiveBean>() {
            @Override
            public void onSuccess(QmLiveBean qmLiveBean) {
                getView().loadSuccess(qmLiveBean.getData());
            }

            @Override
            public void onFailed(Throwable e) {
                getView().loadFailed(e.toString());
            }
        });
    }

    @Override
    public void start() {

    }

    private String getSlug(String title) {
        String slug;
        switch (title) {
            case Tags.QM_ALL:
                slug = "all";
                break;
            case Tags.QM_STAR:
                slug = "beauty";
                break;
            case Tags.QM_LOL:
                slug = "lol";
                break;
            case Tags.QM_JUEDI:
                slug = "juediqiusheng";
                break;
            case Tags.QM_SHOWING:
                slug = "showing";
                break;
            case Tags.QM_JDMOBILE:
                slug = "jdqssy";
                break;
            case Tags.QM_DNF:
                slug = "dnf";
                break;
            case Tags.QM_WANGZHE:
                slug = "wangzhe";
                break;
            case Tags.QM_FOOD:
                slug = "chihewanle";
                break;
            case Tags.QM_PAJ:
                slug = "juezhanpinganjing";
                break;
            case Tags.QM_MOBILEGAME:
                slug = "mobilegame";
                break;
            case Tags.QM_CF:
                slug = "cfpc";
                break;
            case Tags.QM_HOSTGAME:
                slug = "tvgame";
                break;
            case Tags.QM_QQCAR:
                slug = "qqfeiche";
                break;
            case Tags.QM_GRSM:
                slug = "guangrongshiming";
                break;
            case Tags.QM_HYXD:
                slug = "huangyexingdong";
                break;
            case Tags.QM_TERMINATOR:
                slug = "zhongjiezhe2";
                break;
            case Tags.QM_XMCS:
                slug = "xiaomichaoshen";
                break;
            case Tags.QM_LZG:
                slug = "longzhigu";
                break;
            case Tags.QM_QQCARMOBILE:
                slug = "qqfeicheshouyou";
                break;
            case Tags.QM_CFMOBILE:
                slug = "cfshouyou";
                break;
            case Tags.QM_CAR:
                slug = "qiche";
                break;
            case Tags.QM_TANK:
                slug = "tank";
                break;
            case Tags.QM_STREET:
                slug = "street";
                break;
            case Tags.QM_ECY:
                slug = "erciyuan";
                break;
            case Tags.QM_OLD:
                slug = "huaijiu";
                break;
            case Tags.QM_SNAKE:
                slug = "snake";
                break;
            case Tags.QM_BXJG:
                slug = "bianxingjingang";
                break;
            case Tags.QM_JL:
                slug = "jianling";
                break;
            case Tags.QM_KB:
                slug = "kb";
                break;
            case Tags.QM_YYS:
                slug = "yys";
                break;
            case Tags.QM_WOLF:
                slug = "langrensha";
                break;
            case Tags.QM_AU:
                slug = "au";
                break;
            case Tags.QM_ZJFB:
                slug = "zhuangjiafengbao";
                break;
            case Tags.QM_HY:
                slug = "huoying";
                break;
            case Tags.QM_JXQY:
                slug = "jianxiaqingyuan";
                break;
            case Tags.QM_QP:
                slug = "qipai";
                break;
            case Tags.QM_YMR:
                slug = "yemanren";
                break;
            case Tags.QM_CSZC:
                slug = "chuangshizhanche";
                break;
            case Tags.QM_PLAY:
                slug = "play";
                break;
            case Tags.QM_MSG:
                slug = "msg";
                break;
            case Tags.QM_DOTA2:
                slug = "dota2";
                break;
            case Tags.QM_FS:
                slug = "fs";
                break;
            case Tags.QM_OW:
                slug = "overwatch";
                break;
            case Tags.QM_RW:
                slug = "renwen";
                break;
            case Tags.QM_HEARTSTONE:
                slug = "heartstone";
                break;
            case Tags.QM_NZ:
                slug = "nizhan";
                break;
            case Tags.QM_WEBGAME:
                slug = "webgame";
                break;
            case Tags.QM_CQ:
                slug = "chuanqi";
                break;
            case Tags.QM_QIUQIU:
                slug = "qiuqiu";
                break;
            case Tags.QM_CSGO:
                slug = "csgo";
                break;
            case Tags.QM_NBA2K:
                slug = "nba2k";
                break;
            case Tags.QM_QHYX:
                slug = "qianghuoyouxia";
                break;
            case Tags.QM_FIFA:
                slug = "fifa";
                break;
            case Tags.QM_TTLRS:
                slug = "tiantianlangrensha";
                break;
            case Tags.QM_WAR3:
                slug = "war3";
                break;
            case Tags.QM_MINECRAFT:
                slug = "minecraft";
                break;
            case Tags.QM_QMCP:
                slug = "quanminchupin";
                break;
            case Tags.QM_BLIZZARD:
                slug = "blizzard";
                break;
            case Tags.QM_XYZX:
                slug = "xinyouzhongxin";
                break;
            default:
                slug = "all";
                break;
        }
        return slug;
    }
}
