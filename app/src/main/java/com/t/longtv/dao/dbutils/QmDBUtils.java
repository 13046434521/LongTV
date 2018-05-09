package com.t.longtv.dao.dbutils;

import com.t.longtv.AppAplication;
import com.t.longtv.bean.QmTitleBean;
import com.t.longtv.dao.DaoSession;
import com.t.longtv.dao.QmTitleBeanDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * 作者：龙昊
 * 日期：2018/5/8 10:52
 * 描述：
 */
public class QmDBUtils {
    private QmTitleBeanDao qmTitleBeanDao;
    private QmDBUtils(){
        DaoSession   daoSession= AppAplication.getAppAplication().getUserInfoDaoSession();
        qmTitleBeanDao=daoSession.getQmTitleBeanDao();
    }

    public static QmDBUtils getInstance(){
        return QmDBUtilsHolder.qmDBUtils;
    }

    public boolean hasQMInfo(){
        QueryBuilder<QmTitleBean> qb=qmTitleBeanDao.queryBuilder();
        return qb.list()!=null&&qb.list().size()>0;
    }

    public QmTitleBean getQMInfo(){
        QueryBuilder<QmTitleBean> qb=qmTitleBeanDao.queryBuilder();
        if (hasQMInfo()){
            return qb.list().get(0);
        }
        return null;
    }

    public List<QmTitleBean> getQMInfoALL(){
        QueryBuilder<QmTitleBean> qb=qmTitleBeanDao.queryBuilder();
        if (hasQMInfo()){
            return qb.list();
        }
        return null;
    }

    public void add(int i, QmTitleBean qmTitleBean){
        QueryBuilder<QmTitleBean> qb=qmTitleBeanDao.queryBuilder();
        if (hasQMInfo()){
            qb.list().add(i,qmTitleBean);
        }
    }

    public void insert(QmTitleBean qmTitleBean){
        if (hasQMInfo()){
            qmTitleBeanDao.update(qmTitleBean);
        }
        else{
            qmTitleBeanDao.insert(qmTitleBean);
        }
    }

    public void delete(int i){
        QueryBuilder<QmTitleBean> qb=qmTitleBeanDao.queryBuilder();
        if (hasQMInfo()){
            qb.list().remove(i);
        }
    }

    public void deleteAll(){
        qmTitleBeanDao.deleteAll();
    }

    private static class QmDBUtilsHolder{
        private static QmDBUtils qmDBUtils=new QmDBUtils();
    }
}
