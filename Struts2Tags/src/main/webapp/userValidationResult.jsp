<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>userValidationResult</title>
</head>
<body>

<!-- Display list object values -->
	<s:iterator value="profession" var="prof">
		<s:property/>
	</s:iterator>
	
	------------------------
	
	
	</br>
	
	<!-- Display map object values  -->
	<s:iterator value="map">
		<s:property value="key"/>
		<s:property value="value"/>
	</s:iterator>
</body>
</html>