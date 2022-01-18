<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>All The Student Details</h1>

	<table border="2">
		<tr>
			<th>Student ID</th>
			<th>Student FirstName</th>
			<th>Student LastName</th>
			<th>Student Age</th>
			<th>Student ClassName</th>
		</tr>
		<c:forEach items="${stuList}" var="stu">
			<tr>
				<td>${stu.studentid}</td>
				<td>${stu.firstname}</td>
				<td>${stu.lastname}</td>
				<td>${stu.age}</td>
				<td>${stu.classname}</td>	
				<td><a href="./updatestudent?studentid=${stu.studentid}">Update</a></td>
				<td><a href="./deleteStudent?studentid=${stu.studentid}">Delete</a></td>		
			</tr>
		</c:forEach>
	</table>

	<h1>
		<a href="studentDashBoardPage">Click here to return to thehomepage</a>
	</h1>
</body>
</html>