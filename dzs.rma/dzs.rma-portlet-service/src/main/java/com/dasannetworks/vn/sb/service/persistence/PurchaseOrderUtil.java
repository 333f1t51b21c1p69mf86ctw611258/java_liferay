package com.dasannetworks.vn.sb.service.persistence;

import com.dasannetworks.vn.sb.model.PurchaseOrder;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the purchase order service. This utility wraps {@link PurchaseOrderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurchaseOrderPersistence
 * @see PurchaseOrderPersistenceImpl
 * @generated
 */
public class PurchaseOrderUtil {
    private static PurchaseOrderPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(PurchaseOrder purchaseOrder) {
        getPersistence().clearCache(purchaseOrder);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<PurchaseOrder> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PurchaseOrder> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PurchaseOrder> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static PurchaseOrder update(PurchaseOrder purchaseOrder)
        throws SystemException {
        return getPersistence().update(purchaseOrder);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static PurchaseOrder update(PurchaseOrder purchaseOrder,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(purchaseOrder, serviceContext);
    }

    /**
    * Returns the purchase order where purchaseOrderNumber = &#63; or throws a {@link com.dasannetworks.vn.sb.NoSuchPurchaseOrderException} if it could not be found.
    *
    * @param purchaseOrderNumber the purchase order number
    * @return the matching purchase order
    * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a matching purchase order could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder findByPurchaseOrderNumber(
        java.lang.String purchaseOrderNumber)
        throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPurchaseOrderNumber(purchaseOrderNumber);
    }

    /**
    * Returns the purchase order where purchaseOrderNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param purchaseOrderNumber the purchase order number
    * @return the matching purchase order, or <code>null</code> if a matching purchase order could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder fetchByPurchaseOrderNumber(
        java.lang.String purchaseOrderNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPurchaseOrderNumber(purchaseOrderNumber);
    }

    /**
    * Returns the purchase order where purchaseOrderNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param purchaseOrderNumber the purchase order number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching purchase order, or <code>null</code> if a matching purchase order could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder fetchByPurchaseOrderNumber(
        java.lang.String purchaseOrderNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPurchaseOrderNumber(purchaseOrderNumber,
            retrieveFromCache);
    }

    /**
    * Removes the purchase order where purchaseOrderNumber = &#63; from the database.
    *
    * @param purchaseOrderNumber the purchase order number
    * @return the purchase order that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder removeByPurchaseOrderNumber(
        java.lang.String purchaseOrderNumber)
        throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByPurchaseOrderNumber(purchaseOrderNumber);
    }

    /**
    * Returns the number of purchase orders where purchaseOrderNumber = &#63;.
    *
    * @param purchaseOrderNumber the purchase order number
    * @return the number of matching purchase orders
    * @throws SystemException if a system exception occurred
    */
    public static int countByPurchaseOrderNumber(
        java.lang.String purchaseOrderNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPurchaseOrderNumber(purchaseOrderNumber);
    }

    /**
    * Returns all the purchase orders where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @return the matching purchase orders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.PurchaseOrder> findByCustomerId(
        java.lang.Long customerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCustomerId(customerId);
    }

    /**
    * Returns a range of all the purchase orders where customerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param customerId the customer ID
    * @param start the lower bound of the range of purchase orders
    * @param end the upper bound of the range of purchase orders (not inclusive)
    * @return the range of matching purchase orders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.PurchaseOrder> findByCustomerId(
        java.lang.Long customerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCustomerId(customerId, start, end);
    }

    /**
    * Returns an ordered range of all the purchase orders where customerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param customerId the customer ID
    * @param start the lower bound of the range of purchase orders
    * @param end the upper bound of the range of purchase orders (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching purchase orders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.PurchaseOrder> findByCustomerId(
        java.lang.Long customerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCustomerId(customerId, start, end, orderByComparator);
    }

    /**
    * Returns the first purchase order in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase order
    * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a matching purchase order could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder findByCustomerId_First(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCustomerId_First(customerId, orderByComparator);
    }

    /**
    * Returns the first purchase order in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching purchase order, or <code>null</code> if a matching purchase order could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder fetchByCustomerId_First(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCustomerId_First(customerId, orderByComparator);
    }

    /**
    * Returns the last purchase order in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase order
    * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a matching purchase order could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder findByCustomerId_Last(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCustomerId_Last(customerId, orderByComparator);
    }

    /**
    * Returns the last purchase order in the ordered set where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching purchase order, or <code>null</code> if a matching purchase order could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder fetchByCustomerId_Last(
        java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCustomerId_Last(customerId, orderByComparator);
    }

    /**
    * Returns the purchase orders before and after the current purchase order in the ordered set where customerId = &#63;.
    *
    * @param purchaseOrderId the primary key of the current purchase order
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next purchase order
    * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a purchase order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder[] findByCustomerId_PrevAndNext(
        long purchaseOrderId, java.lang.Long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCustomerId_PrevAndNext(purchaseOrderId, customerId,
            orderByComparator);
    }

    /**
    * Removes all the purchase orders where customerId = &#63; from the database.
    *
    * @param customerId the customer ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCustomerId(java.lang.Long customerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCustomerId(customerId);
    }

    /**
    * Returns the number of purchase orders where customerId = &#63;.
    *
    * @param customerId the customer ID
    * @return the number of matching purchase orders
    * @throws SystemException if a system exception occurred
    */
    public static int countByCustomerId(java.lang.Long customerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCustomerId(customerId);
    }

    /**
    * Caches the purchase order in the entity cache if it is enabled.
    *
    * @param purchaseOrder the purchase order
    */
    public static void cacheResult(
        com.dasannetworks.vn.sb.model.PurchaseOrder purchaseOrder) {
        getPersistence().cacheResult(purchaseOrder);
    }

    /**
    * Caches the purchase orders in the entity cache if it is enabled.
    *
    * @param purchaseOrders the purchase orders
    */
    public static void cacheResult(
        java.util.List<com.dasannetworks.vn.sb.model.PurchaseOrder> purchaseOrders) {
        getPersistence().cacheResult(purchaseOrders);
    }

    /**
    * Creates a new purchase order with the primary key. Does not add the purchase order to the database.
    *
    * @param purchaseOrderId the primary key for the new purchase order
    * @return the new purchase order
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder create(
        long purchaseOrderId) {
        return getPersistence().create(purchaseOrderId);
    }

    /**
    * Removes the purchase order with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param purchaseOrderId the primary key of the purchase order
    * @return the purchase order that was removed
    * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a purchase order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder remove(
        long purchaseOrderId)
        throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(purchaseOrderId);
    }

    public static com.dasannetworks.vn.sb.model.PurchaseOrder updateImpl(
        com.dasannetworks.vn.sb.model.PurchaseOrder purchaseOrder)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(purchaseOrder);
    }

    /**
    * Returns the purchase order with the primary key or throws a {@link com.dasannetworks.vn.sb.NoSuchPurchaseOrderException} if it could not be found.
    *
    * @param purchaseOrderId the primary key of the purchase order
    * @return the purchase order
    * @throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException if a purchase order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder findByPrimaryKey(
        long purchaseOrderId)
        throws com.dasannetworks.vn.sb.NoSuchPurchaseOrderException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(purchaseOrderId);
    }

    /**
    * Returns the purchase order with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param purchaseOrderId the primary key of the purchase order
    * @return the purchase order, or <code>null</code> if a purchase order with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.dasannetworks.vn.sb.model.PurchaseOrder fetchByPrimaryKey(
        long purchaseOrderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(purchaseOrderId);
    }

    /**
    * Returns all the purchase orders.
    *
    * @return the purchase orders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.PurchaseOrder> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the purchase orders.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of purchase orders
    * @param end the upper bound of the range of purchase orders (not inclusive)
    * @return the range of purchase orders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.PurchaseOrder> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the purchase orders.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.vn.sb.model.impl.PurchaseOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of purchase orders
    * @param end the upper bound of the range of purchase orders (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of purchase orders
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.dasannetworks.vn.sb.model.PurchaseOrder> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the purchase orders from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of purchase orders.
    *
    * @return the number of purchase orders
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PurchaseOrderPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PurchaseOrderPersistence) PortletBeanLocatorUtil.locate(com.dasannetworks.vn.sb.service.ClpSerializer.getServletContextName(),
                    PurchaseOrderPersistence.class.getName());

            ReferenceRegistry.registerReference(PurchaseOrderUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PurchaseOrderPersistence persistence) {
    }
}
