<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<h1> Please Login</h1>
${SPRING_SECURITY_LAST_EXCEPTION.message}
<form action="login" method = "POST">
  <div class="imgcontainer">
  </div>

  <div class="container">
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <button name = "submit" type="submit" value = "submit">Login</button>
  </div>

</form>

</body>
</html>