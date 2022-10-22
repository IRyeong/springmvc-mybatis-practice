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
	<form method="post" action="form">
		<p>
			Enter product name : <input type="text" name="name">
		</p>
		<p>
			Enter price : <input type="text" name="price">
		</p>
		<p>
			Enter brand : <input type="text" name="brand">
		</p>
		<button>register</button>
	</form>
	<a href="./list"> Check out product list</a>
</body>
</html>
