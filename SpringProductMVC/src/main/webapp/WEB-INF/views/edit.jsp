<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Welcome to Product Management Site</title>
</head>
<body>
	<h1>Create Product</h1>
	<br>
	<form method="post" action="editsave">
		<p>
			<input type="hidden" name="id" value="${ holder.id }">
		</p>
		<p>
			Enter product name : <input type="text" name="name"
				value="${ holder.name }">
		</p>
		<p>
			Enter price : <input type="text" name="price"
				value="${ holder.price }">
		</p>
		<p>
			Enter brand : <input type="text" name="brand"
				value="${ holder.brand }">
		</p>
		<button>update</button>
	</form>
	<a href="./list"> Check out product list</a>
</body>
</html>
