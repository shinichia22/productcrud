<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<spring:url value="/saveProduct" var="saveURL" />
		<h2>Products</h2>
		<form:form modelAttribute="productForm" method="post"
			action="${saveURL }" cssClass="form">
			<form:hidden path="id" />
			<div class="form-group">
				<label>Product Name</label>
				<form:input path="name" cssClass="form-control" id="name" />
			</div>
			<div class="form-group">
				<label>Product Quantity</label>
				<form:input path="quantity" cssClass="form-control" id="quantity" />
			</div>
			<div class="form-group">
				<label>Product Price</label>
				<form:input path="price" cssClass="form-control" id="price" />
			</div>
			<button type="submit" class="btn btn-primary">Save</button>
		</form:form>
	</div>
</body>
</html>