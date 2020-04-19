<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Articulos</title>
</head>
<body>
<table border = "3">
<tr>
<th> Id </th>
<th> Tipo </th>
<th> Descripción </th>
</tr>
<tr>
<c:forEach items= "${lista}" var="list">
<th><c:out value="${list.id}" /></th>
<th><c:out value="${list.tipo}" /></th>
<th><c:out value="${list.descripcion}" /></th>
</tr>
</c:forEach> 
</table>
</body>
</html>