package com.t.longtv.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.t.longtv.bean.QmTitleBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "QM_TITLE_BEAN".
*/
public class QmTitleBeanDao extends AbstractDao<QmTitleBean, Long> {

    public static final String TABLENAME = "QM_TITLE_BEAN";

    /**
     * Properties of entity QmTitleBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property QMTitle = new Property(0, String.class, "QMTitle", false, "QMTITLE");
        public final static Property _id = new Property(1, long.class, "_id", true, "_id");
    }


    public QmTitleBeanDao(DaoConfig config) {
        super(config);
    }
    
    public QmTitleBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"QM_TITLE_BEAN\" (" + //
                "\"QMTITLE\" TEXT," + // 0: QMTitle
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL );"); // 1: _id
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"QM_TITLE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, QmTitleBean entity) {
        stmt.clearBindings();
 
        String QMTitle = entity.getQMTitle();
        if (QMTitle != null) {
            stmt.bindString(1, QMTitle);
        }
        stmt.bindLong(2, entity.get_id());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, QmTitleBean entity) {
        stmt.clearBindings();
 
        String QMTitle = entity.getQMTitle();
        if (QMTitle != null) {
            stmt.bindString(1, QMTitle);
        }
        stmt.bindLong(2, entity.get_id());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 1);
    }    

    @Override
    public QmTitleBean readEntity(Cursor cursor, int offset) {
        QmTitleBean entity = new QmTitleBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // QMTitle
            cursor.getLong(offset + 1) // _id
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, QmTitleBean entity, int offset) {
        entity.setQMTitle(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.set_id(cursor.getLong(offset + 1));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(QmTitleBean entity, long rowId) {
        entity.set_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(QmTitleBean entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(QmTitleBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
