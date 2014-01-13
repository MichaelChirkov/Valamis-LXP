package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile;
import com.arcusys.learn.persistence.liferay.service.LFTincanLrsActivityProfileLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the LFTincanLrsActivityProfile service. Represents a row in the &quot;Learn_LFTincanLrsActivityProfile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFTincanLrsActivityProfileImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsActivityProfileImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFTincanLrsActivityProfile
 * @generated
 */
public abstract class LFTincanLrsActivityProfileBaseImpl
    extends LFTincanLrsActivityProfileModelImpl
    implements LFTincanLrsActivityProfile {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f tincan lrs activity profile model instance should use the {@link LFTincanLrsActivityProfile} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            LFTincanLrsActivityProfileLocalServiceUtil.addLFTincanLrsActivityProfile(this);
        } else {
            LFTincanLrsActivityProfileLocalServiceUtil.updateLFTincanLrsActivityProfile(this);
        }
    }
}