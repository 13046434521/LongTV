package com.t.longtv.dao.dbutils;

import com.t.longtv.AppAplication;
import com.t.longtv.bean.UserLoginBean;
import com.t.longtv.dao.DaoSession;
import com.t.longtv.dao.UserLoginBeanDao;

import org.greenrobot.greendao.query.QueryBuilder;

/**
 * 作者：龙昊
 * 日期：2018/4/26 18:08
 * 描述：
 */
public class UserDBUtils {
    private UserLoginBeanDao userDao;

    private UserDBUtils(){
        DaoSession userInfoDaoSession = AppAplication.getAppAplication().getUserInfoDaoSession();
        userDao = userInfoDaoSession.getUserLoginBeanDao();

    }
    public static UserDBUtils getInstance() {
        return UserDBUtilsHolder.dbUtilsHolder;
    }

    public boolean hasUserInfo() {
        QueryBuilder<UserLoginBean> qb = userDao.queryBuilder();
        return qb.list() != null && qb.list().size() > 0;
    }

    public UserLoginBean getUserInfo() {
        QueryBuilder<UserLoginBean> qb = userDao.queryBuilder();
        if (qb.list() != null && qb.list().size() > 0) {
            return qb.list().get(0);
        }
        return null;
    }

    public void insert(UserLoginBean entity) {
        if (hasUserInfo()) {
            userDao.update(entity);
        } else {
            userDao.insert(entity);
        }
    }

    public void deleteAll() {
        userDao.deleteAll();
    }

    private static class UserDBUtilsHolder{
        static final UserDBUtils dbUtilsHolder=new UserDBUtils();
    }
}
