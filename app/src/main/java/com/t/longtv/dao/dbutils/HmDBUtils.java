package com.t.longtv.dao.dbutils;

import com.t.longtv.AppAplication;
import com.t.longtv.bean.HMTitleBean;
import com.t.longtv.dao.DaoSession;
import com.t.longtv.dao.HMTitleBeanDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/8 11:04
 * 描述：
 */
public class HmDBUtils {
    private HMTitleBeanDao hmTitleBeanDao;
    private HmDBUtils(){
        DaoSession daoSession= AppAplication.getAppAplication().getUserInfoDaoSession();
        hmTitleBeanDao=daoSession.getHMTitleBeanDao();
    }
    public static HmDBUtils getInstance(){
        return HmDBUtilsHolder.hmDBUtils;
    }

    public boolean hasHmInfo(){
        QueryBuilder<HMTitleBean> qb=hmTitleBeanDao.queryBuilder();

        return qb.list()!=null&&qb.list().size()>0;
    }


    public void update(HMTitleBean hmTitleBean){
        if (hasHmInfo()){
            hmTitleBeanDao.update(hmTitleBean);
        }
        else{
            hmTitleBeanDao.insert(hmTitleBean);
        }
    }

    public void insert(HMTitleBean hmTitleBean){
        hmTitleBeanDao.insert(hmTitleBean);
    }

    public List<HMTitleBean> getHmInfo(){
        QueryBuilder<HMTitleBean> qb=hmTitleBeanDao.queryBuilder();
        if (hasHmInfo()){
            return qb.list();
        }
        return null;
    }

    public List<HMTitleBean> getQMInfoALL(){
        QueryBuilder<HMTitleBean> qb=hmTitleBeanDao.queryBuilder();
        if (hasHmInfo()){
            return qb.list();
        }
        return null;
    }

    public void MoveData(int position,int targetPosition) throws Exception {
        QueryBuilder<HMTitleBean> qb=hmTitleBeanDao.queryBuilder();
        if (hasHmInfo()){
            if (position>qb.list().size()||targetPosition>qb.list().size()){
                throw new Exception("position And targetPosition Too Bigger than qb.list");
            }
            HMTitleBean bean=qb.list().get(position);
            HMTitleBean targetBean=qb.list().get(targetPosition);

            qb.list().remove(position);
            qb.list().add(targetBean);

            qb.list().remove(targetPosition);
            qb.list().add(bean);
        }
    }

    public void deleteAll(){
        hmTitleBeanDao.deleteAll();
    }

    private static class HmDBUtilsHolder{
        private static HmDBUtils hmDBUtils=new HmDBUtils();
    }
}
