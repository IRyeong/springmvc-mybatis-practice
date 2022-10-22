<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Product List</title>
</head>
<body>
	<h1>Product List</h1>
	<table border="1">
		<thead>
			<th>id</th>
			<th>name</th>
			<th>price</th>
			<th>brand</th>
		</thead>
		<c:forEach items="${ products }" var="product" varStatus="vs">
			<tr>
				<td>${ product.id }</a></td>
				<td>${ product.name }</td>
				<td>${ product.price }</td>
				<td>${ product.brand }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
