package greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table MATCH.
*/
public class MatchDao extends AbstractDao<Match, Long> {

    public static final String TABLENAME = "MATCH";

    /**
     * Properties of entity Match.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property T1 = new Property(1, String.class, "t1", false, "T1");
        public final static Property T2 = new Property(2, String.class, "t2", false, "T2");
        public final static Property T1c = new Property(3, String.class, "t1c", false, "T1C");
        public final static Property T2c = new Property(4, String.class, "t2c", false, "T2C");
        public final static Property ETA = new Property(5, Long.class, "ETA", false, "ETA");
        public final static Property Alarm_set = new Property(6, Boolean.class, "alarm_set", false, "ALARM_SET");
    };


    public MatchDao(DaoConfig config) {
        super(config);
    }
    
    public MatchDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'MATCH' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'T1' TEXT," + // 1: t1
                "'T2' TEXT," + // 2: t2
                "'T1C' TEXT," + // 3: t1c
                "'T2C' TEXT," + // 4: t2c
                "'ETA' INTEGER," + // 5: ETA
                "'ALARM_SET' INTEGER);"); // 6: alarm_set
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'MATCH'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Match entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String t1 = entity.getT1();
        if (t1 != null) {
            stmt.bindString(2, t1);
        }
 
        String t2 = entity.getT2();
        if (t2 != null) {
            stmt.bindString(3, t2);
        }
 
        String t1c = entity.getT1c();
        if (t1c != null) {
            stmt.bindString(4, t1c);
        }
 
        String t2c = entity.getT2c();
        if (t2c != null) {
            stmt.bindString(5, t2c);
        }
 
        Long ETA = entity.getETA();
        if (ETA != null) {
            stmt.bindLong(6, ETA);
        }
 
        Boolean alarm_set = entity.getAlarm_set();
        if (alarm_set != null) {
            stmt.bindLong(7, alarm_set ? 1l: 0l);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Match readEntity(Cursor cursor, int offset) {
        Match entity = new Match( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // t1
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // t2
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // t1c
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // t2c
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // ETA
            cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0 // alarm_set
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Match entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setT1(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setT2(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setT1c(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setT2c(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setETA(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setAlarm_set(cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Match entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Match entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
