package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.PurchaseOrder;
import com.dasannetworks.vn.sb.service.PurchaseOrderLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PurchaseOrder service. Represents a row in the &quot;tms_PurchaseOrder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PurchaseOrderImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseOrderImpl
 * @see com.dasannetworks.vn.sb.model.PurchaseOrder
 * @generated
 */
public abstract class PurchaseOrderBaseImpl extends PurchaseOrderModelImpl
    implements PurchaseOrder {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a purchase order model instance should use the {@link PurchaseOrder} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PurchaseOrderLocalServiceUtil.addPurchaseOrder(this);
        } else {
            PurchaseOrderLocalServiceUtil.updatePurchaseOrder(this);
        }
    }
}
