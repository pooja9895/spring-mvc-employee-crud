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
	<form:form action="edit" modelAttribute="employee">
	<form:label path="id">ID :</form:label>
	<form:input path="id"/>
	
	<form:label path="name">NAME :</form:label>
	<form:input path="name"/>
	
	<form:label path="phone">PHONE NUMBER :</form:label>
	<form:input path="phone"/>
	
	<input type="submit">
	</form:form>
</body>
</html>