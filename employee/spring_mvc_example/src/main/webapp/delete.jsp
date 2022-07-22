<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="delete" modelAttribute="employee">
	
	<form:label path="id">ENTER ID</form:label>
	<form:input path="id"/><br>
	
	
	<input type="submit">
	</form:form>
</body>
</html>