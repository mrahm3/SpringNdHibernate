<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="css/Style.css" type="text/css" rel="stylesheet" />
</head>
<body>
<header><jsp:include page="Header.jsp" /></header>
<hr>
<div id="menu">
<a href=CreateOrder.jsp>Create Test Order  </a>	
<a href=AddTestResults.jsp>Add Test Results  </a>
<a href=TestReports.jsp>View Test Reports</a>
</div>
<hr><br><br>
<h2 >LabCode:<c:out value="${param.labCode }"></c:out></h2>
<div>
<c:out value="${param.username }"></c:out>
<c:out value="${param.labcode }"></c:out>


  <table >
     <tr>
       <td>Order Number</td>
       <td><input type="text"></td>
       <td>Collection Date</td>
       <td><input type="date" name="date"></td>
       <td>Collection Type</td>
       <td><input type="radio" name="collection_type">Lab
           <input type="radio" name="collection_type">Home</td>
     </tr> 
     <tr>
       <td>Patient Code</td>
       <td><input type="text"></td>
       <td>Patient Name</td>
       <td><input type="text"></td>
       <td>Age</td>
       <td><input type="text" ></td>
     </tr>
     <tr>
       <td>HandPhone</td>
       <td><input type="number"></td>
       <td>E-mail</td>
       <td><input type="email"></td>
       <td>Gender</td>
       <td><input type="radio" name="collection_type">Male
           <input type="radio" name="collection_type">Female</td>
     </tr>
     <tr>
       <td>Doctor Code</td>
       <td><input type="text" name="doctorCode"></td>
       <td colspan="2">Doctor Name</td>
      
       <td colspan="2"><input type="text"></td>
       
     </tr>
  </table>

<hr>
<h3>Test Details</h3>
<table>

<tr> <td>Test Code</td>
<td>Test Number</td>
<td>Amount</td>
</tr>

<tr>
<td><input type="text" name="testCode"> </td>
<td><input type="text" name="testNumber"> </td>
<td><input type="text" name="amount"> </td>
</tr>
<tr>
<td><input type="text" name="testCode"> </td>
<td><input type="text" name="testNumber"> </td>
<td><input type="text" name="amount"> </td>
</tr>
<tr>
<td><input type="text" name="testCode"> </td>
<td><input type="text" name="testNumber"> </td>
<td><input type="text" name="amount"> </td>
</tr>
<tr>
<td><input type="text" name="testCode"> </td>
<td><input type="text" name="testNumber"> </td>
<td><input type="text" name="amount"> </td>
</tr>
<tr> <td colspan="2">Total </td>
<td><input type="text" name="total"></td></tr>

</table>
<div id="buttons">
<input type="submit" id="submit1" value="Confirm Tests" >
<input type="submit" id="submit2" value="Add More Test" >
</div>
<footer >
	<jsp:include page="Footer.jsp" />
</footer>
</div>

</body>
</html>