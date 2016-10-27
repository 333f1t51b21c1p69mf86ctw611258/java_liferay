package com.dasannetworks.tms.sb.model.impl;

import com.dasannetworks.tms.sb.model.Device;
import com.dasannetworks.tms.sb.model.DeviceModel;
import com.dasannetworks.tms.sb.model.DeviceSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Device service. Represents a row in the &quot;tms_Device&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.dasannetworks.tms.sb.model.DeviceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DeviceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeviceImpl
 * @see com.dasannetworks.tms.sb.model.Device
 * @see com.dasannetworks.tms.sb.model.DeviceModel
 * @generated
 */
@JSON(strict = true)
public class DeviceModelImpl extends BaseModelImpl<Device>
    implements DeviceModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a device model instance should use the {@link com.dasannetworks.tms.sb.model.Device} interface instead.
     */
    public static final String TABLE_NAME = "tms_Device";
    public static final Object[][] TABLE_COLUMNS = {
            { "deviceId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "modelname", Types.VARCHAR },
            { "serialNumber", Types.VARCHAR },
            { "hardwareRevision", Types.VARCHAR },
            { "softwareRevision", Types.VARCHAR },
            { "manufactureSerial", Types.VARCHAR },
            { "macAddress", Types.VARCHAR },
            { "partNumber", Types.VARCHAR },
            { "specification", Types.VARCHAR },
            { "factoryOut", Types.TIMESTAMP },
            { "uploadFileId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table tms_Device (deviceId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,modelname VARCHAR(75) null,serialNumber VARCHAR(75) null,hardwareRevision VARCHAR(75) null,softwareRevision VARCHAR(75) null,manufactureSerial VARCHAR(75) null,macAddress VARCHAR(75) null,partNumber VARCHAR(75) null,specification VARCHAR(75) null,factoryOut DATE null,uploadFileId LONG)";
    public static final String TABLE_SQL_DROP = "drop table tms_Device";
    public static final String ORDER_BY_JPQL = " ORDER BY device.deviceId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY tms_Device.deviceId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.dasannetworks.tms.sb.model.Device"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.dasannetworks.tms.sb.model.Device"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.dasannetworks.tms.sb.model.Device"),
            true);
    public static long UPLOADFILEID_COLUMN_BITMASK = 1L;
    public static long DEVICEID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.dasannetworks.tms.sb.model.Device"));
    private static ClassLoader _classLoader = Device.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Device.class };
    private long _deviceId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _modelname;
    private String _serialNumber;
    private String _hardwareRevision;
    private String _softwareRevision;
    private String _manufactureSerial;
    private String _macAddress;
    private String _partNumber;
    private String _specification;
    private Date _factoryOut;
    private long _uploadFileId;
    private long _originalUploadFileId;
    private boolean _setOriginalUploadFileId;
    private long _columnBitmask;
    private Device _escapedModel;

    public DeviceModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Device toModel(DeviceSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Device model = new DeviceImpl();

        model.setDeviceId(soapModel.getDeviceId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setUserName(soapModel.getUserName());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setModelname(soapModel.getModelname());
        model.setSerialNumber(soapModel.getSerialNumber());
        model.setHardwareRevision(soapModel.getHardwareRevision());
        model.setSoftwareRevision(soapModel.getSoftwareRevision());
        model.setManufactureSerial(soapModel.getManufactureSerial());
        model.setMacAddress(soapModel.getMacAddress());
        model.setPartNumber(soapModel.getPartNumber());
        model.setSpecification(soapModel.getSpecification());
        model.setFactoryOut(soapModel.getFactoryOut());
        model.setUploadFileId(soapModel.getUploadFileId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Device> toModels(DeviceSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Device> models = new ArrayList<Device>(soapModels.length);

        for (DeviceSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _deviceId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setDeviceId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _deviceId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Device.class;
    }

    @Override
    public String getModelClassName() {
        return Device.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("deviceId", getDeviceId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("modelname", getModelname());
        attributes.put("serialNumber", getSerialNumber());
        attributes.put("hardwareRevision", getHardwareRevision());
        attributes.put("softwareRevision", getSoftwareRevision());
        attributes.put("manufactureSerial", getManufactureSerial());
        attributes.put("macAddress", getMacAddress());
        attributes.put("partNumber", getPartNumber());
        attributes.put("specification", getSpecification());
        attributes.put("factoryOut", getFactoryOut());
        attributes.put("uploadFileId", getUploadFileId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long deviceId = (Long) attributes.get("deviceId");

        if (deviceId != null) {
            setDeviceId(deviceId);
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

        String modelname = (String) attributes.get("modelname");

        if (modelname != null) {
            setModelname(modelname);
        }

        String serialNumber = (String) attributes.get("serialNumber");

        if (serialNumber != null) {
            setSerialNumber(serialNumber);
        }

        String hardwareRevision = (String) attributes.get("hardwareRevision");

        if (hardwareRevision != null) {
            setHardwareRevision(hardwareRevision);
        }

        String softwareRevision = (String) attributes.get("softwareRevision");

        if (softwareRevision != null) {
            setSoftwareRevision(softwareRevision);
        }

        String manufactureSerial = (String) attributes.get("manufactureSerial");

        if (manufactureSerial != null) {
            setManufactureSerial(manufactureSerial);
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

        Long uploadFileId = (Long) attributes.get("uploadFileId");

        if (uploadFileId != null) {
            setUploadFileId(uploadFileId);
        }
    }

    @JSON
    @Override
    public long getDeviceId() {
        return _deviceId;
    }

    @Override
    public void setDeviceId(long deviceId) {
        _deviceId = deviceId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @JSON
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

    @JSON
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

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public String getModelname() {
        if (_modelname == null) {
            return StringPool.BLANK;
        } else {
            return _modelname;
        }
    }

    @Override
    public void setModelname(String modelname) {
        _modelname = modelname;
    }

    @JSON
    @Override
    public String getSerialNumber() {
        if (_serialNumber == null) {
            return StringPool.BLANK;
        } else {
            return _serialNumber;
        }
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        _serialNumber = serialNumber;
    }

    @JSON
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

    @JSON
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

    @JSON
    @Override
    public String getManufactureSerial() {
        if (_manufactureSerial == null) {
            return StringPool.BLANK;
        } else {
            return _manufactureSerial;
        }
    }

    @Override
    public void setManufactureSerial(String manufactureSerial) {
        _manufactureSerial = manufactureSerial;
    }

    @JSON
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

    @JSON
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

    @JSON
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

    @JSON
    @Override
    public Date getFactoryOut() {
        return _factoryOut;
    }

    @Override
    public void setFactoryOut(Date factoryOut) {
        _factoryOut = factoryOut;
    }

    @JSON
    @Override
    public long getUploadFileId() {
        return _uploadFileId;
    }

    @Override
    public void setUploadFileId(long uploadFileId) {
        _columnBitmask |= UPLOADFILEID_COLUMN_BITMASK;

        if (!_setOriginalUploadFileId) {
            _setOriginalUploadFileId = true;

            _originalUploadFileId = _uploadFileId;
        }

        _uploadFileId = uploadFileId;
    }

    public long getOriginalUploadFileId() {
        return _originalUploadFileId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Device.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Device toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Device) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        DeviceImpl deviceImpl = new DeviceImpl();

        deviceImpl.setDeviceId(getDeviceId());
        deviceImpl.setGroupId(getGroupId());
        deviceImpl.setCompanyId(getCompanyId());
        deviceImpl.setUserId(getUserId());
        deviceImpl.setUserName(getUserName());
        deviceImpl.setCreateDate(getCreateDate());
        deviceImpl.setModifiedDate(getModifiedDate());
        deviceImpl.setModelname(getModelname());
        deviceImpl.setSerialNumber(getSerialNumber());
        deviceImpl.setHardwareRevision(getHardwareRevision());
        deviceImpl.setSoftwareRevision(getSoftwareRevision());
        deviceImpl.setManufactureSerial(getManufactureSerial());
        deviceImpl.setMacAddress(getMacAddress());
        deviceImpl.setPartNumber(getPartNumber());
        deviceImpl.setSpecification(getSpecification());
        deviceImpl.setFactoryOut(getFactoryOut());
        deviceImpl.setUploadFileId(getUploadFileId());

        deviceImpl.resetOriginalValues();

        return deviceImpl;
    }

    @Override
    public int compareTo(Device device) {
        long primaryKey = device.getPrimaryKey();

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

        if (!(obj instanceof Device)) {
            return false;
        }

        Device device = (Device) obj;

        long primaryKey = device.getPrimaryKey();

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
        DeviceModelImpl deviceModelImpl = this;

        deviceModelImpl._originalUploadFileId = deviceModelImpl._uploadFileId;

        deviceModelImpl._setOriginalUploadFileId = false;

        deviceModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Device> toCacheModel() {
        DeviceCacheModel deviceCacheModel = new DeviceCacheModel();

        deviceCacheModel.deviceId = getDeviceId();

        deviceCacheModel.groupId = getGroupId();

        deviceCacheModel.companyId = getCompanyId();

        deviceCacheModel.userId = getUserId();

        deviceCacheModel.userName = getUserName();

        String userName = deviceCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            deviceCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            deviceCacheModel.createDate = createDate.getTime();
        } else {
            deviceCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            deviceCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            deviceCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        deviceCacheModel.modelname = getModelname();

        String modelname = deviceCacheModel.modelname;

        if ((modelname != null) && (modelname.length() == 0)) {
            deviceCacheModel.modelname = null;
        }

        deviceCacheModel.serialNumber = getSerialNumber();

        String serialNumber = deviceCacheModel.serialNumber;

        if ((serialNumber != null) && (serialNumber.length() == 0)) {
            deviceCacheModel.serialNumber = null;
        }

        deviceCacheModel.hardwareRevision = getHardwareRevision();

        String hardwareRevision = deviceCacheModel.hardwareRevision;

        if ((hardwareRevision != null) && (hardwareRevision.length() == 0)) {
            deviceCacheModel.hardwareRevision = null;
        }

        deviceCacheModel.softwareRevision = getSoftwareRevision();

        String softwareRevision = deviceCacheModel.softwareRevision;

        if ((softwareRevision != null) && (softwareRevision.length() == 0)) {
            deviceCacheModel.softwareRevision = null;
        }

        deviceCacheModel.manufactureSerial = getManufactureSerial();

        String manufactureSerial = deviceCacheModel.manufactureSerial;

        if ((manufactureSerial != null) && (manufactureSerial.length() == 0)) {
            deviceCacheModel.manufactureSerial = null;
        }

        deviceCacheModel.macAddress = getMacAddress();

        String macAddress = deviceCacheModel.macAddress;

        if ((macAddress != null) && (macAddress.length() == 0)) {
            deviceCacheModel.macAddress = null;
        }

        deviceCacheModel.partNumber = getPartNumber();

        String partNumber = deviceCacheModel.partNumber;

        if ((partNumber != null) && (partNumber.length() == 0)) {
            deviceCacheModel.partNumber = null;
        }

        deviceCacheModel.specification = getSpecification();

        String specification = deviceCacheModel.specification;

        if ((specification != null) && (specification.length() == 0)) {
            deviceCacheModel.specification = null;
        }

        Date factoryOut = getFactoryOut();

        if (factoryOut != null) {
            deviceCacheModel.factoryOut = factoryOut.getTime();
        } else {
            deviceCacheModel.factoryOut = Long.MIN_VALUE;
        }

        deviceCacheModel.uploadFileId = getUploadFileId();

        return deviceCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(35);

        sb.append("{deviceId=");
        sb.append(getDeviceId());
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
        sb.append(", modelname=");
        sb.append(getModelname());
        sb.append(", serialNumber=");
        sb.append(getSerialNumber());
        sb.append(", hardwareRevision=");
        sb.append(getHardwareRevision());
        sb.append(", softwareRevision=");
        sb.append(getSoftwareRevision());
        sb.append(", manufactureSerial=");
        sb.append(getManufactureSerial());
        sb.append(", macAddress=");
        sb.append(getMacAddress());
        sb.append(", partNumber=");
        sb.append(getPartNumber());
        sb.append(", specification=");
        sb.append(getSpecification());
        sb.append(", factoryOut=");
        sb.append(getFactoryOut());
        sb.append(", uploadFileId=");
        sb.append(getUploadFileId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(55);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.tms.sb.model.Device");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>deviceId</column-name><column-value><![CDATA[");
        sb.append(getDeviceId());
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
            "<column><column-name>modelname</column-name><column-value><![CDATA[");
        sb.append(getModelname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serialNumber</column-name><column-value><![CDATA[");
        sb.append(getSerialNumber());
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
            "<column><column-name>manufactureSerial</column-name><column-value><![CDATA[");
        sb.append(getManufactureSerial());
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
            "<column><column-name>uploadFileId</column-name><column-value><![CDATA[");
        sb.append(getUploadFileId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
