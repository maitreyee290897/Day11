<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

<tr>
<td>${emp.getId()}</td>
<td>${emp.getName()}</td>
</tr>


</table>s
</body>
</html>