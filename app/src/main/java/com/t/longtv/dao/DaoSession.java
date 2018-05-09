package com.t.longtv.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.t.longtv.bean.UserLoginBean;
import com.t.longtv.bean.QmTitleBean;
import com.t.longtv.bean.HMTitleBean;

import com.t.longtv.dao.UserLoginBeanDao;
import com.t.longtv.dao.QmTitleBeanDao;
import com.t.longtv.dao.HMTitleBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userLoginBeanDaoConfig;
    private final DaoConfig qmTitleBeanDaoConfig;
    private final DaoConfig hMTitleBeanDaoConfig;

    private final UserLoginBeanDao userLoginBeanDao;
    private final QmTitleBeanDao qmTitleBeanDao;
    private final HMTitleBeanDao hMTitleBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userLoginBeanDaoConfig = daoConfigMap.get(UserLoginBeanDao.class).clone();
        userLoginBeanDaoConfig.initIdentityScope(type);

        qmTitleBeanDaoConfig = daoConfigMap.get(QmTitleBeanDao.class).clone();
        qmTitleBeanDaoConfig.initIdentityScope(type);

        hMTitleBeanDaoConfig = daoConfigMap.get(HMTitleBeanDao.class).clone();
        hMTitleBeanDaoConfig.initIdentityScope(type);

        userLoginBeanDao = new UserLoginBeanDao(userLoginBeanDaoConfig, this);
        qmTitleBeanDao = new QmTitleBeanDao(qmTitleBeanDaoConfig, this);
        hMTitleBeanDao = new HMTitleBeanDao(hMTitleBeanDaoConfig, this);

        registerDao(UserLoginBean.class, userLoginBeanDao);
        registerDao(QmTitleBean.class, qmTitleBeanDao);
        registerDao(HMTitleBean.class, hMTitleBeanDao);
    }
    
    public void clear() {
        userLoginBeanDaoConfig.clearIdentityScope();
        qmTitleBeanDaoConfig.clearIdentityScope();
        hMTitleBeanDaoConfig.clearIdentityScope();
    }

    public UserLoginBeanDao getUserLoginBeanDao() {
        return userLoginBeanDao;
    }

    public QmTitleBeanDao getQmTitleBeanDao() {
        return qmTitleBeanDao;
    }

    public HMTitleBeanDao getHMTitleBeanDao() {
        return hMTitleBeanDao;
    }

}
