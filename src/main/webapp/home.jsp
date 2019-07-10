<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>	
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<br>
		<br>
		<form action = "AddEmployees">
		<table>
			<tr> 
			<td>Id         :	<input type="text" name="id"><br></td>
			<td>Name       : 	<input type="text" name="name"><br></td>
			<td>Designation: 	<input type="text" name="designation"></td>
			</tr>	
			<tr>
			<td> <input type ="submit"> </td>
			</tr>
		</table>
		</form>
		
		<br>
		
		<form action = "view">		
			<label>Id          :</label>
			<input type="text" name="id"><br>		
			<input type ="submit" value ="SearchById">
		</form>
		
		<br>
		
		<form action = "delete">		
			<label>Id          :</label>
			<input type="text" name="id"><br>		
			<input type ="submit" value = "Delete">
		</form>
				
		<br>
		
		<form action = "cityview">		
			<label>Id          :</label>
			<input type="text" name="id"><br>		
			<input type ="submit" value = "View City">
		</form>
		
		<br>
		<button><a href="/addcity">Add City </a></button> 
		<br><br>
		<a href="/logout"> Logout </a>
</body>
</html>