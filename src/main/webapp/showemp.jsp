<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">

<title>Employee details</title>
</head>
<body>
<h2>User Details: </h2>
		<h2> Employee details </h2> <br>
		<table>
			<tr>
				<td>Id: <input value="${employee.id}" readonly="readonly"></td>
				<td>Name       : <input value= "${employee.name}" readonly="readonly"></td>
				<td>Designation: <input value="${employee.designation}" readonly="readonly"></td>
			</tr>
		</table>
		
		</body>
		
</html>