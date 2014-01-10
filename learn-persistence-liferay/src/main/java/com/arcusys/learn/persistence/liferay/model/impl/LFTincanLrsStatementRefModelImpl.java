package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef;
import com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRefModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
* The base model implementation for the LFTincanLrsStatementRef service. Represents a row in the &quot;Learn_LFTincanLrsStatementRef&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRefModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFTincanLrsStatementRefImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFTincanLrsStatementRefImpl
* @see com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef
* @see com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRefModel
* @generated
*/
public class LFTincanLrsStatementRefModelImpl extends BaseModelImpl<LFTincanLrsStatementRef>
    implements LFTincanLrsStatementRefModel {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this class directly. All methods that expect a l f tincan lrs statement ref model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef} interface instead.
    */
    public static final String TABLE_NAME = "Learn_LFTincanLrsStatementRef";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "uuid_", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFTincanLrsStatementRef (id_ LONG not null primary key,uuid_ VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFTincanLrsStatementRef";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef"));
    private static ClassLoader _classLoader = LFTincanLrsStatementRef.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            LFTincanLrsStatementRef.class
        };
    private long _id;
    private String _uuid;
    private LFTincanLrsStatementRef _escapedModelProxy;

    public LFTincanLrsStatementRefModelImpl() {
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_id);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return LFTincanLrsStatementRef.class;
    }

    public String getModelClassName() {
        return LFTincanLrsStatementRef.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("uuid", getUuid());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFTincanLrsStatementRef.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFTincanLrsStatementRef toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (LFTincanLrsStatementRef) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        LFTincanLrsStatementRefImpl lfTincanLrsStatementRefImpl = new LFTincanLrsStatementRefImpl();

        lfTincanLrsStatementRefImpl.setId(getId());
        lfTincanLrsStatementRefImpl.setUuid(getUuid());

        lfTincanLrsStatementRefImpl.resetOriginalValues();

        return lfTincanLrsStatementRefImpl;
    }

    public int compareTo(LFTincanLrsStatementRef lfTincanLrsStatementRef) {
        long primaryKey = lfTincanLrsStatementRef.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        LFTincanLrsStatementRef lfTincanLrsStatementRef = null;

        try {
            lfTincanLrsStatementRef = (LFTincanLrsStatementRef) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = lfTincanLrsStatementRef.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<LFTincanLrsStatementRef> toCacheModel() {
        LFTincanLrsStatementRefCacheModel lfTincanLrsStatementRefCacheModel = new LFTincanLrsStatementRefCacheModel();

        lfTincanLrsStatementRefCacheModel.id = getId();

        lfTincanLrsStatementRefCacheModel.uuid = getUuid();

        String uuid = lfTincanLrsStatementRefCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            lfTincanLrsStatementRefCacheModel.uuid = null;
        }

        return lfTincanLrsStatementRefCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", uuid=");
        sb.append(getUuid());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append(
            "com.arcusys.learn.persistence.liferay.model.LFTincanLrsStatementRef");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
