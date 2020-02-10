<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="includes/header.jsp"></jsp:include>
<title>Add Employee</title>
</head>
<h1>Create Employee</h1>
<spring:url value="/save" var="saveURL"></spring:url>
<body>

  <div class="container">
	<form:form method="post" action="${saveURL}" modelAttribute="employee">
	
		<table class="table table-bordered">
			<tr>
			<form:hidden path="id"/>
			    <td><form:label path="firstname">First Name</form:label>
				<td><form:input path="firstname" class="form-control" /></td>
			</tr>
			<tr>
				<td><form:label path="lastname">Last Name </form:label>
				<td><form:input path="lastname" class="form-control" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label>
				<td><form:input path="address" class="form-control" /></td>
				
			</tr>
			<tr>
			<td colspan="2"><input type="submit" value="Save" class="btn btn-primary"/></td>
			</tr>
			
		</table>
	
	 </form:form>
	</div>
	
</body>
</html>