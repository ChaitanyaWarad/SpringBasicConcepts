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
<form:form action="updateStudentInDB" modelAttribute="updatestudent">
		<table>
			<tr>
				<td><form:hidden path="studentid" /></td>
			</tr>
			<tr>
				<td>Student First Name:</td>
				<td><form:input path="firstname" /></td>
			</tr>
			<tr>
				<td>Student Last Name:</td>
				<td><form:input path="lastname" /></td>
			</tr>
			<tr>
				<td>Student Age:</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>Student Class Name:</td>
				<td><form:input path="classname" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update Student"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>