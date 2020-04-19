<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Articulo Unico</title>
</head>
<body>
<table border = "3">
<tr>
<th> Id </th>
<th> Tipo </th>
<th> Descripción </th>
</tr>
<tr>

<th><c:out value="${articulo.id}" /></th>
<th><c:out value="${articulo.tipo}" /></th>
<th><c:out value="${articulo.descripcion}" /></th>
</tr>

</table>
</body>
</html>