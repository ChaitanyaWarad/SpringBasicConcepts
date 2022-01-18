<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add New Student Details</h1>
	<form action="addStudentInDB" method="POST" modelAttribute="student">
		<table border="2">
			<tr>
				<td>Student ID:</td>
				<td><input name="studentid" type="text" value="" /></td>
			</tr>
			<tr>
				<td>Student First Name:</td>
				<td><input name="firstname" type="text" value="" /></td>
			</tr>
			<tr>
				<td>Student Last Name:</td>
				<td><input name="lastname" type="text" value="" /></td>
			</tr>
			<tr>
				<td>Student Age:</td>
				<td><input name="age" type="text" value="" /></td>
			</tr>
			<tr>
				<td>Student Class Name:</td>
				<td><input name="classname" type="text" value="" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save Changes" /></td>
			</tr>
		</table>
	</form>
	<h1>
		<a href="studentDashBoardPage">Click here to return to the
			homepage</a>
	</h1>
</body>
</html>