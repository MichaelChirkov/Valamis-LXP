package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFTincanLrsContextActivities;
import com.arcusys.learn.persistence.liferay.model.LFTincanLrsContextActivitiesModel;

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
* The base model implementation for the LFTincanLrsContextActivities service. Represents a row in the &quot;Learn_LFTincanLrsContextActivities&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFTincanLrsContextActivitiesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFTincanLrsContextActivitiesImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFTincanLrsContextActivitiesImpl
* @see com.arcusys.learn.persistence.liferay.model.LFTincanLrsContextActivities
* @see com.arcusys.learn.persistence.liferay.model.LFTincanLrsContextActivitiesModel
* @generated
*/
public class LFTincanLrsContextActivitiesModelImpl extends BaseModelImpl<LFTincanLrsContextActivities>
    implements LFTincanLrsContextActivitiesModel {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this class directly. All methods that expect a l f tincan lrs context activities model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFTincanLrsContextActivities} interface instead.
    */
    public static final String TABLE_NAME = "Learn_LFTincanLrsContextActivities";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "parent", Types.CLOB },
            { "grouping", Types.CLOB },
            { "category", Types.CLOB },
            { "other", Types.CLOB }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFTincanLrsContextActivities (id_ LONG not null primary key,parent TEXT null,grouping TEXT null,category TEXT null,other TEXT null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFTincanLrsContextActivities";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanLrsContextActivities"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanLrsContextActivities"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFTincanLrsContextActivities"));
    private static ClassLoader _classLoader = LFTincanLrsContextActivities.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            LFTincanLrsContextActivities.class
        };
    private long _id;
    private String _parent;
    private String _grouping;
    private String _category;
    private String _other;
    private LFTincanLrsContextActivities _escapedModelProxy;

    public LFTincanLrsContextActivitiesModelImpl() {
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
        return LFTincanLrsContextActivities.class;
    }

    public String getModelClassName() {
        return LFTincanLrsContextActivities.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("parent", getParent());
        attributes.put("grouping", getGrouping());
        attributes.put("category", getCategory());
        attributes.put("other", getOther());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String parent = (String) attributes.get("parent");

        if (parent != null) {
            setParent(parent);
        }

        String grouping = (String) attributes.get("grouping");

        if (grouping != null) {
            setGrouping(grouping);
        }

        String category = (String) attributes.get("category");

        if (category != null) {
            setCategory(category);
        }

        String other = (String) attributes.get("other");

        if (other != null) {
            setOther(other);
        }
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getParent() {
        return _parent;
    }

    public void setParent(String parent) {
        _parent = parent;
    }

    public String getGrouping() {
        return _grouping;
    }

    public void setGrouping(String grouping) {
        _grouping = grouping;
    }

    public String getCategory() {
        return _category;
    }

    public void setCategory(String category) {
        _category = category;
    }

    public String getOther() {
        return _other;
    }

    public void setOther(String other) {
        _other = other;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFTincanLrsContextActivities.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFTincanLrsContextActivities toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (LFTincanLrsContextActivities) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        LFTincanLrsContextActivitiesImpl lfTincanLrsContextActivitiesImpl = new LFTincanLrsContextActivitiesImpl();

        lfTincanLrsContextActivitiesImpl.setId(getId());
        lfTincanLrsContextActivitiesImpl.setParent(getParent());
        lfTincanLrsContextActivitiesImpl.setGrouping(getGrouping());
        lfTincanLrsContextActivitiesImpl.setCategory(getCategory());
        lfTincanLrsContextActivitiesImpl.setOther(getOther());

        lfTincanLrsContextActivitiesImpl.resetOriginalValues();

        return lfTincanLrsContextActivitiesImpl;
    }

    public int compareTo(
        LFTincanLrsContextActivities lfTincanLrsContextActivities) {
        long primaryKey = lfTincanLrsContextActivities.getPrimaryKey();

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

        LFTincanLrsContextActivities lfTincanLrsContextActivities = null;

        try {
            lfTincanLrsContextActivities = (LFTincanLrsContextActivities) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = lfTincanLrsContextActivities.getPrimaryKey();

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
    public CacheModel<LFTincanLrsContextActivities> toCacheModel() {
        LFTincanLrsContextActivitiesCacheModel lfTincanLrsContextActivitiesCacheModel =
            new LFTincanLrsContextActivitiesCacheModel();

        lfTincanLrsContextActivitiesCacheModel.id = getId();

        lfTincanLrsContextActivitiesCacheModel.parent = getParent();

        String parent = lfTincanLrsContextActivitiesCacheModel.parent;

        if ((parent != null) && (parent.length() == 0)) {
            lfTincanLrsContextActivitiesCacheModel.parent = null;
        }

        lfTincanLrsContextActivitiesCacheModel.grouping = getGrouping();

        String grouping = lfTincanLrsContextActivitiesCacheModel.grouping;

        if ((grouping != null) && (grouping.length() == 0)) {
            lfTincanLrsContextActivitiesCacheModel.grouping = null;
        }

        lfTincanLrsContextActivitiesCacheModel.category = getCategory();

        String category = lfTincanLrsContextActivitiesCacheModel.category;

        if ((category != null) && (category.length() == 0)) {
            lfTincanLrsContextActivitiesCacheModel.category = null;
        }

        lfTincanLrsContextActivitiesCacheModel.other = getOther();

        String other = lfTincanLrsContextActivitiesCacheModel.other;

        if ((other != null) && (other.length() == 0)) {
            lfTincanLrsContextActivitiesCacheModel.other = null;
        }

        return lfTincanLrsContextActivitiesCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", parent=");
        sb.append(getParent());
        sb.append(", grouping=");
        sb.append(getGrouping());
        sb.append(", category=");
        sb.append(getCategory());
        sb.append(", other=");
        sb.append(getOther());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append(
            "com.arcusys.learn.persistence.liferay.model.LFTincanLrsContextActivities");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>parent</column-name><column-value><![CDATA[");
        sb.append(getParent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>grouping</column-name><column-value><![CDATA[");
        sb.append(getGrouping());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>category</column-name><column-value><![CDATA[");
        sb.append(getCategory());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>other</column-name><column-value><![CDATA[");
        sb.append(getOther());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
