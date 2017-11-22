package com.dasannetworks.vn.sb.model.impl;

import com.dasannetworks.vn.sb.model.DeviceExt;
import com.dasannetworks.vn.sb.model.DeviceExtModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DeviceExt service. Represents a row in the &quot;tms_DeviceExt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.dasannetworks.vn.sb.model.DeviceExtModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DeviceExtImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceExtImpl
 * @see com.dasannetworks.vn.sb.model.DeviceExt
 * @see com.dasannetworks.vn.sb.model.DeviceExtModel
 * @generated
 */
public class DeviceExtModelImpl extends BaseModelImpl<DeviceExt>
    implements DeviceExtModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a device ext model instance should use the {@link com.dasannetworks.vn.sb.model.DeviceExt} interface instead.
     */
    public static final String TABLE_NAME = "tms_DeviceExt";
    public static final Object[][] TABLE_COLUMNS = {
            { "deviceExtId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "modelName", Types.VARCHAR },
            { "serialNumber", Types.VARCHAR },
            { "gponSerialNumber", Types.VARCHAR },
            { "boxSerialNumber", Types.VARCHAR },
            { "customerSerialNumber", Types.VARCHAR },
            { "manufacturerSerialNumber", Types.VARCHAR },
            { "hardwareRevision", Types.VARCHAR },
            { "softwareRevision", Types.VARCHAR },
            { "macAddress", Types.VARCHAR },
            { "partNumber", Types.VARCHAR },
            { "specification", Types.VARCHAR },
            { "factoryOut", Types.TIMESTAMP },
            { "status", Types.INTEGER },
            { "ostStatusChangedDate", Types.TIMESTAMP },
            { "deviceExtOrderId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table tms_DeviceExt (deviceExtId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,modelName VARCHAR(75) null,serialNumber VARCHAR(75) null,gponSerialNumber VARCHAR(75) null,boxSerialNumber VARCHAR(75) null,customerSerialNumber VARCHAR(75) null,manufacturerSerialNumber VARCHAR(75) null,hardwareRevision VARCHAR(75) null,softwareRevision VARCHAR(75) null,macAddress VARCHAR(75) null,partNumber VARCHAR(75) null,specification VARCHAR(75) null,factoryOut DATE null,status INTEGER,ostStatusChangedDate DATE null,deviceExtOrderId LONG)";
    public static final String TABLE_SQL_DROP = "drop table tms_DeviceExt";
    public static final String ORDER_BY_JPQL = " ORDER BY deviceExt.deviceExtId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY tms_DeviceExt.deviceExtId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.dasannetworks.vn.sb.model.DeviceExt"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.dasannetworks.vn.sb.model.DeviceExt"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.dasannetworks.vn.sb.model.DeviceExt"),
            true);
    public static long CUSTOMERSERIALNUMBER_COLUMN_BITMASK = 1L;
    public static long DEVICEEXTORDERID_COLUMN_BITMASK = 2L;
    public static long GPONSERIALNUMBER_COLUMN_BITMASK = 4L;
    public static long MODELNAME_COLUMN_BITMASK = 8L;
    public static long SERIALNUMBER_COLUMN_BITMASK = 16L;
    public static long DEVICEEXTID_COLUMN_BITMASK = 32L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.dasannetworks.vn.sb.model.DeviceExt"));
    private static ClassLoader _classLoader = DeviceExt.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            DeviceExt.class
        };
    private long _deviceExtId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _modelName;
    private String _originalModelName;
    private String _serialNumber;
    private String _originalSerialNumber;
    private String _gponSerialNumber;
    private String _originalGponSerialNumber;
    private String _boxSerialNumber;
    private String _customerSerialNumber;
    private String _originalCustomerSerialNumber;
    private String _manufacturerSerialNumber;
    private String _hardwareRevision;
    private String _softwareRevision;
    private String _macAddress;
    private String _partNumber;
    private String _specification;
    private Date _factoryOut;
    private int _status;
    private Date _ostStatusChangedDate;
    private Long _deviceExtOrderId;
    private Long _originalDeviceExtOrderId;
    private boolean _setOriginalDeviceExtOrderId;
    private long _columnBitmask;
    private DeviceExt _escapedModel;

    public DeviceExtModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _deviceExtId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setDeviceExtId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _deviceExtId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return DeviceExt.class;
    }

    @Override
    public String getModelClassName() {
        return DeviceExt.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("deviceExtId", getDeviceExtId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("modelName", getModelName());
        attributes.put("serialNumber", getSerialNumber());
        attributes.put("gponSerialNumber", getGponSerialNumber());
        attributes.put("boxSerialNumber", getBoxSerialNumber());
        attributes.put("customerSerialNumber", getCustomerSerialNumber());
        attributes.put("manufacturerSerialNumber", getManufacturerSerialNumber());
        attributes.put("hardwareRevision", getHardwareRevision());
        attributes.put("softwareRevision", getSoftwareRevision());
        attributes.put("macAddress", getMacAddress());
        attributes.put("partNumber", getPartNumber());
        attributes.put("specification", getSpecification());
        attributes.put("factoryOut", getFactoryOut());
        attributes.put("status", getStatus());
        attributes.put("ostStatusChangedDate", getOstStatusChangedDate());
        attributes.put("deviceExtOrderId", getDeviceExtOrderId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long deviceExtId = (Long) attributes.get("deviceExtId");

        if (deviceExtId != null) {
            setDeviceExtId(deviceExtId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String modelName = (String) attributes.get("modelName");

        if (modelName != null) {
            setModelName(modelName);
        }

        String serialNumber = (String) attributes.get("serialNumber");

        if (serialNumber != null) {
            setSerialNumber(serialNumber);
        }

        String gponSerialNumber = (String) attributes.get("gponSerialNumber");

        if (gponSerialNumber != null) {
            setGponSerialNumber(gponSerialNumber);
        }

        String boxSerialNumber = (String) attributes.get("boxSerialNumber");

        if (boxSerialNumber != null) {
            setBoxSerialNumber(boxSerialNumber);
        }

        String customerSerialNumber = (String) attributes.get(
                "customerSerialNumber");

        if (customerSerialNumber != null) {
            setCustomerSerialNumber(customerSerialNumber);
        }

        String manufacturerSerialNumber = (String) attributes.get(
                "manufacturerSerialNumber");

        if (manufacturerSerialNumber != null) {
            setManufacturerSerialNumber(manufacturerSerialNumber);
        }

        String hardwareRevision = (String) attributes.get("hardwareRevision");

        if (hardwareRevision != null) {
            setHardwareRevision(hardwareRevision);
        }

        String softwareRevision = (String) attributes.get("softwareRevision");

        if (softwareRevision != null) {
            setSoftwareRevision(softwareRevision);
        }

        String macAddress = (String) attributes.get("macAddress");

        if (macAddress != null) {
            setMacAddress(macAddress);
        }

        String partNumber = (String) attributes.get("partNumber");

        if (partNumber != null) {
            setPartNumber(partNumber);
        }

        String specification = (String) attributes.get("specification");

        if (specification != null) {
            setSpecification(specification);
        }

        Date factoryOut = (Date) attributes.get("factoryOut");

        if (factoryOut != null) {
            setFactoryOut(factoryOut);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Date ostStatusChangedDate = (Date) attributes.get(
                "ostStatusChangedDate");

        if (ostStatusChangedDate != null) {
            setOstStatusChangedDate(ostStatusChangedDate);
        }

        Long deviceExtOrderId = (Long) attributes.get("deviceExtOrderId");

        if (deviceExtOrderId != null) {
            setDeviceExtOrderId(deviceExtOrderId);
        }
    }

    @Override
    public long getDeviceExtId() {
        return _deviceExtId;
    }

    @Override
    public void setDeviceExtId(long deviceExtId) {
        _deviceExtId = deviceExtId;
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @Override
    public String getModelName() {
        if (_modelName == null) {
            return StringPool.BLANK;
        } else {
            return _modelName;
        }
    }

    @Override
    public void setModelName(String modelName) {
        _columnBitmask |= MODELNAME_COLUMN_BITMASK;

        if (_originalModelName == null) {
            _originalModelName = _modelName;
        }

        _modelName = modelName;
    }

    public String getOriginalModelName() {
        return GetterUtil.getString(_originalModelName);
    }

    @Override
    public String getSerialNumber() {
        return _serialNumber;
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        _columnBitmask |= SERIALNUMBER_COLUMN_BITMASK;

        if (_originalSerialNumber == null) {
            _originalSerialNumber = _serialNumber;
        }

        _serialNumber = serialNumber;
    }

    public String getOriginalSerialNumber() {
        return _originalSerialNumber;
    }

    @Override
    public String getGponSerialNumber() {
        return _gponSerialNumber;
    }

    @Override
    public void setGponSerialNumber(String gponSerialNumber) {
        _columnBitmask |= GPONSERIALNUMBER_COLUMN_BITMASK;

        if (_originalGponSerialNumber == null) {
            _originalGponSerialNumber = _gponSerialNumber;
        }

        _gponSerialNumber = gponSerialNumber;
    }

    public String getOriginalGponSerialNumber() {
        return _originalGponSerialNumber;
    }

    @Override
    public String getBoxSerialNumber() {
        return _boxSerialNumber;
    }

    @Override
    public void setBoxSerialNumber(String boxSerialNumber) {
        _boxSerialNumber = boxSerialNumber;
    }

    @Override
    public String getCustomerSerialNumber() {
        return _customerSerialNumber;
    }

    @Override
    public void setCustomerSerialNumber(String customerSerialNumber) {
        _columnBitmask |= CUSTOMERSERIALNUMBER_COLUMN_BITMASK;

        if (_originalCustomerSerialNumber == null) {
            _originalCustomerSerialNumber = _customerSerialNumber;
        }

        _customerSerialNumber = customerSerialNumber;
    }

    public String getOriginalCustomerSerialNumber() {
        return _originalCustomerSerialNumber;
    }

    @Override
    public String getManufacturerSerialNumber() {
        return _manufacturerSerialNumber;
    }

    @Override
    public void setManufacturerSerialNumber(String manufacturerSerialNumber) {
        _manufacturerSerialNumber = manufacturerSerialNumber;
    }

    @Override
    public String getHardwareRevision() {
        if (_hardwareRevision == null) {
            return StringPool.BLANK;
        } else {
            return _hardwareRevision;
        }
    }

    @Override
    public void setHardwareRevision(String hardwareRevision) {
        _hardwareRevision = hardwareRevision;
    }

    @Override
    public String getSoftwareRevision() {
        if (_softwareRevision == null) {
            return StringPool.BLANK;
        } else {
            return _softwareRevision;
        }
    }

    @Override
    public void setSoftwareRevision(String softwareRevision) {
        _softwareRevision = softwareRevision;
    }

    @Override
    public String getMacAddress() {
        if (_macAddress == null) {
            return StringPool.BLANK;
        } else {
            return _macAddress;
        }
    }

    @Override
    public void setMacAddress(String macAddress) {
        _macAddress = macAddress;
    }

    @Override
    public String getPartNumber() {
        if (_partNumber == null) {
            return StringPool.BLANK;
        } else {
            return _partNumber;
        }
    }

    @Override
    public void setPartNumber(String partNumber) {
        _partNumber = partNumber;
    }

    @Override
    public String getSpecification() {
        if (_specification == null) {
            return StringPool.BLANK;
        } else {
            return _specification;
        }
    }

    @Override
    public void setSpecification(String specification) {
        _specification = specification;
    }

    @Override
    public Date getFactoryOut() {
        return _factoryOut;
    }

    @Override
    public void setFactoryOut(Date factoryOut) {
        _factoryOut = factoryOut;
    }

    @Override
    public int getStatus() {
        return _status;
    }

    @Override
    public void setStatus(int status) {
        _status = status;
    }

    @Override
    public Date getOstStatusChangedDate() {
        return _ostStatusChangedDate;
    }

    @Override
    public void setOstStatusChangedDate(Date ostStatusChangedDate) {
        _ostStatusChangedDate = ostStatusChangedDate;
    }

    @Override
    public Long getDeviceExtOrderId() {
        return _deviceExtOrderId;
    }

    @Override
    public void setDeviceExtOrderId(Long deviceExtOrderId) {
        _columnBitmask |= DEVICEEXTORDERID_COLUMN_BITMASK;

        if (!_setOriginalDeviceExtOrderId) {
            _setOriginalDeviceExtOrderId = true;

            _originalDeviceExtOrderId = _deviceExtOrderId;
        }

        _deviceExtOrderId = deviceExtOrderId;
    }

    public Long getOriginalDeviceExtOrderId() {
        return _originalDeviceExtOrderId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            DeviceExt.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public DeviceExt toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (DeviceExt) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        DeviceExtImpl deviceExtImpl = new DeviceExtImpl();

        deviceExtImpl.setDeviceExtId(getDeviceExtId());
        deviceExtImpl.setGroupId(getGroupId());
        deviceExtImpl.setCompanyId(getCompanyId());
        deviceExtImpl.setUserId(getUserId());
        deviceExtImpl.setUserName(getUserName());
        deviceExtImpl.setCreateDate(getCreateDate());
        deviceExtImpl.setModifiedDate(getModifiedDate());
        deviceExtImpl.setModelName(getModelName());
        deviceExtImpl.setSerialNumber(getSerialNumber());
        deviceExtImpl.setGponSerialNumber(getGponSerialNumber());
        deviceExtImpl.setBoxSerialNumber(getBoxSerialNumber());
        deviceExtImpl.setCustomerSerialNumber(getCustomerSerialNumber());
        deviceExtImpl.setManufacturerSerialNumber(getManufacturerSerialNumber());
        deviceExtImpl.setHardwareRevision(getHardwareRevision());
        deviceExtImpl.setSoftwareRevision(getSoftwareRevision());
        deviceExtImpl.setMacAddress(getMacAddress());
        deviceExtImpl.setPartNumber(getPartNumber());
        deviceExtImpl.setSpecification(getSpecification());
        deviceExtImpl.setFactoryOut(getFactoryOut());
        deviceExtImpl.setStatus(getStatus());
        deviceExtImpl.setOstStatusChangedDate(getOstStatusChangedDate());
        deviceExtImpl.setDeviceExtOrderId(getDeviceExtOrderId());

        deviceExtImpl.resetOriginalValues();

        return deviceExtImpl;
    }

    @Override
    public int compareTo(DeviceExt deviceExt) {
        long primaryKey = deviceExt.getPrimaryKey();

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
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DeviceExt)) {
            return false;
        }

        DeviceExt deviceExt = (DeviceExt) obj;

        long primaryKey = deviceExt.getPrimaryKey();

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
        DeviceExtModelImpl deviceExtModelImpl = this;

        deviceExtModelImpl._originalModelName = deviceExtModelImpl._modelName;

        deviceExtModelImpl._originalSerialNumber = deviceExtModelImpl._serialNumber;

        deviceExtModelImpl._originalGponSerialNumber = deviceExtModelImpl._gponSerialNumber;

        deviceExtModelImpl._originalCustomerSerialNumber = deviceExtModelImpl._customerSerialNumber;

        deviceExtModelImpl._originalDeviceExtOrderId = deviceExtModelImpl._deviceExtOrderId;

        deviceExtModelImpl._setOriginalDeviceExtOrderId = false;

        deviceExtModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<DeviceExt> toCacheModel() {
        DeviceExtCacheModel deviceExtCacheModel = new DeviceExtCacheModel();

        deviceExtCacheModel.deviceExtId = getDeviceExtId();

        deviceExtCacheModel.groupId = getGroupId();

        deviceExtCacheModel.companyId = getCompanyId();

        deviceExtCacheModel.userId = getUserId();

        deviceExtCacheModel.userName = getUserName();

        String userName = deviceExtCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            deviceExtCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            deviceExtCacheModel.createDate = createDate.getTime();
        } else {
            deviceExtCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            deviceExtCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            deviceExtCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        deviceExtCacheModel.modelName = getModelName();

        String modelName = deviceExtCacheModel.modelName;

        if ((modelName != null) && (modelName.length() == 0)) {
            deviceExtCacheModel.modelName = null;
        }

        deviceExtCacheModel.serialNumber = getSerialNumber();

        String serialNumber = deviceExtCacheModel.serialNumber;

        if ((serialNumber != null) && (serialNumber.length() == 0)) {
            deviceExtCacheModel.serialNumber = null;
        }

        deviceExtCacheModel.gponSerialNumber = getGponSerialNumber();

        String gponSerialNumber = deviceExtCacheModel.gponSerialNumber;

        if ((gponSerialNumber != null) && (gponSerialNumber.length() == 0)) {
            deviceExtCacheModel.gponSerialNumber = null;
        }

        deviceExtCacheModel.boxSerialNumber = getBoxSerialNumber();

        String boxSerialNumber = deviceExtCacheModel.boxSerialNumber;

        if ((boxSerialNumber != null) && (boxSerialNumber.length() == 0)) {
            deviceExtCacheModel.boxSerialNumber = null;
        }

        deviceExtCacheModel.customerSerialNumber = getCustomerSerialNumber();

        String customerSerialNumber = deviceExtCacheModel.customerSerialNumber;

        if ((customerSerialNumber != null) &&
                (customerSerialNumber.length() == 0)) {
            deviceExtCacheModel.customerSerialNumber = null;
        }

        deviceExtCacheModel.manufacturerSerialNumber = getManufacturerSerialNumber();

        String manufacturerSerialNumber = deviceExtCacheModel.manufacturerSerialNumber;

        if ((manufacturerSerialNumber != null) &&
                (manufacturerSerialNumber.length() == 0)) {
            deviceExtCacheModel.manufacturerSerialNumber = null;
        }

        deviceExtCacheModel.hardwareRevision = getHardwareRevision();

        String hardwareRevision = deviceExtCacheModel.hardwareRevision;

        if ((hardwareRevision != null) && (hardwareRevision.length() == 0)) {
            deviceExtCacheModel.hardwareRevision = null;
        }

        deviceExtCacheModel.softwareRevision = getSoftwareRevision();

        String softwareRevision = deviceExtCacheModel.softwareRevision;

        if ((softwareRevision != null) && (softwareRevision.length() == 0)) {
            deviceExtCacheModel.softwareRevision = null;
        }

        deviceExtCacheModel.macAddress = getMacAddress();

        String macAddress = deviceExtCacheModel.macAddress;

        if ((macAddress != null) && (macAddress.length() == 0)) {
            deviceExtCacheModel.macAddress = null;
        }

        deviceExtCacheModel.partNumber = getPartNumber();

        String partNumber = deviceExtCacheModel.partNumber;

        if ((partNumber != null) && (partNumber.length() == 0)) {
            deviceExtCacheModel.partNumber = null;
        }

        deviceExtCacheModel.specification = getSpecification();

        String specification = deviceExtCacheModel.specification;

        if ((specification != null) && (specification.length() == 0)) {
            deviceExtCacheModel.specification = null;
        }

        Date factoryOut = getFactoryOut();

        if (factoryOut != null) {
            deviceExtCacheModel.factoryOut = factoryOut.getTime();
        } else {
            deviceExtCacheModel.factoryOut = Long.MIN_VALUE;
        }

        deviceExtCacheModel.status = getStatus();

        Date ostStatusChangedDate = getOstStatusChangedDate();

        if (ostStatusChangedDate != null) {
            deviceExtCacheModel.ostStatusChangedDate = ostStatusChangedDate.getTime();
        } else {
            deviceExtCacheModel.ostStatusChangedDate = Long.MIN_VALUE;
        }

        deviceExtCacheModel.deviceExtOrderId = getDeviceExtOrderId();

        return deviceExtCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(45);

        sb.append("{deviceExtId=");
        sb.append(getDeviceExtId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", modelName=");
        sb.append(getModelName());
        sb.append(", serialNumber=");
        sb.append(getSerialNumber());
        sb.append(", gponSerialNumber=");
        sb.append(getGponSerialNumber());
        sb.append(", boxSerialNumber=");
        sb.append(getBoxSerialNumber());
        sb.append(", customerSerialNumber=");
        sb.append(getCustomerSerialNumber());
        sb.append(", manufacturerSerialNumber=");
        sb.append(getManufacturerSerialNumber());
        sb.append(", hardwareRevision=");
        sb.append(getHardwareRevision());
        sb.append(", softwareRevision=");
        sb.append(getSoftwareRevision());
        sb.append(", macAddress=");
        sb.append(getMacAddress());
        sb.append(", partNumber=");
        sb.append(getPartNumber());
        sb.append(", specification=");
        sb.append(getSpecification());
        sb.append(", factoryOut=");
        sb.append(getFactoryOut());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", ostStatusChangedDate=");
        sb.append(getOstStatusChangedDate());
        sb.append(", deviceExtOrderId=");
        sb.append(getDeviceExtOrderId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(70);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.vn.sb.model.DeviceExt");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>deviceExtId</column-name><column-value><![CDATA[");
        sb.append(getDeviceExtId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelName</column-name><column-value><![CDATA[");
        sb.append(getModelName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serialNumber</column-name><column-value><![CDATA[");
        sb.append(getSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gponSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getGponSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>boxSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getBoxSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>customerSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getCustomerSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>manufacturerSerialNumber</column-name><column-value><![CDATA[");
        sb.append(getManufacturerSerialNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>hardwareRevision</column-name><column-value><![CDATA[");
        sb.append(getHardwareRevision());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>softwareRevision</column-name><column-value><![CDATA[");
        sb.append(getSoftwareRevision());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>macAddress</column-name><column-value><![CDATA[");
        sb.append(getMacAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>partNumber</column-name><column-value><![CDATA[");
        sb.append(getPartNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>specification</column-name><column-value><![CDATA[");
        sb.append(getSpecification());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>factoryOut</column-name><column-value><![CDATA[");
        sb.append(getFactoryOut());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ostStatusChangedDate</column-name><column-value><![CDATA[");
        sb.append(getOstStatusChangedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deviceExtOrderId</column-name><column-value><![CDATA[");
        sb.append(getDeviceExtOrderId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}