<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="includes/header.jsp"></jsp:include>
</head>
<body>

	<div class="container">
		<table class="table table-bordered">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Address</th>
			<th colspan="2" align="center">Action</th>
		</tr>
		<c:forEach items="${employeelist}" var="employee">
			<tr>
				<td><c:out value="${employee.id }" /></td>
				<td><c:out value="${employee.firstname }" /></td>
				<td><c:out value="${employee.lastname }" /></td>
				<td><c:out value="${employee.address }" /></td>
				<td><spring:url value="/update/${employee.id }"
						var="updateURL" /> <a href="${updateURL}">Update</a></td>
						
				<td><spring:url value="/delete/${employee.id }"
						var="deleteURL" /> <a href="${deleteURL}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
	</div>
	<script src="webjars/jquery/3.4.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>