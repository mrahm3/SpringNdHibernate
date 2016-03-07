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
  
</head>
<body>
	<a href="Home.jsp?locale=fr"><img alt="French"	src="images/french.jpg" id="fr"></a> 
	<a href="Home.jsp?locale=en"><img src="images/india.jpg" height=10 width=10 id="in"></a>
<hr>
<c:import url="Header.jsp"> </c:import>	
<br>
 <nav>
<div id="menu">
<a href=Doctor.jsp>Doctor</a>	
<a href=Patient.jsp>Patient</a>
<a href=Test.jsp>Test</a>
<a href=Help.jsp>Help</a>
</div>
 </nav>

	<fmt:setLocale value="${param['locale'] }" />
	
	<fmt:setBundle basename="MessageResources" var="msg" />

<hr>

<form action="validate">
<table>
<tr>
<td><label>
<fmt:message key="forms.label.role" bundle="${msg}"/></label></td>
 <td>  <select name="role" >
   <option value=admin>Administrator</option>
   <option value="manager">Manager</option>
   <option value="labTechnician">Lab Technician</option>
   <option value="operator">Operator</option>

</select></td>
<tr>
<td><label>
<fmt:message key="forms.label.labCode" bundle="${msg}"/></label> </td> 
<td><input type="text" name="code" id="code" list="labcode"><datalist id="labcode">
</datalist></td>
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
<input type="submit" value="Login" name="login" id="login"></td>
</tr>
</table>
</form>
<hr>
<c:import url="Footer.jsp"> </c:import>
</body>

<script type="text/javascript" >
var dataList = document.getElementById("labcode");
var input = document.getElementById("code");

var request = new XMLHttpRequest();
request.open("GET","Data/DataList.json",true);

request.onreadystatechange = function (response) {
	
	if(request.readyState === 4 && request.status === 200){
		
		var jSonOptions = JSON.parse(request.responseText);
		jSonOptions.forEach(function(item){
			var option = document.createElement("option");
			option.value = item.code;
			dataList.appendChild(option);
		});
			
	}
	
};
request.send();
</script>
</html>