<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>all emp</h2>

<table border="1">
<tr>
<th>emp id</th>
<th>name</th>
</tr>
<c:forEach items="${e1}" var="employee">
<tr>
<td>${employee.id}</td>
<td>${employee.name}</td>
</c:forEach></tr>


</table>
</body>
</html>