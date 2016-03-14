<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
<h1>Request for Class</h1>

<form:form method="post" action="CarRequest">

<form:errors path="*" cssStyle="color:red" />

Name 
<form:input path="name"/>
MobileNumber
<form:input path="mobileNumber"/>
Email
<form:input path="email"/>
Type
<form:select path="type" items="${type}">
</form:select>

<input type="submit" value="ADD">


</form:form>
</body>
</html>