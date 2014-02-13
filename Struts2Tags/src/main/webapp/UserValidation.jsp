<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="d" uri="/struts-dojo-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Validation</title>
</head>
<body>
	<s:form action="userValidation" method="post">
		<s:textfield label="User Name " name="userName"></s:textfield>
		<s:textfield label="Password " name="password" type="password"></s:textfield>
		<s:textarea label="Address" name="address" cols="45" rows="6"></s:textarea>
		<s:radio list="{'Male','Female'}" name="sex"></s:radio>
		<s:select list="{'Doctor', 'Actor', 'Joker'}" name="profession"
			label="Profession" multiple="true"></s:select>
		<s:checkboxlist list="{'English','French','Italian'}"
			name="languagesKnown" label="Languages Known"></s:checkboxlist>
		<d:autocompleter label="Date Of Birth Year" name="yourDateOfYear"
			autoComplete="true"
			list="{'1980','2980','3980','4980','1790','970','17910','1752','1771','1674','2345','2200','2000','3000','3500'}"></d:autocompleter>
		<s:submit label="Create Account"></s:submit>
	</s:form>
</body>
</html>