<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>ALL EMPLOYEE DETAILS</h2>
		<table border="2">
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>PHONE NUMBER</th>
	</tr>
	<c:forEach items="${employeelist}" var="employee">
		<tr>
		<td>${employee.id}</td>
		<td>${employee.name}</td>
		<td>${employee.phone}</td>
	</c:forEach>
	</table>
	
</body>
</html>