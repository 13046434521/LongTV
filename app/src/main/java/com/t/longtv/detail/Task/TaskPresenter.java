package com.t.longtv.detail.Task;

import com.t.longtv.base.BasePresenter;
import com.t.longtv.bean.TaskBean;
import com.t.longtv.dao.dbutils.UserDBUtils;
import com.t.longtv.http.ApiObserveble;
import com.t.longtv.http.ApiRetrofit;
import com.t.longtv.http.ApiService;
import com.t.longtv.http.DefaultApiObserverble;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：龙昊
 * 日期：2018/5/3 15:15
 * 描述：
 */
public class TaskPresenter extends BasePresenter<TaskContract.View> implements TaskContract.Presenter {
    public TaskPresenter(TaskContract.View view) {
        super(view);
    }

    @Override
    public void start() {

    }

    @Override
    public void loadData() {
        ApiObserveble.defaultMethod(
                ApiRetrofit.getInstance().create(ApiService.class)
                        .getTask(getMap())
        ).subscribe(new DefaultApiObserverble<TaskBean>() {
            @Override
            public void onSuccess(TaskBean taskBean) {
                getView().loadDataSuccess(taskBean.getData());
            }

            @Override
            public void onFailed(Throwable e) {
                getView().loadDataFailed(e.toString());
            }
        });
    }

    @Override
    public void commitData() {

    }

    private Map getMap(){
        Map map=new HashMap<>();
        //http://api.huomao.com/
        // task/getAllTaskStat
        // ?refer=android&access_token=617ecb35fb52fe1b2b22fc0893387282
        // &expires_time=1525325896
        // &mp_openid=1bc4b3029536fefc681320df902cc73e
        // &refer=android&task_len=8&time=1525328616
        // &token=5c834dfb3923292356d8992b85610581&
        // uid=13480061&an=68&ver=2.4
        map.put("refer","android");
        map.put("access_token","617ecb35fb52fe1b2b22fc0893387282");
        map.put("expires_time","1525325896");
        map.put("mp_openid","1bc4b3029536fefc681320df902cc73e");
        map.put("refer","android");
        map.put("task_len","8");
        map.put("time","1525328616");
        map.put("token","5c834dfb3923292356d8992b85610581");
        map.put("uid", UserDBUtils.getInstance().getUserInfo().getUid());
        map.put("an","68");
        map.put("ver","2.4");
        return map;
    }

    private void getFreebeanMap(String taskId){
        //http://api.huomao.com
        // /task/getTaskFreeBean
        // ?refer=android
        // &access_token=617ecb35fb52fe1b2b22fc0893387282
        // &expires_time=1525325896&mp_openid=fe745483eb518c1c9448a40ba5afa28a
        // &task_id=5&refer=android&time=1525333264
        // &token=71449b692e1f0c3202c89bd60776c3aa
        // &uid=13480061&an=68&ver=2.4
    }
}
