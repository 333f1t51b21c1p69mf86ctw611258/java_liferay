<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.dasannetworks.tms.model.Feedback"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.dasannetworks.tms.service.FeedbackLocalServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ include file="init.jsp"%>
<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="mvcPath"
		value="/html/workflow/view_approved_feedback.jsp" />
</liferay-portlet:renderURL>
<liferay-ui:search-container emptyResultsMessage="there-are-no-students"
	headerNames="Claim Subject,Message, Status"
	iteratorURL="<%=iteratorURL %>" delta="10" deltaConfigurable="true">

	<liferay-ui:search-container-results>
		<%
			List<Feedback> feedbackList = FeedbackLocalServiceUtil.findByG_S(themeDisplay.getScopeGroupId(),
							WorkflowConstants.STATUS_APPROVED);
		
			results = ListUtil.subList(feedbackList, searchContainer.getStart(), searchContainer.getEnd());
			searchContainer.setTotal(feedbackList.size());
			searchContainer.setResults(results);
		%>
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="Feedback"
		keyProperty="feedbackId" modelVar="currentFeedback">
		<liferay-ui:search-container-column-text name="Claim Subject"
			property="feedbackSubject" />
		<liferay-ui:search-container-column-text name="Message"
			property="feedbackText" />
		<liferay-ui:search-container-column-text name="status"><%=WorkflowConstants.LABEL_APPROVED%></liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
</liferay-ui:search-container>