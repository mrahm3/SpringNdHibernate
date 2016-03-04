<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="ExceptionHandler.jsp"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using Java Bean</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<jsp:useBean id="custBean" class="com.training.beans.Customer" scope="session"/>

<jsp:setProperty property="*" name="custBean"/>

Dear: <jsp:getProperty property="customerName" name="custBean"/>
 ID:     <jsp:getProperty property="customerId" name="custBean"/>
  Email:  <jsp:getProperty property="email" name="custBean"/>
   Phone:   <jsp:getProperty property="handPhone" name="custBean"/>Thank you for logging in..!!
<br>Invoking method: <c:out value="${custBean.getInfo()}"></c:out>
</body>
</html>