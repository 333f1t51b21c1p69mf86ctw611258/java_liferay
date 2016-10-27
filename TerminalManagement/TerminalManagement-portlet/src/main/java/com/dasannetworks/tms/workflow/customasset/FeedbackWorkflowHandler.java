package com.dasannetworks.tms.workflow.customasset;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import com.dasannetworks.tms.sb.model.Feedback;
import com.dasannetworks.tms.sb.service.FeedbackLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;

/**
 * Portlet implementation class FeedbackAction
 */
public class FeedbackWorkflowHandler extends BaseWorkflowHandler {

	public String getClassName() {
		return CLASS_NAME;
	}

	public String getType(Locale locale) {
		return "Feedback";
	}

	public Feedback updateStatus(int status,
			Map<String, Serializable> workflowContext) throws PortalException,
			SystemException {
		
		long userId = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
		long resourcePrimKey = GetterUtil.getLong(workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));

		Feedback feedback = FeedbackLocalServiceUtil.getFeedback(resourcePrimKey);
		feedback.setFeedBackStatus(status);
		feedback.setStatusByUserId(userId);
		feedback.setStatusDate(new Date());
		feedback = FeedbackLocalServiceUtil.updateFeedback(feedback);

		if (status == WorkflowConstants.STATUS_APPROVED) {
			AssetEntryLocalServiceUtil.updateVisible(Feedback.class.getName(),
					resourcePrimKey, true);
		} else {
			AssetEntryLocalServiceUtil.updateVisible(Feedback.class.getName(),
					resourcePrimKey, false);
		}

		return feedback;
	}

	public static final String CLASS_NAME = Feedback.class.getName();

}
