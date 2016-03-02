<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
<%@ include file="Header.jsp" %></header>
<section>

<form action="ProcessCustomer.jsp">
<label>CustomerId</label>
<input type="text" name="customerId">

<label>CustomerName</label>
<input type="text" name="customerName">
<label>Email</label>
<input type="email" name="email">

<label>telephone</label>
<input type="tel" name="handPhone" pattern="9999999999" placeholder="10-digit number">


<input type="submit" value="add">
</form>
</section>
<footer>
    <jsp:include page="Footer.jsp"/>
</footer>
</body>
</html>