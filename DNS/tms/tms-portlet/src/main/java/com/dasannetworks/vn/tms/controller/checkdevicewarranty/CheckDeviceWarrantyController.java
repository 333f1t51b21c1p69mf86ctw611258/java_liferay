package com.dasannetworks.vn.tms.controller.checkdevicewarranty;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.dasannetworks.vn.sb.model.Device;
import com.dasannetworks.vn.sb.service.DeviceLocalServiceUtil;
import com.dasannetworks.vn.tms.controller.BaseController;
import com.dasannetworks.vn.tms.pojo.DevicePOJO;
import com.dasannetworks.vn.tms.service.DeviceSearchInput;
import com.dasannetworks.vn.tms.service.ExcelService;
import com.dasannetworks.vn.tms.service.ImportDeviceListService.DeviceListInputFile;
import com.dasannetworks.vn.tms.service.ImportDeviceListService.DeviceListInputRow;
import com.dasannetworks.vn.tms.util.DeviceUtil;
import com.dasannetworks.vn.tms.util.JsonServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.util.PortalUtil;

@Controller("checkDeviceWarrantyController")
@RequestMapping("VIEW")
public class CheckDeviceWarrantyController extends BaseController {

	private static Log LOGGER = LogFactoryUtil.getLog(CheckDeviceWarrantyController.class);

	private DevicePOJO pojoDevice = new DevicePOJO();

	@RenderMapping
	public String defaultHandler(Map<String, Object> map) throws SystemException {

		map.put("device", this.pojoDevice);

		// List<Device> deviceList = DeviceLocalServiceUtil.getDevices(0,
		// DeviceLocalServiceUtil.getDevicesCount());
		// map.put("deviceList", deviceList);

		return "check-device-warranty/view";

	}

	@RenderMapping(params = { "render=rerenderView" })
	public String rerenderView(Model model, PortletRequest portletRequest, PortletResponse portletResponse) throws SystemException {
		LOGGER.debug("rerenderView called");

		model.addAttribute("device", this.pojoDevice);

		List<Device> deviceList = DeviceLocalServiceUtil.getDevices(0, DeviceLocalServiceUtil.getDevicesCount());
		model.addAttribute("deviceList", deviceList);

		return "check-device-warranty/view";
	}

	@ActionMapping(params = "action=checkDevice")
	public void addDevice(ActionRequest actionRequest, ActionResponse actionResponse, Model model,
			@ModelAttribute("device") DevicePOJO pojoDevice, BindingResult result) throws IOException,
			PortletException, SystemException {

		callRerenderView(actionResponse, pojoDevice);
	}

	private void callRerenderView(ActionResponse actionResponse, DevicePOJO pojoDevice) {
		this.pojoDevice = pojoDevice;
		actionResponse.setRenderParameter("render", "rerenderView");
	}

	@ResourceMapping("getAllDevices")
	public void getAllStudents(ResourceRequest request, ResourceResponse response) {
		LOGGER.info("getAllDevices()");
		PrintWriter writer = null;
		List<Device> studentList = null;

		try {
			writer = response.getWriter();
			// Fetch students
			LOGGER.info("Getting all device list");
			studentList = DeviceLocalServiceUtil.getDevices(0, DeviceLocalServiceUtil.getDevicesCount());
		} catch (Exception e) {
			LOGGER.error("Error while getting all devices", e);
		}

		Map<String, Object> map = new HashMap<String, Object>();

		List<DevicePOJO> studentVOList = DeviceUtil.getDeviceVOList(studentList);

		map.put("aaData", studentVOList);
		JsonServiceUtil.writeJson(writer, map);
	}

	@ResourceMapping("checkDevices")
	public void checkDevices(
			@RequestParam("serialNumber") String serialNumber,
			@RequestParam("macAddress") String macAddress,
			@RequestParam("purchaseOrder") String purchaseOrder,
			@RequestParam("modelName") String modelName,
			ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException {

		List<Device> deviceList = null;
		try {
			deviceList = searchDeviceList(serialNumber, macAddress);
		} catch (Exception e) {
			LOGGER.error("Error while getting all devices", e);
		}

		Map<String, Object> map = new HashMap<String, Object>();
		List<DevicePOJO> listDevicePOJO = DeviceUtil.getDeviceVOList(deviceList);
		map.put("deviceList", listDevicePOJO);

		PrintWriter writer = null;
		writer = resourceResponse.getWriter();
		JsonServiceUtil.writeJson(writer, map);
	}

	private List<Device> searchDeviceList(String serialNumber, String macAddress) throws SystemException {
		List<Device> deviceList;
		DeviceSearchInput deviceSearchInput = new DeviceSearchInput();
		deviceSearchInput.setAndSearchCondition(true);
		deviceSearchInput.setSerialNumber(serialNumber);
		deviceSearchInput.setMacAddress(macAddress);

		long count = DeviceLocalServiceUtil.searchCount(deviceSearchInput);

		deviceSearchInput.setStart(0);
		deviceSearchInput.setEnd((int) count);

		deviceList = DeviceLocalServiceUtil.search(deviceSearchInput);
		return deviceList;
	}

	@ResourceMapping("checkDevicesWithExcel")
	public void checkDevicesWithExcel(
			ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException, PortletException, SystemException {

		UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
		Set<Device> hsDevices = new HashSet<Device>();
		if (uploadRequest != null) {
			File objFile = uploadRequest.getFile("fileExcel");

			if (objFile != null) {
				DeviceListInputFile deviceListInputFile = ExcelService.parseDeviceList(objFile);

				List<DeviceListInputRow> rows = deviceListInputFile.getRows();

				LOGGER.info("rows: " + rows.size());

				List<Device> tmpDevices = null;
				for (DeviceListInputRow deviceListInputRow : rows) {
					tmpDevices = searchDeviceList(deviceListInputRow.getSerialNumber(), deviceListInputRow.getMacAddress());
					if (!CollectionUtils.isEmpty(tmpDevices)) {
						hsDevices.addAll(tmpDevices);
					}
				}
			}
		}

		Map<String, Object> map = new HashMap<String, Object>();
		List<Device> tmpDevices = new ArrayList<>(hsDevices);
		List<DevicePOJO> listDevicePOJO = DeviceUtil.getDeviceVOList(tmpDevices);
		map.put("deviceList", listDevicePOJO);

		PrintWriter writer = null;
		writer = resourceResponse.getWriter();
		JsonServiceUtil.writeJson(writer, map);
	}

}
