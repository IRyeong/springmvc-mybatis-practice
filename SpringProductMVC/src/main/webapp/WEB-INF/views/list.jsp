<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
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
			<tr>
				<th>id</th>
				<th>name</th>
				<th>price</th>
				<th>brand</th>
				<th>edit</th>
				<th>delete</th>
			<tr>
		</thead>
		<tbody>
			<c:forEach items="${ products }" var="product" varStatus="vs">
				<tr>
					<td>${ product.id }</td>
					<td>${ product.name }</td>
					<td>${ product.price }</td>
					<td>${ product.brand }</td>
					<td><a href="edit/${ product.id }">edit</a></td>
					<td>delete</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
