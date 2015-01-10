package greendao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig matchDaoConfig;

    private final MatchDao matchDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        matchDaoConfig = daoConfigMap.get(MatchDao.class).clone();
        matchDaoConfig.initIdentityScope(type);

        matchDao = new MatchDao(matchDaoConfig, this);

        registerDao(Match.class, matchDao);
    }
    
    public void clear() {
        matchDaoConfig.getIdentityScope().clear();
    }

    public MatchDao getMatchDao() {
        return matchDao;
    }

}
