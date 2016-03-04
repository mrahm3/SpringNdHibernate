<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link href="css/Style.css" type="text/css" rel="stylesheet">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
 
 <hr>
</head>
<body>

<a href="Home.jsp?locale=fr"><img alt="French"	src="images/french.jpg" height=10 width=10 id="fr"></a> 
	<a href="Home.jsp?locale=en"><img src="images/india.jpg" height=10 width=10 id="in"></a>
	<a href="Home.jsp?locale=ge"><img alt="German"	src="images/german.jpg" height=10 width=10 id="fr"></a>	
		
	<fmt:setLocale value="${param['locale'] }" />
	
	<fmt:setBundle basename="MessageResources" var="msg" />

<h1><label>
<fmt:message key="forms.label.title" bundle="${msg}"/></label></h1>

<hr>
<%-- <c:import url="Header.jsp"> </c:import>
 --%>
 

<form action="">
<table>
<tr>
<td><label>
<fmt:message key="forms.label.role" bundle="${msg}"/></label></td>
 <td>  <select name="role" >
   <option value="Admin">Administrator</option>
   <option value="Man">Manager</option>
   <option value="Lt">Lab Technician</option>
   <option value="Operator">Operator</option>

</select></td>
<tr>
<td><label>
<fmt:message key="forms.label.labCode" bundle="${msg}"/></label> </td> 
<td><input type="text" name="labCode"></td>
</tr>

<tr>
<td><label>
<fmt:message key="forms.label.userName" bundle="${msg}"/></label> </td>
<td> <input type="text" name="userName"></td>
 </tr>
 <tr>
   <td><label>
<fmt:message key="forms.label.passWord" bundle="${msg}"/></label> </td> 
   <td><input type="text" name="passWord"> </td>
</tr>
   
<tr > <td colspan="2">
<input type="submit" value="Login"></td>
</tr>
</table>
</form>
<hr>
<h3><a href=""><label>
<fmt:message key="forms.label.ContactAdministrator" bundle="${msg}"/></label></a>
</h3>
</body>
</html>