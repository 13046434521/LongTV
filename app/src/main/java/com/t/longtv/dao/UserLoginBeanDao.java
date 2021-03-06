package com.t.longtv.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.t.longtv.bean.UserLoginBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER_LOGIN_BEAN".
*/
public class UserLoginBeanDao extends AbstractDao<UserLoginBean, Long> {

    public static final String TABLENAME = "USER_LOGIN_BEAN";

    /**
     * Properties of entity UserLoginBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Code = new Property(0, String.class, "code", false, "CODE");
        public final static Property Status = new Property(1, int.class, "status", false, "STATUS");
        public final static Property Message = new Property(2, String.class, "message", false, "MESSAGE");
        public final static Property Invalid = new Property(3, boolean.class, "invalid", false, "INVALID");
        public final static Property TimeStamp = new Property(4, int.class, "timeStamp", false, "TIME_STAMP");
        public final static Property Mobile = new Property(5, String.class, "mobile", false, "MOBILE");
        public final static Property Uid = new Property(6, int.class, "uid", false, "UID");
        public final static Property LoginType = new Property(7, String.class, "loginType", false, "LOGIN_TYPE");
        public final static Property Access_token = new Property(8, String.class, "access_token", false, "ACCESS_TOKEN");
        public final static Property Expires_time = new Property(9, int.class, "expires_time", false, "EXPIRES_TIME");
        public final static Property Verity_token = new Property(10, String.class, "verity_token", false, "VERITY_TOKEN");
        public final static Property _id = new Property(11, long.class, "_id", true, "_id");
    }


    public UserLoginBeanDao(DaoConfig config) {
        super(config);
    }
    
    public UserLoginBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER_LOGIN_BEAN\" (" + //
                "\"CODE\" TEXT," + // 0: code
                "\"STATUS\" INTEGER NOT NULL ," + // 1: status
                "\"MESSAGE\" TEXT," + // 2: message
                "\"INVALID\" INTEGER NOT NULL ," + // 3: invalid
                "\"TIME_STAMP\" INTEGER NOT NULL ," + // 4: timeStamp
                "\"MOBILE\" TEXT," + // 5: mobile
                "\"UID\" INTEGER NOT NULL ," + // 6: uid
                "\"LOGIN_TYPE\" TEXT," + // 7: loginType
                "\"ACCESS_TOKEN\" TEXT," + // 8: access_token
                "\"EXPIRES_TIME\" INTEGER NOT NULL ," + // 9: expires_time
                "\"VERITY_TOKEN\" TEXT," + // 10: verity_token
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL );"); // 11: _id
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER_LOGIN_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UserLoginBean entity) {
        stmt.clearBindings();
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(1, code);
        }
        stmt.bindLong(2, entity.getStatus());
 
        String message = entity.getMessage();
        if (message != null) {
            stmt.bindString(3, message);
        }
        stmt.bindLong(4, entity.getInvalid() ? 1L: 0L);
        stmt.bindLong(5, entity.getTimeStamp());
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(6, mobile);
        }
        stmt.bindLong(7, entity.getUid());
 
        String loginType = entity.getLoginType();
        if (loginType != null) {
            stmt.bindString(8, loginType);
        }
 
        String access_token = entity.getAccess_token();
        if (access_token != null) {
            stmt.bindString(9, access_token);
        }
        stmt.bindLong(10, entity.getExpires_time());
 
        String verity_token = entity.getVerity_token();
        if (verity_token != null) {
            stmt.bindString(11, verity_token);
        }
        stmt.bindLong(12, entity.get_id());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UserLoginBean entity) {
        stmt.clearBindings();
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(1, code);
        }
        stmt.bindLong(2, entity.getStatus());
 
        String message = entity.getMessage();
        if (message != null) {
            stmt.bindString(3, message);
        }
        stmt.bindLong(4, entity.getInvalid() ? 1L: 0L);
        stmt.bindLong(5, entity.getTimeStamp());
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(6, mobile);
        }
        stmt.bindLong(7, entity.getUid());
 
        String loginType = entity.getLoginType();
        if (loginType != null) {
            stmt.bindString(8, loginType);
        }
 
        String access_token = entity.getAccess_token();
        if (access_token != null) {
            stmt.bindString(9, access_token);
        }
        stmt.bindLong(10, entity.getExpires_time());
 
        String verity_token = entity.getVerity_token();
        if (verity_token != null) {
            stmt.bindString(11, verity_token);
        }
        stmt.bindLong(12, entity.get_id());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 11);
    }    

    @Override
    public UserLoginBean readEntity(Cursor cursor, int offset) {
        UserLoginBean entity = new UserLoginBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // code
            cursor.getInt(offset + 1), // status
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // message
            cursor.getShort(offset + 3) != 0, // invalid
            cursor.getInt(offset + 4), // timeStamp
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // mobile
            cursor.getInt(offset + 6), // uid
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // loginType
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // access_token
            cursor.getInt(offset + 9), // expires_time
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // verity_token
            cursor.getLong(offset + 11) // _id
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UserLoginBean entity, int offset) {
        entity.setCode(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setStatus(cursor.getInt(offset + 1));
        entity.setMessage(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setInvalid(cursor.getShort(offset + 3) != 0);
        entity.setTimeStamp(cursor.getInt(offset + 4));
        entity.setMobile(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUid(cursor.getInt(offset + 6));
        entity.setLoginType(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setAccess_token(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setExpires_time(cursor.getInt(offset + 9));
        entity.setVerity_token(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.set_id(cursor.getLong(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(UserLoginBean entity, long rowId) {
        entity.set_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(UserLoginBean entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(UserLoginBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
